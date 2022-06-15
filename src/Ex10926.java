import java.util.Scanner;

public class Ex10926 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (input.length() > 50) {
            System.out.println("아이디는 50자 이상을 사용할 수 없습니다.");
            input = scanner.nextLine();
        }

        System.out.println(input + "??!");
    }
}
