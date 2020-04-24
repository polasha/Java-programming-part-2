
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int data1 = Integer.valueOf(scanner.nextLine());
        int mul=1;
        for(int i=1;i<=data1;i++){
            mul= mul*i;
           
        }
        System.out.println("Factorial: "+mul);


    }
}
