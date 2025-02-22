package controle;

public class SwitchSemBreak {

    public static void main(String[] args) {

	String faixa = "marrom";
	switch (faixa.toLowerCase()) {
	case "preta":
	    System.out.println("Sei o Bassai-dai...");
	case "marrom":
	    System.out.println("Sei o Tekki Shodan");
	case "roxa":
	    System.out.println("Sei o Heian GOdan");
	case "verde":
	    System.out.println("Sei o Heian Yodan");
	case "laranja":
	    System.out.println("Sei o Heian Sandan");
	case "vermelha":
	    System.out.println("Sei o Heain Nidan");
	case "amarela":
	    System.out.println("Sei o Heain Shodan");
	default:
	    System.out.println("Não sei nada");

	}
	System.out.println("Fim!");
    }
}
