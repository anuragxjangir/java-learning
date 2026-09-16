
public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 7, 89, 34 };
        int max = numbers[0];

        for(int i=0 ; i<numbers.length ; i++){
            
         if(numbers[i] > max){
         max=numbers[i];
        }
        }       
        System.out.println(max);
    }
}
