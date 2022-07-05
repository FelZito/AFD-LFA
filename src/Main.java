import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> palavrasAceitas = new ArrayList<>();
        String[] alfabeto = {"abcbab", "abcabc"};

        int op = -1;
        while (true) {
            System.out.println("|| ANALISADOR DE PALAVRAS || \n" +
                    "1 - INFORMAR PALAVRA \n" +
                    "2 - LISTAR PALAVRAS ACEITAS \n" +
                    "3 - SAIR");
            System.out.println("Informe a opcao desejada: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    String palavra;
                    System.out.println("Informe a palavra: ");
                    leitor.nextLine();
                    palavra = leitor.nextLine();

                    if (palavra.equals(alfabeto[0]) || palavra.equals(alfabeto[1])) {
                        System.out.println("Palavra aceita!");
                        palavrasAceitas.add(palavra);
                    } else {
                        System.out.println("Palavra rejeita!");
                    }
                    System.out.println("Pressione uma tecla para continuar...");
                    leitor.nextLine();
                    break;


                case 2:
                    if (palavrasAceitas.size() == 0) {
                        System.out.println("Nenhuma palavra aceita a ser listada!");
                        break;
                    }

                    //Imprime lista de palavras aceitas
                    System.out.println("\n||| PALAVRAS ACEITAS |||");
                    for (String aceita : palavrasAceitas) {
                        System.out.println("-> " + aceita);
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    System.exit(1);
                    break;

                default:
                    System.out.println("Informe uma opcao valida!");
                    break;
            }
        }
    }
}
