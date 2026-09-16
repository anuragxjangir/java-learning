public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        int[] no = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < no.length; i++) {
            sum = sum + no[i];
        }
        System.out.println(sum);
    }
}
