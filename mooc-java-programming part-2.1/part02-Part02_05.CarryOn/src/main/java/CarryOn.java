
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Carry on?");
        while(true){
            
            String input = scanner.nextLine();
            if (input.equals("no")){
                break;
            }
            System.out.println("Carry on?");
        }

    }
}
