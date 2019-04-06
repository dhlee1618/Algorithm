package book.ch01;

import java.util.Scanner;

// 입력받은 양의정수를 한 변으로하는 정사각형을 * 로 출력하시오
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.println("사각형을 출력합니다.");
        do {
            System.out.print("단 수 : ");
            input = sc.nextInt();
        } while (input <= 0);
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
