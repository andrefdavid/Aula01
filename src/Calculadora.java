import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args){
		//As linhas abaixo criam vari�veis capazes de guardar n�meros inteiros
		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		//Como a divis�o de dois inteiros pode gerar um n�mero com casas decimais
		//a vari�vel divisao est� sendo criada como double
		double divisao;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir os valores que voc� digitar!");
		System.out.println("Digite o primeiro valor que deseja somar");
		//A leitura de valores inteiros deve ser feita atrav�s do m�todo nextInt()
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor que deseja somar");
		valor2 = leitor.nextInt();
		//A soma � feita atrav�s do operador +
		soma = valor1 + valor2;
		System.out.println("A soma entre os dois valores foi de: " + soma);
		//A subtracao � feita atrav�s do operador -
		subtracao = valor1 - valor2;
		System.out.println("A soma entre os dois valores foi de: " + subtracao);
		//A multiplicacao � feita atrav�s do operador *
		multiplicacao = valor1 * valor2;
		System.out.println("A soma entre os dois valores foi de: " + multiplicacao);		
		//A divisao � feita atrav�s do operador /. Convertemos o divisor
		//para double
		divisao = valor1 / (double) valor2;
		System.out.println("A soma entre os dois valores foi de: " + divisao);
		leitor.close();
	}

}
