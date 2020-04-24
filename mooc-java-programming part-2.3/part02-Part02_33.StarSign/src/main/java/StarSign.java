
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        int count = 1;
        while (count <= number){
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int countsq = 1;
        for (int i =1; i<=size; i++ ){
            while (countsq <= size){
                System.out.print("*");
                countsq++;
            }
            System.out.println("");
            countsq=1;
            
        }
       
            
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int countRec = 1;
        for (int i =1; i<=height; i++ ){
            while (countRec <= width){
                System.out.print("*");
                countRec++;
            }
            System.out.println("");
            countRec=1;
            
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int countTri = 1;
        for (int i = 1; i <= size; i ++){
            while (countTri <= i ){
                System.out.print("*");
                countTri++;
            }
            System.out.println("");
            countTri = 1;
        }
        
        
        
    }
}
