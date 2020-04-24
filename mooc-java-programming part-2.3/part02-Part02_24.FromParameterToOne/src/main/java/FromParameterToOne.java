

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);


    }
    public static void printFromNumberToOne(int num) {
        int i=0;
        while(i<num){
            System.out.println(num-i);
            i++;
        } 
    }

}
