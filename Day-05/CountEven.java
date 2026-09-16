public class CountEven {
    public static void main(String[] args) {
        int[] numbers = { 12, 7, 4, 19, 20, 33, 8 };
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                count++;

            }
        }
        System.out.println(count);
    }
}
