package java_exercicio;

public class Decisoes {
    public static void main(String[] args) {
    float nota1= 4.5f;
    float nota2= 4.5f;
    float media= nota1+nota2/2;
    System.out.println(media);    

    if(media>=7){
        System.out.println("Aprovado");
    }else if(media >= 6 && media < 7){
        System.out.println("Recuperação");
    }
    else{
        System.out.println("Reprovado");
    }

    }
    

    
}



