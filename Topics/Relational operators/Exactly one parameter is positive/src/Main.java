import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int zero = 0;

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean part1 = num1 > zero;
        boolean part2 = num2 > zero;
        boolean part3 = num3 > zero;

        boolean result =
                (part1 && !part2 && !part3) ||
                (part2 && !part1 && !part3) ||
                (part3 && !part1 && !part2);

        System.out.println(result);


    }
}