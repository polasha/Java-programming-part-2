
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("Give a number:");
            int data = Integer.valueOf(scanner.nextLine());
            if (data == 0){
                break;
            } else if (data < 0){
                count = count +1;
            }
        }
        System.out.println("Number of negative numbers: "+count);

    }
}
