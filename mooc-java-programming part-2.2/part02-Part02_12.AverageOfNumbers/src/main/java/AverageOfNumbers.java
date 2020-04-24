
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while(true){
            System.out.println("Give a number:");
            int data = Integer.valueOf(scanner.nextLine());
            if (data == 0){
                break;
            } else{
                sum = sum + data;
                count = count +1;
            }
        }
        //System.out.println("Number of numbers: "+count);
        //System.out.println("Sum of the numbers: "+sum);
        double averageOfNumber = sum / count;
        System.out.println("Average of the numbers: "+ averageOfNumber);


    }
}
