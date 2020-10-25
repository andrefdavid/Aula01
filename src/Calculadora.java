import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args){
		//As linhas abaixo criam variáveis capazes de guardar números inteiros
		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		//Como a divisão de dois inteiros pode gerar um número com casas decimais
		//a variável divisao está sendo criada como double
		double divisao;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir os valores que você digitar!");
		System.out.println("Digite o primeiro valor que deseja somar");
		//A leitura de valores inteiros deve ser feita através do método nextInt()
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor que deseja somar");
		valor2 = leitor.nextInt();
		//A soma é feita através do operador +
		soma = valor1 + valor2;
		System.out.println("A soma entre os dois valores foi de: " + soma);
		//A subtracao é feita através do operador -
		subtracao = valor1 - valor2;
		System.out.println("A soma entre os dois valores foi de: " + subtracao);
		//A multiplicacao é feita através do operador *
		multiplicacao = valor1 * valor2;
		System.out.println("A soma entre os dois valores foi de: " + multiplicacao);		
		//A divisao é feita através do operador /. Convertemos o divisor
		//para double
		divisao = valor1 / (double) valor2;
		System.out.println("A soma entre os dois valores foi de: " + divisao);
		leitor.close();
	}

}
