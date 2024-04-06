import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner objs = new Scanner(System.in);
        System.out.println("Hello, please enter the number of count: ");
        int count = objs.nextInt();
        int total = 0;

        for(int i = 1; i <= count; i++){
        System.out.println("Enter the number "+ i + ": ");
        int numbers = objs.nextInt();
        total = total + numbers;
        }
        System.out.println("The total of this sum is: " + total);
        objs.close();
    }
}
