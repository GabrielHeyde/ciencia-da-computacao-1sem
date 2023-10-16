public class TestaExercicios
{
    public static void main(String[] args){
        Exercicios teste = new Exercicios();
        System.out.println("Exercício 1 \n");
        
        String[] textos = {"Colorado", "Gremista", "Flamenguista", "Colorado", "Atleticano", "Palmeirense", "Gremista", "Colorado", "São Paulino", "Gremista", "Colorado", "Santista", "Bahiano"};
        
        System.out.print("Textos existentes dentro do array: [");
        for(int q = 0; q<textos.length; q++){
            if(q<textos.length - 1){
                System.out.print(textos[q] + ", ");
            }
            else if(q<textos.length){
                System.out.print(textos[q] + "]\n");
            }
        }
        
        System.out.println("");
        System.out.println("O número de vezes que o texto digitado aparece no array é: " + teste.exercicioA(textos));
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("Exercício 2 \n");
        
        int[] e2a = {2, 4, 6, 8, 10};
        int[] e2b = {3, 5, 7, 9, 11};
        int[] e2c = {23, 10, 7, 4};
        
        System.out.print("Elementos do array com a maior soma entre os elementos: [");
        for(int i = 0; i<teste.exercicioB(e2a, e2b, e2c).length; i++){
            if(i < teste.exercicioB(e2a, e2b, e2c).length - 1){
                System.out.print(teste.exercicioB(e2a, e2b, e2c)[i] + ", ");
            }
            else if(i < teste.exercicioB(e2a, e2b, e2c).length){
                System.out.print(teste.exercicioB(e2a, e2b, e2c)[i] + "]\n");
            }
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("Exercício 3 \n");
    
        int x = Teclado.leInt("Digite um valor para o elemento x: ");
        int y = Teclado.leInt("Digite um valor para o elemento y: ");
        if(teste.exercicioC(x, y) != null){
            System.out.print("Elementos do array com inteiros entre os valores digitados pelo usuário: [");
            for(int c = 0; c<teste.exercicioC(x, y).length; c++){
                if(c<teste.exercicioC(x, y).length - 1){
                    System.out.print(teste.exercicioC(x, y)[c] + ", ");
                }
                else if(c<teste.exercicioC(x, y).length){
                    System.out.print(teste.exercicioC(x, y)[c] + "]");
                }
            }
        }
        System.out.println("");
        if(teste.exercicioC(x, y) == null){
            System.out.println(teste.exercicioC(x, y));
        }
    }
}