package book.ch01;

import java.util.Scanner;
// 1 + 2 + 3 + ... + 7 = 28을 출력하는 프로그램
public class ex06 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n의 값 : ");
        // int n = sc.nextInt();
        int n = 7;
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum += i;
            if(i != n){
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }
        System.out.println(sum);
    }
}
