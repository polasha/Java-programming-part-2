
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        double sum=0;
        double count = 0;
        int countev = 0;
        int countodd = 0;
        while(true){
            int data = Integer.valueOf(scanner.nextLine());
            //System.out.println(data);
            if (data>0){
                sum = sum + data;
                count = count +1;
                
                if (data % 2 == 0){
                    countev = countev+1;
                }else {
                    countodd = countodd +1;
                }
            
                
            }
            
            if (data== -1){
                break;
            }
        }
        System.out.println("Thx! Bye!");
        
        System.out.println("Sum: "+ sum);
        System.out.println("Numbers: "+count);
        double avg= sum/count;
        System.out.println("Average:" + avg);
        System.out.println("Even: "+ countev);
        System.out.println("Odd: "+ countodd);
        
       

    }
}
