package book.ch01;

// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하는 메서드
public class ex08 {
    static int sumof(int a, int b){
        int sum = 0;
        if(a<b){
            for(int i = 0; i<=(b-a); i++){
                sum += a+i;
            }
        } else {
            for(int i = 0; i<=(a-b); i++){
                sum += b+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumof(1,3));
    }
}
