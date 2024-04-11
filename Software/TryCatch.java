import java.util.InputMismatchException;
import java.util.Scanner;

class TryCatch{
    public static void main(String args[]){
        int age = 0;
        boolean validInput = false;
        Scanner objs = new Scanner(System.in);
        
        while(!validInput){
            try{
                System.out.println("Enter your age:");
                age = objs.nextInt();
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Wrong input. Just numbers are allowed");
                objs.next();
            }
        }
        System.out.println("Your age is: "+ age);
        objs.close();
    }
}