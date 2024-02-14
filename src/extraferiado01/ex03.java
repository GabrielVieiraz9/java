package extraferiado01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Veiculo {
    private int numeroEixos;
    private int numeroRodas;
    private String cor;
    private String tamanho;

    public Veiculo(int numeroEixos, int numeroRodas, String cor, String tamanho) {
        this.numeroEixos = numeroEixos;
        this.numeroRodas = numeroRodas;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    // Getters e Setters

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    // Método para determinar o tipo de veículo
    public String determinarTipoVeiculo() {
        if (numeroEixos == 0 && numeroRodas == 2) {
            return "Moto";
        } else if (numeroEixos == 2 && numeroRodas == 4) {
            return "Carro";
        } else if (numeroEixos == 2 && numeroRodas > 4) {
            return "Caminhão";
        } else {
            return "Desconhecido";
        }
    }

    // Método toString para representação textual do veículo
    @Override
    public String toString() {
        return "Veículo: " +
                "Tipo = " + determinarTipoVeiculo() +
                ", Número de Eixos = " + numeroEixos +
                ", Número de Rodas = " + numeroRodas +
                ", Cor = '" + cor + '\'' +
                ", Tamanho = '" + tamanho + '\'';
    }
}

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        do {
            // Solicitar dados do veículo
            System.out.println("Digite os dados do veículo:");
            System.out.print("Número de eixos: ");
            int numeroEixos = scanner.nextInt();
            System.out.print("Número de rodas: ");
            int numeroRodas = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            System.out.print("Tamanho: ");
            String tamanho = scanner.nextLine();

            // Criar o objeto Veiculo e adicioná-lo à lista
            Veiculo veiculo = new Veiculo(numeroEixos, numeroRodas, cor, tamanho);
            veiculos.add(veiculo);

            // Perguntar se deseja adicionar outro veículo
            System.out.print("Deseja adicionar outro veículo? (s/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("s"));

        // Imprimir os veículos
        System.out.println("Veículos adicionados:");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }

        scanner.close();
    }
}