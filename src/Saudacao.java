import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		//A linha abaixo cria uma vari�vel chamada nome
		//Ela � do tipo String, ent�o � capaz de armazenar texto
		String nome;
		//A linha abaixo cria um Scanner. � o recurso que
		//utilizaremos para ler dados que o usu�rio digitar
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome");
		//A linha abaixo armazena na vari�vel nome o conte�do 
		//lido pelo Scanner
		nome = leitor.next();
		//A linha abaixo exibe uma mensagem e o conte�do da vari�vel
		//nome
		System.out.println("Mensagem " + nome);
		//A linha abaixo encerra o funcionamento do Scanner
		leitor.close();
	}

}
