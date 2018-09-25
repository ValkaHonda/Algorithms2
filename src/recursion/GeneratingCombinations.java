package recursion;

public class GeneratingCombinations {
    public static void main(String[] args) {
        int[] set = {1, 2, 3, 4};
        int border = 2;
        int[] vector = new int[border];
        generateCombinations(set, vector, 0, border);
    }

    private static void generateCombinations(int[] set, int[] vector, int index, int border){
        if (index > vector.length){
            printArray(vector);
            return;
        }
        for (int i = border; i < set.length; i++){
            
        }


    }

    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
