import java.util.Scanner;

public class palindromicnumberpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
