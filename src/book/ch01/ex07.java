package book.ch01;

import java.util.Scanner;

// 1부터 n까지의 합을 구하는 프로그램(가우스덧셈 사용)
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n의 값 : ");
        int n = sc.nextInt();
        int sum = 0;
        if(n%2 == 0){
            sum = (1 + n)*(n/2);
        } else {
            sum = (1 + n)*(n/2) + (1+n)/2;
        }
        System.out.println(n + "까지의 합 : " + sum);
    }
}
