import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();

        String myText = read.replace('a', 'b');
        System.out.println(myText);
    }
}