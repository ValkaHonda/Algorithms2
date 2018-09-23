package recursion;

public class RecursiveArraySum {
    public static void main(String[] args) {
        int[] array = {2,4,10,20,30,10};
        System.out.println("The sum of array's elements is == "+sum(array,0));
    }
    private static int sum(int[] numbers, int index){
        if (index == numbers.length-1) {
            return numbers[numbers.length-1];
        }
        return numbers[index] + sum(numbers,index+1);
    }
}

