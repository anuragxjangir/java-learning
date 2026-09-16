public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = { 10, 25, 30, 45, 50 };
        int target = 30;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println(target + " was found at index " + i);
                break;
            }
        }
    }
}
