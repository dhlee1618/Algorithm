package book.ch01;

import java.util.Scanner;

// 양의 정수를 입력받고 자릿수를 출력하는 프로그램 작성
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do {
            System.out.print("양의 정수를 입력해 주세요. > ");
            input = sc.nextInt();
        } while (input <= 0);

        int i = 1;
        boolean b = true;
        int tmp = input / 10;
        while (tmp > 0) {
            tmp = tmp / 10;
            i++;
        }
        System.out.printf("그 수는 %d자리입니다.%n", i);

    }
}
