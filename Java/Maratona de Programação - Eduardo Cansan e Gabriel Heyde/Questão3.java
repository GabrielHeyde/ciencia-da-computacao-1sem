public class Questão3
{
    public static void main(String[] args){
        double[] valores = new double[100];
        
        for(int i = 0; i<valores.length; i++){
            valores[i] = Teclado.leDouble("Digite um valor para ser adicionado ao vetor: ");
        }
        
        for(int i = 0; i<valores.length; i++){
            if(valores[i] <= 10){
                System.out.printf("A["+i+"] = " + "%.1f", valores[i]);
                System.out.println("");
            }
        }
    }
}