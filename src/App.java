import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) {
        int number, balance;
        int sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap vao mot so nguyen duong: ");
            number = scanner.nextInt();
             
            while (number <= 0) {
                System.out.println("nhap lai: ");
                number = scanner.nextInt();
            }
        }
         
        while (number > 0) {
            balance = number % 10;
            sum += balance;
            number /= 10;
        }
         
        System.out.println("Tong cac chu so 6 = " + sum);
    }
 
}