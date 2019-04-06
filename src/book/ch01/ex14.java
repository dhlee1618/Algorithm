package book.ch01;

import java.util.Scanner;

public class ex14 {
    // 왼쪽 아래가 직각인 이등변 삼각형
    static void triangleLB(int n) {
        System.out.println("triangleLB");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변 삼각형
    static void triangleLU(int n) {
        System.out.println("triangleLU");
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 이등변 삼각형
    static void triangleRU(int n) {

    }


    // 오른쪽 아래가 직각인 이등변 삼각형
    static void triangleRB(int n) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        do {
            System.out.print("? : ");
            input = sc.nextInt();
        } while (input <= 0);

        //triangleLB(input);
        //triangleLU(input);
        //triangleRU(input);
        //triangleRB(input);
    }
}
