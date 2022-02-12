import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myText = scanner.nextLine();

        System.out.println(myText.toUpperCase().startsWith("J"));
    }
}