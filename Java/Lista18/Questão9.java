public class Questão9
{   
    int[] positivos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    String[] verifica = new String[positivos.length];
    
    public void questão9(){
        for(int i=0; i<positivos.length; i++){
            if(positivos[i]%2==0){
                verifica[i] = "+1";
            }
            
            if(positivos[i]%2!=0){
                verifica[i] = "-1";
            }
        }
        
        for(int i=0; i<verifica.length; i++){
            System.out.println(verifica[i]);
        }
    }
}