package DynamicProgramming;
/*
-타뷸레이션
    - 상향식 접근 방법
    - 작은 하위 문제부터 풀면서 올라감
    - 모두 계싼하면서 차례대로 진행

-메모이제이션
    - 하향식 접근 방법
    - 큰 문제에서 하위 문제를 확인해가며 진행
    - 계산이 필요한 순간 계산하며 진행
 */
public class DP {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibDPTabulation(int n) {
        int[] dp = new int [n < 2 ? 2 : n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    static int[] dp = new int[8];
    public static int fibDPMemoization(int n) {
        if (n <= 2) {
            return 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fibDPMemoization(n - 1) + fibDPMemoization(n - 2);
        return dp[n];
    }
}
