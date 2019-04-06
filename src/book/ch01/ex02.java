package book.ch01;

// 세 값의 최솟값을 구하는 min3 메서드 작성
public class ex02 {
    static int min3(int a, int b, int c){
        int min = a;
        if(a>b && c>b) min = b;
        if(a>c && b>c) min = c;

        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(10,2,3));
    }
}
