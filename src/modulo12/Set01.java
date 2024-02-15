package modulo12;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setLivros = new HashSet<String>();
		
		setLivros.add("It a Coisa");
		setLivros.add("Percy Jackson");
		setLivros.add("Harry Potter");
		setLivros.add("Hellraiser");
		setLivros.add("Le Petit Prince");
		setLivros.add("Harry Potter");
		
		System.out.println("Livros na coleção: \n" + setLivros);
		
		System.out.println("Tem o livro Le Petit Prince? \n" + setLivros.contains("Le Petit Prince"));
		
		System.out.println();
		System.out.println("Removendo um item da coleção: \n" + setLivros.remove("Le Petit Prince"));
		
		System.out.println(setLivros);
		System.out.println("Tem o livro Le Petit Prince? \n" + setLivros.contains("Le Petit Prince"));
		
		for (String livro : setLivros) {
			if(livro != null) {
				System.out.println("O HashCoide do Elemento do Livro: " + livro + " " + livro.hashCode());
			}
		}
		
		Iterator<String> iSetLivros = setLivros.iterator();
		while(iSetLivros.hasNext()) {
			System.out.println(iSetLivros.next());
		}
	}

}
