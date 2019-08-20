public class array {

    public static void main(String[]args){

        int[] angka = new int[10];
        angka[0] = 1;
        for (int i = 0; i <10; i++){
            angka[i] = i + 1;
        }
        for (int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
    }
}