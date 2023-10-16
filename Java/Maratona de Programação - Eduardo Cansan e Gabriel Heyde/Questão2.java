public class Questão2
{
    public static void main(String[] args){
        int[] valores = new int[10];
        
        for(int i = 0; i<valores.length; i++){
            valores[i] = Teclado.leInt("Digite um valor para ser adicionado ao vetor: ");
            if(valores[i] <=0){
                valores[i] = 1;
            }
        }
        
        for(int i = 0; i<valores.length; i++){
            System.out.println("X["+i+"] = " + valores[i]);
        }
    }
}