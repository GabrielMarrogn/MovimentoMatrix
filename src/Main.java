import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int trai = 0;
            int trak = 0;
            int pokei = 0;
            int pokek = 0;
            int move = 0;

            int[][] arr = new int[a][b];

            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr[i].length; k++) {
                    arr[i][k] = sc.nextInt();
                    if (arr[i][k] == 1) {
                        trai = i;
                        trak = k;
                    } else if (arr[i][k] == 2) {
                        pokei = i;
                        pokek = k;
                    }
                }
            }

            if (trai > pokei) { // Se o treinador esta na frente
                while (trai != pokei) {
                    trai--;
                    move++;
                }
            } else if (trai < pokei) { // Se o treinador esta atraz
                while (trai != pokei) {
                    trai++;
                    move++;
                }
            }

            if (trak > pokek) { // Se o treinador esta na frente
                while (trak != pokek) {
                    trak--;
                    move++;
                }
            } else if (trak < pokek) { // Se o treinador esta atraz
                while (trak != pokek) {
                    trak++;
                    move++;
                }
            }

            System.out.println(move);
        }

        sc.close();
    }
}
