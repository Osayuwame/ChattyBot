import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = h1 >= h2 && h2 >= h3;
        boolean ascOrdered = h1 <= h2 && h2 <= h3;
        boolean samOrdered = h1 == h2 || h2 == h3;

        boolean result = descOrdered || ascOrdered && samOrdered;
        System.out.println(result);

    }
}