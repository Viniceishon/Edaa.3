import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();

        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
                "Breno Vinicius", "Vinícius Raphael",
                "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
                "Felipe dos Santos",
                "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
                "Henrique Cezar",
                "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
                "Marcus Paulo",
                "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Natália Isaltino",
                "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
                "Vinicius Garcia",
                "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves",
                "Lucas Marques",
                "Marcela Maria" };

        Random random = new Random();

        for (String nome : nomes) {
            int idade = random.nextInt(89);
            Pessoa pessoa = new Pessoa(nome, idade);
            listaPessoas.add(pessoa);
        }

        Collections.sort(listaPessoas);

        System.out.println("\nLista Ordenada:");
        for (Pessoa p : listaPessoas) {
            System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade());
        }
    }
}