import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int zero = 0;
        final  int ten = 10;

        int num = scanner.nextInt();
        boolean check = num < ten && num > zero;
        System.out.println(check);
    }
}