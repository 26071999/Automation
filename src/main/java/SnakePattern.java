import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k = 0; k < T; k++) {
            int N = sc.nextInt();
            int M = N;
            int arr[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            snakePattern(arr, N, M);
        }
    }
    private static void snakePattern(int[][] arr,int N,int M) {

        int arr1[][] = new int[N][M];
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    arr1[i][j] = arr[i][j];
                }
            } else if (i % 2 != 0) {
                for (int j = N - 1, k = 0; j >= 0 && k < N; j--, k++) {
                    arr1[i][k] = arr[i][j];
                }
            }
        }
        for (int[] a : arr1)
            for (int b : a)
                System.out.print(b + " ");
        System.out.println();
    }
}
