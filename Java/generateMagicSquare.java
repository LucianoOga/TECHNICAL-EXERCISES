
public class generateMagicSquare{

    /**
     * 
     * Method that generates an nxn magic square as long as n is even.
     * Use the La Loubere method.
     * 
     */
    public static int[][] generateMagicSquare1(int n) {
        if (n % 2 == 1) {
            throw new IllegalArgumentException("El orden del cuadrado debe ser par.");
        }
    
        int[][] square = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;
    
        while (num <= n * n) {
            square[row][col] = num;
            num++;
        
            int tempRow = row;
            int tempCol = col;
        
            row--;
            col++;
        
            if (row < 0) {
                row = n - 1;
            }
            if (col == n) {
                col = 0;
            }
        
            if (square[row][col] != 0) {
                row = tempRow + 1;
                col = tempCol;
            if (row == n) {
                row = 0;
            }
        }
    
        //Swap the numbers in the symmetrical positions
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = square[i][j];
                square[i][j] = square[n - i - 1][j];
                square[n - i - 1][j] = temp;
            }
        }
    
        //Swap the numbers in the symmetrical positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = square[i][j];
                square[i][j] = square[i][n - j - 1];
                square[i][n - j - 1] = temp;
            }
        }
        return square;
    }


    /**
     * 
     * Method that generates an nxn magic square as long as n is odd.
     * Algorithm based on the Siamese method.
     * 
     */
    public static int[][] generateMagicSquare2(int n) {

        int[][] cuadradoMagico = new int[n][n];

        int fila = n - 1;
        int columna = n / 2;
        cuadradoMagico[fila][columna] = 1;

        for (int i = 2; i <= n * n; i++) {
            if (cuadradoMagico[(fila + 1) % n][(columna + 1) % n] == 0) {
                fila = (fila + 1) % n;
                columna = (columna + 1) % n;
            } else {
                fila = (fila - 1 + n) % n;
            }
            cuadradoMagico[fila][columna] = i;
        }

        return cuadradoMagico;
    }
}




