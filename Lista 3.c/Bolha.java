import java.util.Scanner;

public class Bolha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome ou string:");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        String stringOrdenada = new String(chars);

        System.out.println("String ordenada: " + stringOrdenada);

        scanner.close();
    }
}
