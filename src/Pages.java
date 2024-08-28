import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = -1;
        while(age < 0) {
            try {
                age = Integer.parseInt(scan.nextLine());
                if(age < 0){
                    System.out.println("Please enter a valid number!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a valid number!");
            }
        }
        System.out.println(age + " years old should read at least " + (100-age) + " before giving up on a book.");

    }
}
