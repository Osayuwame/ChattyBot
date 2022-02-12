import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        boolean triangle = numA + numB > numC &&
                numA + numC > numB && numC + numB > numA;

        if (triangle) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}