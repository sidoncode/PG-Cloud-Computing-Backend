import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        /*
         *  Condition for programming
         */

        // Problem Statement -> check eligibity for college admission ( age > 18)

        System.out.println("Enter the age of the candidates");
        Scanner scanner1 = new Scanner(System.in);
        int age = scanner1.nextInt();

        if(age > 18){
            System.out.println("You are allowed for College admission");
        }else {
            System.out.println("You are not Allowed for College admission");
        }


    }


}