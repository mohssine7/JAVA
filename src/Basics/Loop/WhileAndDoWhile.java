package Basics.Loop;

public class WhileAndDoWhile {


    public static void whileLoop(Boolean isValid) {
        int i = 1;
        if (isValid) {
            while (isValid) {
                if (i <= 3) {
                    System.out.println("Check N°" + i);
                } else {
                    isValid = false;
                }
                i++;
            }
            System.out.println("the checking has been done");
        } else {
            System.out.println("Mohssine is not Valid");
        }
    }

    public static void doWhileLoop(Boolean isValid) {
//        do{
//            System.out.println("Mohssine is under checking");
//
//        }while (isValid);
    }

    public static void main(String[] args) {
        // Do-While Basics.Loop
        whileLoop(true);
    }
}
