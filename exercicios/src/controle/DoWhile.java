package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
	// if (...) sentença; ou {Bloco de código}
	// while(...)sentença; ou{Bloco de código}
	// for(inicialização da variável;expressão;modificação da variável:
	// "incremento ou um decremento, aditivo ou multiplicativo)sentença; ou{Bloco de
	// código}
	// do {Bloco de código}while(...);

	Scanner entrada = new Scanner(System.in);
	String texto = "por favor"; // ou String texto = "";
	

	do {
	    System.out.println("Você precisa falar " + "\nas palavras mágicas...");
	    System.out.print("Quer sair? ");
	    texto = entrada.nextLine();
	} while (!texto.equalsIgnoreCase("por favor"));

	System.out.println("Obrigado!");

	entrada.close();

    }
}
