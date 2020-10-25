import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		//A linha abaixo cria uma variável chamada nome
		//Ela é do tipo String, então é capaz de armazenar texto
		String nome;
		//A linha abaixo cria um Scanner. É o recurso que
		//utilizaremos para ler dados que o usuário digitar
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome");
		//A linha abaixo armazena na variável nome o conteúdo 
		//lido pelo Scanner
		nome = leitor.next();
		//A linha abaixo exibe uma mensagem e o conteúdo da variável
		//nome
		System.out.println("Mensagem " + nome);
		//A linha abaixo encerra o funcionamento do Scanner
		leitor.close();
	}

}
