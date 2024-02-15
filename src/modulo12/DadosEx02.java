package modulo12;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class DadosEx02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        
        int opcao;
        boolean continuar = true;
        String menu, nome;

        do {
            System.out.println("******************************************************************\n");
            System.out.println("1 - Adicionar Livro na pilha\n");
            System.out.println("2 - Listar todos os Livros\n");
            System.out.println("3 - Retirar Livro da pilha\n");
            System.out.println("0 - Sair\n");
            System.out.println("******************************************************************\n");
            System.out.println("Entre com a opção desejada: ");
            opcao = scanner.nextInt();

            // Consumir a nova linha deixada no buffer após a leitura do número da opção
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Programa encerrado!");
                    continuar = false;
                    break;

                case 1:
                    System.out.println("-----Adicionar Livro na pilha-----\nDigite o nome do livro:");
                    nome = scanner.nextLine(); // Use nextLine() para ler toda a linha
                    pilha.push(nome); // Adiciona o livro no topo da pilha
                    System.out.println("Livro '" + nome + "' adicionado na pilha.");
                    break;

                case 2:
                    System.out.println("Listar todos os Livros:");
                    if (pilha.isEmpty()) {
                        System.out.println("Não há livros cadastrados.");
                    } else {
                        ArrayList<String> listaAuxiliar = new ArrayList<>();
                        for (String livro : pilha) {
                            listaAuxiliar.add(livro);
                        }
                        for (int i = listaAuxiliar.size() - 1; i >= 0; i--) {
                            System.out.println(listaAuxiliar.get(i));
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        System.out.println("Retirar Livro da pilha:");
                        System.out.println("Digite o nome:\n");
                        nome = scanner.nextLine();
                        if (pilha.remove(nome)) {
                            System.out.println("Livro '" + nome + "' retirado da pilha.");
                        } else {
                            System.out.println("Livro '" + nome + "' não encontrado na pilha.");
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja voltar para o menu? (S/N)");
            menu = scanner.nextLine();
            if (!menu.equalsIgnoreCase("S")) {
                continuar = false;
            }
        } while (continuar);

        scanner.close(); // Fechando o scanner
    }
}
