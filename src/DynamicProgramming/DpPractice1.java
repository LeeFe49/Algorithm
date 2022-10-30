package DynamicProgramming;

public class DpPractice1 {
    /*
    정수 n이 주어졌을 때 아래의 연산을 통해 1로 만들려고 한다.
    - 2로 나누어 떨어지면 2로 나누기
    - 3으로 나누어 떨어지면 3으로 나누기
    - 1빼기
    위 연산을 통해 1로 만들 때 필요한 최소한의 연산 횟수 출력

    ex) 2 : 2 - 1 -> 1
        9 : 9 / 3 / 3 -> 2
        10 : 10 - 1 / 3 / 3 -> 3
     */
    public static int solution(int n) {
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }
}
