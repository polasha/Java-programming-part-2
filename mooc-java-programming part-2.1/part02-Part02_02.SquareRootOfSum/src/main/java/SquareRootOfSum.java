
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data1 = Integer.valueOf(scanner.nextLine());
        int data2 = Integer.valueOf(scanner.nextLine());
        int sum = data1+data2;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);

    }
}
