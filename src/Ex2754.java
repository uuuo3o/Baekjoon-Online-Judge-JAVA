import java.util.Scanner;

public class Ex2754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        scanner.close();

        switch (grade) {
            case "A+" -> System.out.println("4.3");
            case "A0" -> System.out.println("4.0");
            case "A-" -> System.out.println("3.7");
            case "B+" -> System.out.println("3.3");
            case "B0" -> System.out.println("3.0");
            case "B-" -> System.out.println("2.7");
            case "C+" -> System.out.println("2.3");
            case "C0" -> System.out.println("2.0");
            case "C-" -> System.out.println("1.7");
            case "D+" -> System.out.println("1.3");
            case "D0" -> System.out.println("1.0");
            case "D-" -> System.out.println("0.7");
            case "F" -> System.out.println("0.0");
            default -> System.out.println("다시 입력해주세요.");
        }
    }
}
