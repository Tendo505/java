public class arrayTest {

    public static void main(String[] args) {
        int result = square (3); // CALL inside main
        System.out.println(result);
    }

    public static int square(int a) { // DEFINE outside main
        return a * a;
    }
}