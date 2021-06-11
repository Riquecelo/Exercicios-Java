package JavaExercicio;

public class TiposLoop {
    public static void main(String[] args) {
       
       //estrutura de repetição para(for)
        for(int i = 0; i < 10; i++ ){
            System.out.print("Olá ");
        }

        //estrutura de repetição enquanto(while)
        int idade = 15;
        while(idade<18){
            System.out.println(idade);
            idade = idade + 1;
        }
        //controlando loops pausa(break) e (continue)
        for(int i = 0; i < 100; i++){
            if(i>50 && i < 60){
                //continue;
                break;
            }
            System.out.print(i+" ");
        }

     
        
    }
}
