package Demo;

import java.util.ArrayList;
import java.util.List;

public class DemoDemo {
    public static void main(String[] args) {
        DemoDemo demo = new DemoDemo();
        List<Integer> list = demo.getAllPrimeNumber(299);
        System.out.println(list);

    }

    private List<Integer> getAllPrimeNumber(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = n; i > 1; i--) {
            boolean flag = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primes.add(i);
            }
        }
        return primes;
    }

}
