package modulo09;

public class testeLaco3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 25;
		boolean possuiCarteira = true;
		boolean possuiCarro = false;
		
		if(idade >= 18 && possuiCarteira && possuiCarro) {
			System.out.println("Já pode dirigir");
		}
		else {
			System.out.println("Não pode dirigir");
		}
	}

}
