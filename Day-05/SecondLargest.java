public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 7, 89, 34 };
        int largest = numbers[0];
        int secondlargest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondlargest=largest;
                largest=numbers[i];
            }
            else if  (numbers[0] > secondlargest){
                secondlargest = numbers[i];
            }
            
            
        }
        System.out.println(secondlargest);
    }
}