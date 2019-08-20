import java.util.Scanner;

public class matrixinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jumlah Baris");
        int baris = scan.nextInt();

        System.out.println("Masukan jumlah Kolom");
        int kolom = scan.nextInt();

        int[][] matrixinput = new int [baris][kolom];

        enterMatrixData(scan, matrixinput, baris, kolom);

        hasil(matrixinput, baris, kolom);
    }
        public static void enterMatrixData(Scanner scan , int[][] matrixinput, int baris, int kolom) {
            System.out.println("Masukan Data Matrix");
            for (int i = 0; i < baris; i++){
                for (int j = 0; j < kolom; j++){
                    matrixinput[i][j] = scan.nextInt();
                }
            }
            
           
                
            } 
            public static void hasil(int [][] matrixinput, int baris, int kolom) {
                System.out.println("matriks");

                for (int i= 0; i < baris; i++){
                    for (int j= 0; j < kolom; j++){
                        System.out.print(matrixinput[i][j]+"\t");

                    }

                    System.out.println();
                }
        }
}