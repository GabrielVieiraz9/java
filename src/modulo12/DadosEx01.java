package modulo12;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class DadosEx01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao;
        boolean continuar = true;
        String menu, nome;

        do {

            System.out.println("******************************************************************\n");
            System.out.println("1 - Adicionar Cliente na Fila\n");
            System.out.println("2 - Listar todos os Clientes\n");
            System.out.println("3 - Retirar Cliente da Fila\n");
            System.out.println("0 - Sair\n");
            System.out.println("******************************************************************\n");
            System.out.println("Entre com a opção desejada: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada no buffer

            // Switch case
            switch (opcao) {

                case 0:
                    System.out.println("Programa encerrado!");
                    continuar = false;
                    break;

                case 1:
                    System.out.println("-----Adicionar Cliente na Fila-----\nDigite o nome:");
                    nome = scanner.nextLine();
                    fila.offer(nome);
                    System.out.println("Cliente " + nome + " adicionado na fila.\n");
                    System.out.println("Deseja continuar? (S/N)");
                    menu = scanner.next();
                    if (!menu.equalsIgnoreCase("S")) {
                        continuar = false;
                    }
                    break;

                case 2:
                    System.out.println("-----Listar todos os Clientes-----\n");
                    if (fila.isEmpty()) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    System.out.println("Deseja continuar? (S/N)");
                    menu = scanner.next();
                    if (!menu.equalsIgnoreCase("S")) {
                        continuar = false;
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        System.out.println("-----Retirar Cliente da Fila-----\\n");
                        System.out.println("Digite o nome:");
                        nome = scanner.nextLine();
                        boolean clienteRemovido = fila.remove(nome);
                        if (clienteRemovido) {
                            System.out.println("Cliente " + nome + " retirado da fila.");
                        } else {
                            System.out.println("Cliente " + nome + " não encontrado na fila.");
                        }
                    }
                    System.out.println("Deseja continuar? (S/N)");
                    menu = scanner.next();
                    if (!menu.equalsIgnoreCase("S")) {
                        continuar = false;
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    System.out.println("Deseja continuar? (S/N)");
                    menu = scanner.next();
                    if (!menu.equalsIgnoreCase("S")) {
                        continuar = false;
                    }
            }
            System.out.flush();
        } while (continuar);

        scanner.close(); // Fechando o scanner
    }

}
