import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int rating = 5;
        if (price <= 12 && rating == 5){
            System.out.println("Im interested in watching this movie");
        }else {
            System.out.println("I am not interested in watching this movie");
        }
        System.out.print("Enter the age \n");
        int age = sc.nextInt();
        int fare;
        if (age > 11){
            fare = 3;
        }else if(age > 11){
            if (age < 65){
                fare = 5;
            }
        }else {
            fare = 3;
        }
    }
}
