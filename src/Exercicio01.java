import java.util.Scanner;

public class Exercicio01 {
	//Quando um valor pode ser alterado pelo programador, mas n�o sofre altera��es
	//na execu��o do programa, podemos criar uma CONSTANTE. Nada mais
	//� do que um nome identificador para um valor
	static final double COTACAO = 3.5;

	public static void main(String[] args) {
		//As vari�veis abaixo foram criadas como double pois armazenam valores
		//com casas decimais
		double reais, dolares;
		Scanner leitor = new Scanner(System.in);
		System.out.println("CONVERSOR DE MOEDAS");
		System.out.println("Digite o valor da doa��o recebida em d�lares");
		dolares = leitor.nextDouble();
		reais = dolares * COTACAO;
		//Para exibir o valor com 2 casas decimais, utilizamos o m�todo format("%.2f",valor)
		System.out.println("O valor da doa��o recebida em reais foi de R$" + String.format("%.2f",reais));
		leitor.close();
	}

}
