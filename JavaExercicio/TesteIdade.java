package JavaExercicio;

public class TesteIdade {
    
    public static void main(String[] args) {
        
        int idade =10;
        System.out.println(idade);

        int idadeAnoQueVem;
        idadeAnoQueVem = idade + 1;
        
        System.out.println(idadeAnoQueVem);

        boolean amigoDoDono = false;
        if (idade < 18 && amigoDoDono == !false) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }
    }
}
