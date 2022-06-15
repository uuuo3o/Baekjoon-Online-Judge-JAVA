import java.util.Scanner;

public class Ex1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int xMin = Math.min((w - x), x);
        int yMin = Math.min((h - y), y);

        System.out.println(Math.min(xMin, yMin));
    }
}