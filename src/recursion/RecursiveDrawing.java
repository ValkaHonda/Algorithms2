package recursion;

public class RecursiveDrawing {
    public static void main(String[] args) {
        draw(10);
        draw(2);
        draw(25);
        draw(4);
    }
    private static void draw(int n){
        if (n == 1){
            printSymbol('*',1);
            printSymbol('#',1);
            return;
        }
        printSymbol('*',n);
        draw(n-1);
        printSymbol('#',n);
    }
    private static void printSymbol(char symbol, int n){
        for(int i = 0; i < n; i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}
