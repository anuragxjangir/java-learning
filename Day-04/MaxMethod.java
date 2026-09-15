public class MaxMethod {
    public static void main(String[] args) {

        System.out.println(max(25, 40));

    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
