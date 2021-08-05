import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose = -1;
        int width;
        int height;
        Scanner scanner = new Scanner(System.in);
        while (choose != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Your Choose ?");
            choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("1. Print the rectangle");
                    System.out.println("Enter width");
                    width = scanner.nextInt();
                    System.out.println("Enter height");
                    height = scanner.nextInt();
                    for (int j = 1; j <= height; j++) {
                        System.out.println("");
                        for (int i = 1; i <= width; i++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("2. Print the square triangle");
                    System.out.println("Enter height");
                    height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        System.out.println("");
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("3. Print isosceles triangle");
                    System.out.println("Enter height");
                    height = scanner.nextInt();
                    for (int i = height; i >= 1; i--) {
                        System.out.println("");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    break;
                }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choose");
            }
        }
    }
}