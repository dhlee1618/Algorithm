package baekjoon;

import java.util.Scanner;

// N 입력받은 후 N단 출력
public class p08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n>9 || n < 1);
        for (int i = n; i < n+1; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d%n", i,j,i*j);
            }
        }
    }
}
