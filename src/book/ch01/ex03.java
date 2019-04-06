package book.ch01;

// 네 값의 최솟값을 구하는 min4 메서드 작성
public class ex03 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(a>b && c>b && d>b) min = b;
        if(a>c && b>c && d>c) min = c;
        if(a>d && b>d && c>d) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println(min4(4,4,4,4));
    }
}
