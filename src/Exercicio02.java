import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double inicio, fim, litros, consumo;
		Scanner leitor = new Scanner(System.in);
		System.out.println("CALCULADORA DE CONSUMO");
		System.out.println("Por favor, informe quantos quilometros o marcador indicava no in�cio da viagem");
		inicio = leitor.nextDouble();
		System.out.println("Por favor, informe quantos quilometros o marcador indicava na chegada ao posto");
		fim = leitor.nextDouble();
		System.out.println("Por favor, informe quantos litros de gasolina foram reabastecidos");
		litros = leitor.nextDouble();
		//Para o c�lculo, o uso de par�nteses prioriza uma das opera��es
		consumo = (fim - inicio) / litros;
		System.out.println("Nessa viagem o ve�culo consumiu " + consumo + " km/l");
		leitor.close();
	}

}
