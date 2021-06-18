package java_exercicio;

class Impressao {
public static void main(String[] args) {

   // int num; //declarando uma variável
//tipo /nome da variável

   // num=0;
    int n1=10, n2=20, n3=30;
    int res = n1+n2+n3;
    String nome ="Marcelo";

    System.out.print("CFB Cursos\n");//não executa quebra de linha, porém \n quebra alinha
    System.out.println("Curso de java");//executa quebra de linha
    System.out.printf("%s - %d\n","CFB Curso", 2021);//impressão formatada, formatação + argumentos
    System.out.printf("Canal:%s %n Ano:%d\n", "CFB Curso",2021);//tambem paermite a interpolação, %n = \n


    System.out.printf("Valor da variável res:%d%nNome:%s",res,nome);

}
    
}