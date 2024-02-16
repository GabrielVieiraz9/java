package modulo09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class triangleTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> lista = new ArrayList<>();
		double A, B, C;
		String control = null;
		Scanner scanner = new Scanner(System.in);
		
        for (int i = 0; i < 3; i++) {
           if (i == 0) {
        	   control = "A";
           } else if (i == 1) {
        	   control = "B";
           } else if (i == 2) {
        	   control = "C";
           }
           
           System.out.println("Digite o valor do lado " + control + ": ");
           double lados = scanner.nextDouble();
           lista.add(lados);
        }
        
        Collections.sort(lista);
        Collections.reverse(lista);
        scanner.close();
        System.out.println("Lista dos lados organizados em ordem decrescente: " + lista + "\n");

        A = lista.get(0);
        B = lista.get(1);
        C = lista.get(2);

        if (A >= B + C) {
        	System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(B, 2)) {
        	System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(B, 2)) {
        	System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(B, 2)) {
        	System.out.println("TRIANGULO ACUTANGULO");
        }
        
        if (A == B && B == C) {
        	System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || B == C || A == C){
        	System.out.println("TRIANGULO ISOSCELES");
        }

    } 
        
}