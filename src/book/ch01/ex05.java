package book.ch01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            System.out.println("i 값 : " + i);
            i++;
        }
        System.out.println("종료된 후의 i 값 : " + i);
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
