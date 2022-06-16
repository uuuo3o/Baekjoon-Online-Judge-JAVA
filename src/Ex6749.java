import java.util.Scanner;

public class Ex6749 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int youngest = scanner.nextInt();
        int middle = scanner.nextInt();
        scanner.close();

        int oldest = middle + (middle - youngest);

        System.out.println(oldest);
    }
}