
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number?");
        int data1 = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number?");
        int sum = 0;
        int data2 = Integer.valueOf(scanner.nextLine());

        for(int i=data1;i<=data2;i++){
            sum= sum+i;
        }
        System.out.println("The sum is "+sum);

    }
}
