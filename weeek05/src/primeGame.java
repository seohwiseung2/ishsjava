import java.util.Scanner;


public class primeGame {
    //public static boolean(int n);



    public static void main(String[] args) {
        //System.out.println(Math.sqrt(25.0)); //수학기호 불러오는법 루트



        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int number = sc.nextInt();
        if(number <= 1) {
            isPrime = false;
        } else {


            for (int i = 2; i <= Math.sqrt(number); i = i + 1) {
                if (number % i == 0) {
                    isPrime = false; //counter = counter + 1
                    break;
                }
                System.out.print(i + " ");
            }
            if (isPrime) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}
