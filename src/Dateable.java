import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println(age + " years old should be date somebody who is at least " + (age/2+7) + " years old.");


    }
}
