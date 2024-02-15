package modulo12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		int tamanhoArray;
		
		System.out.print("Digite quantas cores você quer adicionar: \n");
		tamanhoArray = scanner.nextInt();
		
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.print("Digite a " + (i+1) + "° cor: \n");

			cores.add(scanner.next()); //poderia fazer uma variável que vai receber o scanner.next e colocar no argumento do add a variável em si.
		}
		
		System.out.print("Listar todas as cores: \n");
		Iterator <String> iCores = cores.iterator();
		
		while (iCores.hasNext()) {
			System.out.println(iCores.next());
		}

        // Ordenando as cores em ordem crescente e armazenando o resultado em uma variável
        ArrayList<String> coresOrdenadas = new ArrayList<>(cores);
        Collections.sort(coresOrdenadas);
		
        System.out.print("\n Listar todas as cores em ordem crescente: \n");
        Iterator<String> iCoresOrdenadas = coresOrdenadas.iterator();
        
        while (iCoresOrdenadas.hasNext()) {
            System.out.println(iCoresOrdenadas.next());
        }
        
        scanner.close(); // Fechando o scanner
		
	}
}