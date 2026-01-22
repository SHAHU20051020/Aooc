import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        System.out.println("Enter matrix of 2*2 for a:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix of 2*2 for b:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter choice 1 for addition, 2 for multiplication, 3 for transpose");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        c[i][j] = a[i][j] + b[i][j];
                break

            case 2:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        for (int k = 0; k < 2; k++)
                            c[i][j] += a[i][k] * b[k][j];
                break;

            case 3:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        c[i][j] = a[j][i];
                break;
        }

        System.out.println("Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
