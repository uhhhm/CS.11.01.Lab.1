import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println(age + " years old should read at least " + (100-age) + " before giving up on a book.");

    }
}
