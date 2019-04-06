package book.ch01;

// 주어진 세 값 중 중앙값을 구하는 메서드
public class ex04 {

    static int median(int a, int b, int c){
        int median = a;
        median = getMedian(a, b, c, median, b >= c, a >= c, c >= b);
        median = getMedian(b, c, a, median, b>=a, c>=a, a>=b);
        return median;
    }

    private static int getMedian(int a, int b, int c, int median, boolean b2, boolean b3, boolean b4) {
        if(a>=b && b2) median = b;
        if(b3 && b4) median = c;
        if(b>=a && a>=c) median = a;
        return median;
    }


    public static void main(String[] args) {
        System.out.println(median(1,2,3));
    }
}

/*
if((b>=a && a>=c) || (b<=aa && a<=c)) return a;
if((a>b && b>c) || (a<b && b<c)) return b;
return c;
메서드가

if(a>=b)
    if(b>=c) return b;
    else if (a<=c)return a;
    else return c;
else if(a>c) return a;
else if(b>c) return c;
else return b;

보다 효율이 떨어지는 이유
:
 */