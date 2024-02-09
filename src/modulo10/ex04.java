package modulo10;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int desenvolvedoresBackend = 0;
        int mulheresCisTransFrontend = 0;
        int homensCisTransMobileMais40 = 0;
        int naoBinariosFullStackMenores30 = 0;
        int somaIdades = 0;
        String opcao = null;

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Identidade de Gênero: ");
            System.out.println("1 – Mulher Cis");
            System.out.println("2 – Homem Cis");
            System.out.println("3 – Não Binário");
            System.out.println("4 – Mulher Trans");
            System.out.println("5 – Homem Trans");
            System.out.println("6 – Outros");
            int genero = scanner.nextInt();

            System.out.println("Tipo de desenvolvedor: ");
            System.out.println("1 – Backend");
            System.out.println("2 – Frontend");
            System.out.println("3 – Mobile");
            System.out.println("4 – FullStack");
            int desenvolvedor = scanner.nextInt();

            totalPessoas++;
            somaIdades += idade;

            if (desenvolvedor == 1) {
                desenvolvedoresBackend++;
            }

            if ((genero == 1 || genero == 4) && desenvolvedor == 2) {
                mulheresCisTransFrontend++;
            }

            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
                homensCisTransMobileMais40++;
            }

            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
                naoBinariosFullStackMenores30++;
            }

            System.out.println("Deseja continuar? (S/N)");
            opcao = scanner.next();
            
            // Exibir as estatísticas apenas se o usuário digitar 'N' ou 'n'
            if (opcao.equalsIgnoreCase("S")) {
            	continuar = true;
            } else {
            	continuar = false;
                System.out.println("Número de pessoas desenvolvedoras Backend: " + desenvolvedoresBackend);
                System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisTransFrontend);
                System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisTransMobileMais40);
                System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinariosFullStackMenores30);
                System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
                
                double mediaIdades = (double) somaIdades / totalPessoas;
                System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdades);
            }
            
        }
        scanner.close();
    }
}