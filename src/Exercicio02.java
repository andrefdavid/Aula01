import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double inicio, fim, litros, consumo;
		Scanner leitor = new Scanner(System.in);
		System.out.println("CALCULADORA DE CONSUMO");
		System.out.println("Por favor, informe quantos quilometros o marcador indicava no início da viagem");
		inicio = leitor.nextDouble();
		System.out.println("Por favor, informe quantos quilometros o marcador indicava na chegada ao posto");
		fim = leitor.nextDouble();
		System.out.println("Por favor, informe quantos litros de gasolina foram reabastecidos");
		litros = leitor.nextDouble();
		//Para o cálculo, o uso de parênteses prioriza uma das operações
		consumo = (fim - inicio) / litros;
		System.out.println("Nessa viagem o veículo consumiu " + consumo + " km/l");
		leitor.close();
	}

}
