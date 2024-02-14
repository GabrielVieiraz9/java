package extraferiado01;

import java.util.ArrayList;
import java.util.List;

public class ex06 {

    public static void main(String[] args) {
        // Declarando uma lista de cores com seus valores iniciais
        double vermelho = 127;
        double azul = vermelho * Math.sqrt(3);
        double amarelo = azul * Math.sqrt(3);
        double laranja = amarelo * Math.sqrt(3);
        double verde = laranja * Math.sqrt(3);
        double roxo = verde * Math.sqrt(3);
        double marrom = roxo * Math.sqrt(3);
        double cinza = marrom * Math.sqrt(3);
        double rosa = cinza * Math.sqrt(3);
        double preto = rosa * Math.sqrt(3);
        double branco = preto * Math.sqrt(3);
        
        // Array contendo os nomes das cores correspondentes
        String[] nomesCores = {"Vermelho", "Azul", "Amarelo", "Laranja", "Verde", "Roxo", "Marrom", "Cinza", "Rosa", "Preto", "Branco"};
        
        // Adicionando os valores das cores a uma lista
        List<Double> valoresCores = new ArrayList<>();
        valoresCores.add(vermelho);
        valoresCores.add(azul);
        valoresCores.add(amarelo);
        valoresCores.add(laranja);
        valoresCores.add(verde);
        valoresCores.add(roxo);
        valoresCores.add(marrom);
        valoresCores.add(cinza);
        valoresCores.add(rosa);
        valoresCores.add(preto);
        valoresCores.add(branco);

        // Imprimindo os valores das cores
        for (int i = 0; i < valoresCores.size(); i++) {
        	
        	String valorFormatado = String.format("%.2f", valoresCores.get(i)); //formatar o valor de cada item na lista para duas casas decimais
        	
            System.out.println("Valor da cor " + nomesCores[i] + ": " + valorFormatado + " volts");
        }
    }
}