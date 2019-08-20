import java.util.Scanner;

public class matrixinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jumlah Baris");
        int baris = scan.nextInt();

        System.out.println("Masukan jumlah Kolom");
        int kolom = scan.nextInt();

        int[][] matrixinput = new int [baris][kolom];
        int[][] matrixinput2 = new int [baris][kolom];

        enterMatrixData(scan, matrixinput, matrixinput2, baris, kolom);

        hasil(matrixinput, matrixinput2, baris, kolom);
    }
        public static void enterMatrixData(Scanner scan , int[][] matrixinput, int[][] matrixinput2, int baris, int kolom) {
            System.out.println("Masukan Data Matrix 1");
            for (int i = 0; i < baris; i++){
                for (int j = 0; j < kolom; j++){
                    matrixinput[i][j] = scan.nextInt();
                }
            }
            System.out.println("Masukan Data Matrix 2");
                for (int i = 0; i < baris; i++){
                    for (int j = 0; j < kolom; j++){
                        matrixinput2[i][j] = scan.nextInt();
                    }
                }
        }    
                
                
 
            public static void hasil(int[][] matrixinput,int[][] matrixinput2, int baris, int kolom) {
                System.out.println("matriks");
                int[][] hasil = new int[baris][kolom];
                for (int i= 0; i < baris; i++){
                    for (int j= 0; j < kolom; j++){
                        hasil[i][j] = matrixinput[i][j]+matrixinput2[i][j];
                        System.out.print(hasil[i][j]+"\t");

                    }

                    System.out.println();
                }
        }
}