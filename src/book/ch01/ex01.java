package book.ch01;

// 네 값의 최대값을 구하는 max4 메서드 작성
public class ex01 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(a<b && c<b && d<b) max = b;
        if(a<c && b<c && d<c) max = c;
        if(a<d && b<d && c<d) max = d;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max4(1,4,2,3));
    }
}
