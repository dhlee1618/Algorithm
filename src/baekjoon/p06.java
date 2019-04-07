package baekjoon;

import java.util.Scanner;

// 입력받은 숫자 출력하기
public class p06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n > 100000);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
