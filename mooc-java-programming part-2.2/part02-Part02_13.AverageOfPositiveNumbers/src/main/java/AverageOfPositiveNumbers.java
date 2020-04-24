
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
      
        while(true){
            //System.out.println("Give a number:");
            int data = Integer.valueOf(scanner.nextLine());
            if (data == 0){
                
                break;
                
            }else if (data>0){
                sum = sum + data;
                count = count +1;
            }
        }
        if(sum >0){
            double averageOfNumber = sum / count;
            System.out.println(averageOfNumber);
        }else{
            System.out.println("Cannot calculate the average");
        }
       
        
        
      
        //System.out.println("Number of numbers: "+count);
        //System.out.println("Sum of the numbers: "+sum);
        
        


    }
    
   
}
   
