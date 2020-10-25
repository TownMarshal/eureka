package Test;

import java.util.*;

/**
 * Created by Administrator on 2020/8/7 0007.
 */
public class shudu333 {



        private char[][] board;
        private Map<Integer, List<Character>> unsolve = new TreeMap<>();
        private int round = 0;
        private final int SUCCESS = 1;
        private final int FAIL = -1;
        private final int UNDONE = 0;

        private static List<char[][]> solvedBoards = new ArrayList<>();

        public shudu333(char[][] board) {
            this.board = board;
            System.out.println("Input:");
            printBoard();
            final List<Character> initChars = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
            for (int y = 0; y < board.length; y++) {
                char[] chars = board[y];
                for (int x = 0; x < chars.length; x++) {
                    char aChar = chars[x];
                    if (aChar == '.') {
                        unsolve.put(y * 9 + x, new ArrayList<>(initChars));
                    }
                }
            }
        }

        public int solve() {
            round++;
            System.out.println("==========================[Start round " + round + "]==============================");
            boolean change = false;
            //进行唯一余数法
            for (Integer integer : unsolve.keySet()) {
                boolean thisChange = false;
                List<Character> resX = checkX(integer);
                if (resX.size() > 0) {
                    thisChange = true;
                }
                List<Character> resY = checkY(integer);
                if (resY.size() > 0) {
                    thisChange = true;
                }
                List<Character> resC = checkCube(integer);
                if (resC.size() > 0) {
                    thisChange = true;
                }
                if (thisChange) {
                    change = true;
                    System.out.println(integer + " removed:" + resX + resY + resC);
                }
            }
            List<Integer> needRemove = new ArrayList<>();
            for (Integer integer : unsolve.keySet()) {
                List<Character> integers = unsolve.get(integer);
//            System.out.println(integer + ":" + integers.toString());
                if (integers.size() == 1) {
                    System.out.println("new num solved:" + integer);
                    board[integer / 9][integer % 9] = integers.get(0);
                    needRemove.add(integer);
                }
                if (integers.size() == 0) {
                    System.out.println("该图无解");
                    return FAIL;
                }
            }
            for (Integer integer : needRemove) {
                unsolve.remove(integer);
            }
            //进行摒除法
            for (char i = '1'; i <= '9'; i++) {
                boolean thisChange = checkNumX(i);
                if (thisChange) change = true;
            }
            if (change) {
                return solve();
            } else {
                System.out.println("==============================================");
                if (unsolve.size() > 0) {
                    System.out.println("该图未获得解,目前结果：");
//                printUnsolved();
                    printBoard();
                    return UNDONE;
                } else {
                    boolean valid = isValidSudoku(board);
                    if (valid) {
                        System.out.println("该图得到一个解:");
                        printBoard();
                        solvedBoards.add(board);
                        return SUCCESS;
                    } else {
                        System.out.println("该图无解");
                        return FAIL;
                    }
                }
            }
        }

        private List<Character> checkX(int n) {
            int getY = n / 9;
            List<Character> exist = new ArrayList<>();
            List<Character> removed = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                char c = board[getY][i];
                if (c != '.') {
                    exist.add(c);
                }
            }
            List<Character> integers = unsolve.get(n);
            for (Character character : exist) {
                if (integers.remove(character)) {
                    removed.add(character);
                }
            }
//        System.out.println(n + ":" + integers);
            return removed;
        }

        private List<Character> checkY(int n) {
            int getX = n % 9;
            List<Character> exist = new ArrayList<>();
            List<Character> removed = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][getX];
                if (c != '.') {
                    exist.add(c);
                }
            }
            List<Character> integers = unsolve.get(n);
            for (Character character : exist) {
                if (integers.remove(character)) {
                    removed.add(character);
                }
            }
//        System.out.println(n + ":" + integers);
            return removed;
        }

        private List<Character> checkCube(int n) {
            int startY = n / 9 / 3 * 3;
            int startX = (n % 9) / 3 * 3;
            List<Character> exist = new ArrayList<>();
            List<Character> removed = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    Character c = board[startY + j][startX + k];
                    if (c != '.') {
                        exist.add(c);
                    }
                }
            }
            List<Character> integers = unsolve.get(n);
            for (Character character : exist) {
                if (integers.remove(character)) {
                    removed.add(character);
                }
            }
//        System.out.println(n + ":" + integers);
            return removed;
        }

        private boolean checkNumX(char c) {
            int count = 0;
            boolean change = false;
            for (int y = 0; y < 9; y++) {
                boolean found = false;
                List<Integer> poss = new ArrayList<>();
                for (int x = 0; x < 9; x++) {
                    if (board[y][x] == c) {
                        found = true;
                        break;
                    }
                    if (board[y][x] == '.') {
                        int num = y * 9 + x;
                        List<Character> characters = unsolve.get(num);
                        if (characters.contains(c)) {
                            poss.add(num);
                        }
                    }
                }
                if (found) {
                    count++;
                } else {
                    System.out.println("solve " + c + " in line " + y + ",possible num is:" + poss);
                    if (poss.size() == 1) {
                        int integer = poss.get(0);
                        System.out.println("new num solved:" + c);
                        board[integer / 9][integer % 9] = c;
                        unsolve.remove(integer);
                        change = true;
                    }
                }
            }
            System.out.println("数字" + c + "已解出:" + count);
            return change;
        }

        private void printBoard() {
            for (char[] chars : board) {
                for (char aChar : chars) {
                    System.out.print(" " + aChar + " ");
                }
                System.out.println();
            }
        }

        private void printUnsolved() {
            for (Integer integer : unsolve.keySet()) {
                List<Character> integers = unsolve.get(integer);
                System.out.println(integer + ":" + integers.toString());
            }
        }

        public int recursion() {
            int status = solve();
            if (status == UNDONE) {
                System.out.println("准备开始新一轮求解");
                List<char[][]> boards = findPossBoard();
                for (char[][] board : boards) {
                    shudu333 s = new shudu333(board);
                    int newStatus = s.recursion();
                }
                return SUCCESS;
//            return recursion();
            } else {
                return status;
            }
        }

        private List<char[][]> findPossBoard() {
            List<char[][]> res = new ArrayList<>();
            int smallSize = Integer.MAX_VALUE;
            int smallIndex = 0;
            for (Integer integer : unsolve.keySet()) {
                List<Character> integers = unsolve.get(integer);
                if (integers.size() < smallSize) {
                    smallSize = integers.size();
                    smallIndex = integer;
                }
            }

            List<Character> cases = unsolve.get(smallIndex);
            System.out.println("选定的猜测位置为：" + smallIndex + "，可能值为：" + cases.toString());
            for (Character aCase : cases) {
                char[][] newBoard = new char[9][9];
                for (int i = 0; i < 9; i++) {
                    System.arraycopy(board[i], 0, newBoard[i], 0, 9);
                }
                newBoard[smallIndex / 9][smallIndex % 9] = aCase;
                res.add(newBoard);
            }
            return res;
        }

        public void printAllSolution() {
            System.out.println("\n*****************以下是所有可能的结果*********************\n");
            for (char[][] solvedBoard : solvedBoards) {
                for (char[] chars : solvedBoard) {
                    for (char aChar : chars) {
                        System.out.print(" " + aChar + " ");
                    }
                    System.out.println();
                }
                System.out.println("===========================");
            }
        }

        public boolean isValidSudoku(char[][] board) {
            List<Map<Character, Integer>> xList = new ArrayList<>();
            List<Map<Character, Integer>> yList = new ArrayList<>();
            List<Map<Character, Integer>> cList = new ArrayList<>();
            for (int x = 0; x < 9; x++) {
                xList.add(new HashMap<>());
                yList.add(new HashMap<>());
                cList.add(new HashMap<>());
            }
            for (int x = 0; x < 9; x++) {
                for (int y = 0; y < 9; y++) {
                    char val = board[y][x];
                    if (val == '.') continue;
                    //validate y
                    if (yList.get(x).get(val) == null) {
                        yList.get(x).put(val, 1);
                    } else {
                        System.out.println("check y:board[" + y + "][" + x + "] can't match");
                        return false;
                    }
                    //validate x
                    if (xList.get(y).get(val) == null) {
                        xList.get(y).put(val, 1);
                    } else {
                        System.out.println("check x:board[" + y + "][" + x + "] can't match");
                        return false;
                    }
                    //validate cube
                    int cubeIndex = y / 3 * 3 + x / 3;
                    if (cList.get(cubeIndex).get(val) == null) {
                        cList.get(cubeIndex).put(val, 1);
                    } else {
                        System.out.println("check cube:board[" + y + "][" + x + "] can't match");
                        return false;
                    }
                }
            }
            return true;
        }
    }
