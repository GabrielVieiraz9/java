package extraferiado01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean atendimentoEncerrado = false;
        
        // Loop principal do atendimento
        while (!atendimentoEncerrado) {
            // Solicitar dados do usuário
            System.out.println("Olá! Bem-vindo ao atendimento da operadora de telefonia.");
            System.out.print("Por favor, digite seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();
            
            System.out.print("Digite seu CPF: ");
            String cpf = scanner.nextLine();
            
            System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();
            
            // Verificar se a data de nascimento é válida
            boolean podeProsseguir = validarDataNascimento(dataNascimento);
            
            if (podeProsseguir) {
                // Boas-vindas
                System.out.println("\nObrigado, " + nome + "! Bem-vindo ao atendimento.");
                
                // Perguntar sobre o plano
                System.out.print("\nVocê usa plano pré ou pós-pago? (pré/pós): ");
                String tipoPlano = scanner.nextLine().toLowerCase();
                
                if (tipoPlano.equals("pré")) {
                    // Oferecer opções de pós-pago
                    System.out.println("\nRecomendamos que você considere nossas opções de plano pós-pago para mais benefícios.");
                    System.out.print("Você gostaria de saber mais sobre nossos planos pós-pago? (sim/não): ");
                    String resposta = scanner.nextLine().toLowerCase();
                    
                    if (resposta.equals("sim")) {
                        System.out.println("\nNossos planos pós-pago oferecem mais dados, minutos e benefícios extras. Entre em contato conosco para mais informações.");
                    } else {
                        System.out.println("\nTudo bem. Aqui estão algumas opções de planos pré-pagos:");
                        // Lista de opções de planos pré-pagos
                        System.out.println("1. Plano A");
                        System.out.println("2. Plano B");
                        System.out.println("3. Plano C");
                    }
                } else if (tipoPlano.equals("pós")) {
                    // Oferecer opções de plano pós-pago
                    System.out.println("\nNossos planos pós-pago oferecem mais dados, minutos e benefícios extras. Entre em contato conosco para mais informações.");
                } else {
                    System.out.println("\nOpção de plano inválida.");
                }
                
                // Perguntar se deseja falar com um humano
                System.out.print("\nDeseja falar com um atendente humano? (sim/não): ");
                String falarComHumano = scanner.nextLine().toLowerCase();
                
                if (falarComHumano.equals("sim")) {
                    // Encerrar o atendimento simulando uma ligação que cai
                    System.out.println("\nEstamos te redirecionando para um atendente, por favor, aguarde alguns minutos!");
                    atendimentoEncerrado = true;
                }
            } else {
                System.out.println("\nData de nascimento inválida. Por favor, tente novamente.");
            }
        }
        
        scanner.close();
    }
    
    // Método para validar a data de nascimento
    public static boolean validarDataNascimento(String data) {
        // Lógica de validação da data de nascimento
    	String[] partes = data.split("/");
        if (partes.length != 3)
            return false;
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        
        // Validar se o ano está no intervalo razoável
        if (ano < 1900 || ano > 2024)
            return false;
        
        // Validar mês e dia
        if (mes < 1 || mes > 12)
            return false;
        if (dia < 1 || dia > 31)
            return false;
        
        // Ignorando validações específicas de meses e dias
        return true;
    }
}