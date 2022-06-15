import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('!'); //Пробвах да използвам StringBuilder-а и .append, но ми го принтира на 1 ред
            }
            System.out.println();
        }
    }
}