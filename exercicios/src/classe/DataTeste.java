package classe;

public class DataTeste {

    public static void main(String[] args) {

	Data d1 = new Data();
	d1.ano = 2021;


	var d2 = new Data(31, 12, 2021);

	String dataFromatada1 = d1.obterDataFormatada();

	System.out.println(dataFromatada1);
	System.out.println(d2.obterDataFormatada());
	
	d1.imprimirDataFormatada();
	d2.imprimirDataFormatada();
    }

}
