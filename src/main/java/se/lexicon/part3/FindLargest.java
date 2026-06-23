package se.lexicon.part3;

public class FindLargest {
    public static void main(String[] args) {
        int[] numbers = {14, 3, 78, 45, 22, 91, 7, 56};

        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        IO.println(maxNumber);
    }
}
