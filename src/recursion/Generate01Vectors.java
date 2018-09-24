package recursion;

public class Generate01Vectors {
    public static void main(String[] args) {
        int[] vector1 = new int[4];
        generateBinaryVector(vector1,0);
        System.out.println();

        int[] vector2 = new int[6];
        generateBinaryVector(vector2,0);
        System.out.println();

        int[] vector3 = new int[8];
        generateBinaryVector(vector3,0);
        System.out.println();

        int[] vector4 = new int[10];
        generateBinaryVector(vector4,0);
        System.out.println();
    }
    private static void generateBinaryVector(int[] vector, int index){
        if (vector.length-1 < index){
            printArray(vector);
            return;
        }
        for (int i = 0; i < 2; i++){
            vector[index] = i;
            generateBinaryVector(vector,index+1);
        }
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
