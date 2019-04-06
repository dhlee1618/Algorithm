package book.ch01;

// ex11 을 덧셈표로 바꾸시오
public class ex12 {
    public static void main(String[] args) {
        System.out.println("  ㅣ  1   2   3   4   5   6   7   8   9");
        System.out.println("--+-----------------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d %s ", i, "ㅣ");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%2d  ", i + j);
            }
            System.out.println();
        }
    }
}
