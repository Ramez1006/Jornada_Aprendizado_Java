package fundamentos;

public class TiposPrimitivos {

public static void main(String[] args) {
    //Informações do funcionario
    
    //Tipos númericos inteiros 
    byte anosDeEmpresa = 23;
    short numeroDeVoos = 542;
    int id = 56789;
    long pontosAcumulados = 3_134_845_223L;

    // Tipos númericos reais
    float salario = 11_455.44F;
    double vendasAcumuladas = 2_991_797_103.01;
    
    //Tipo Boeeleano 
    boolean estaDeFerias = false; //true 
    
    //tipo caractere 
    char status = 'A'; //ativo
    
    //Dias de empresa
    System.out.println(anosDeEmpresa * 365);
    // Número de Viagens
    System.out.println(numeroDeVoos / 2);

    //Pontos por ral 
    
    System.out.println(pontosAcumulados / vendasAcumuladas);
    
    System.out.println(id + ": ganha -> " + salario);
    System.out.println("Férias?" + estaDeFerias);
    
    System.out.println("Status:" + status);
    
    
}
}
