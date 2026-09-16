public class CountPositiveNegative {
    public static void main(String[] args) {

        int positive = 0;
        int negative = 0;
        int[] numbers = { 10, -5, 8, -2, 0, 15, -7 };

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0){
                negative++;
            }
        }
        System.out.println("positive : " + positive);
        System.out.println("negative : " + negative);
    }
}
