package classe;

public class Data {

    int dia;
    int mes;
    int ano;

// Muito mais usado
    Data() {
	dia = 1;
	mes = 1;
	ano = 1970;

    }

    Data(int dia, int mes, int ano){
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;

    }

    String obterDataFormatada() {
	return String.format("%d/%d/%d", dia, mes, ano);

    }

// Não costuma ser utilizado
    void imprimirDataFormatada() {
	System.out.println(obterDataFormatada());
    }

}
