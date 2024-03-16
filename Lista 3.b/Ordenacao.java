import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de nomes a serem inseridos:");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite os nomes:");
        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            inserirOrdenado(listaNomes, nome);
        }

        System.out.println("\nNomes ordenados:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        scanner.close();
    }

    public static void inserirOrdenado(List<String> lista, String nome) {
        int posicao = 0;
        for (String nomeLista : lista) {
            if (nome.compareTo(nomeLista) < 0) {
                break;
            }
            posicao++;
        }
        lista.add(posicao, nome);
    }
}
