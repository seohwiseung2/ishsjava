import java.util.Scanner;


public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("분모 입력 : ");

        int denominator = scanner.nextInt();
        System.out.print("분자 입력 : ");
        int numerator = scanner.nextInt();

        System.out.println(numerator/denominator);


    }


}
