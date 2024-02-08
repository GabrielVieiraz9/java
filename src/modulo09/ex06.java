package modulo09;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int codigo;
		float salario, novoSalario;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");	
		nome = scanner.next();
		
		System.out.println("Digite código do cargo de 1 a 6: ");
		System.out.println("1 ------ Gerente ----- Reajuste: 10%");
		System.out.println("2 ------ Vendedor ----- Reajuste: 7%");
		System.out.println("3 ------ Supervisor ----- Reajuste: 9%");
		System.out.println("4 ------ Motorista ----- Reajuste: 6%");
		System.out.println("5 ------ Estoquista ----- Reajuste: 5%");
		System.out.println("6 ------ Técnico de TI ----- Reajuste: 8%");
		codigo = scanner.nextInt();

		System.out.println("Digite seu salário: ");	
		salario = scanner.nextFloat();
		
		switch (codigo) {
		
		case 1:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			novoSalario = (float) (salario + (salario * 0.10));
			System.out.printf("Salário: R$ %.2f", novoSalario);
		break;
		
		case 2:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			novoSalario = (float) (salario + (salario * 0.07));
			System.out.printf("Salário: R$ %.2f", novoSalario);
		break;
		
		case 3:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			novoSalario = (float) (salario + (salario * 0.09));
			System.out.printf("Salário: R$ %.2f", novoSalario);
		break;
		
		case 4:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			novoSalario = (float) (salario + (salario * 0.06));
			System.out.printf("Salário: R$ %.2f", novoSalario);
		break;
		
		case 5:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			novoSalario = (float) (salario + (salario * 0.05));
			System.out.printf("Salário: R$ %.2f", novoSalario);
		break;
		
		case 6:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			novoSalario = (float) (salario + (salario * 0.08));
			System.out.printf("Salário: R$ %.2f", novoSalario);
		break;
		
			default:
				System.out.println("A opção é inválida, digite um valor válido.");
				break;
		
		}
		scanner.close();
	}

}
