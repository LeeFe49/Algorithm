package DynamicProgramming;

import static DynamicProgramming.DP.*;

public class DPMain {
    public static void main(String[] args) {
        System.out.println("origin fib: " + fib(7));
        System.out.println("memoization fib: " + fibDPMemoization(7));
        System.out.println("tabulation fib: " + fibDPTabulation(7));

        System.out.println(DpPractice1.solution(2));
        System.out.println(DpPractice1.solution(4));
        System.out.println(DpPractice1.solution(9));
        System.out.println(DpPractice1.solution(10));

    }
}
