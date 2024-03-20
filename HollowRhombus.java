import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces for the left side of the rhombus
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars for the first and last rows
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}
