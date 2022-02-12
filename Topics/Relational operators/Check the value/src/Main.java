import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ten = 10;

        int num = scanner.nextInt();
        boolean check = num < ten;
        System.out.println(check);
    }
}