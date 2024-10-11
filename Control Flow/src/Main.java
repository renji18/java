import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number == 10) System.out.println("Number is 10");
        else System.out.println("Number is not 10");

        switch (number) {
            case 100 -> System.out.println("Number is 100");
            case 150 -> System.out.println("Number is 150");
            default -> System.out.println("Unexpected value: " + number);
        }

        for (int i = 0; i <= 10; i++){
            if(i == 7) break;
            if(i == 3) continue;
            System.out.println(i);
        }

        while(number > 0){
            System.out.println(number--);
        }

        do {
            System.out.println(--number);
        } while (number > 500);
    }
}
