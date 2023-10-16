public class Questão4
{
    int[] f = {10, 5, -8, -42, -78, -9, -78, -11, 79, -789};
    
    public void questão4(){
        int negativos = 0;
        for(int i = 0; i<f.length; i++){
            if(f[i] < 0){
                negativos++;
            }
        }
        System.out.println("O número de elementos negativos no arrays é: " + negativos);
    }
}