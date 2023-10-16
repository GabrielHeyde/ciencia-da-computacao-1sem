public class Questão7
{
    int[] numeros = {30, 99999942, 55, 92, 1, 89, 78, 942, 21, 8, 22, 78, 7652, 9876, 8725, 1000001};
    
    public void questão7(){
        int x = numeros[0];
        int posicao = 0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] > x){
                x = numeros[i];
                posicao = i;
            }
        }
        System.out.println("No arrays informado, o maior número é o " + x + " localizado na posição " + posicao);
    }
}