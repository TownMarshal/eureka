package JingDianSuanFa;

public class StackByArray {



    public static void main(String[] args){
        Stack stack = new Stack(10);
        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        stack.push("dd");

        System.out.println(stack.pop());

        stack.printStack();
    }


    static class Stack {
        public int maxsize = 20;

        public int length = 0;

        public int initCapacity = 10;

        public String[] arr = null;
        public int top = -1;

        //有参初始化
        public Stack(int length) {
            if (length > maxsize) {
                this.length = maxsize;
                arr = new String[maxsize];
            } else {
                this.length = length;
                arr = new String[length];
            }
        }

        //无参初始化
        public Stack() {
            arr = new String[initCapacity];
        }

        //添加操作
        public String[] push(String str) {
            arr[++top] = str;
            return arr;
        }

        //弹出操作
        public String pop() {
            String str = arr[top];
            arr[top] = "";
            top--;
            return str;
        }

        //打印操作
        public void printStack() {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
