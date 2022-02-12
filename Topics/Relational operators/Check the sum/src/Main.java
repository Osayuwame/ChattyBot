import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        final int checkers = 20;

        boolean sum = a + b == checkers || b + c == checkers || c + a == checkers;
        System.out.println(sum);
    }
}