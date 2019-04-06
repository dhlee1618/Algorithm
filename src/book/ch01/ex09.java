package book.ch01;

import java.util.Scanner;

// a,b를 입력 받고 b - a를 출력하는 프로그램 단, a>=b 면 b를 다시 입력 받음
public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("a의 값 : ");
        a = sc.nextInt();
        do {
            System.out.print("b의 값 : ");
            b = sc.nextInt();
            if(a>=b) System.out.println("a보다 큰 값을 입력해 주세요");
        } while (a >= b);
        System.out.printf("b - a는 %d입니다.%n", (b-a));
    }
}
