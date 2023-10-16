public class Questão3
{
    double[] d = new double[10];
    
    public void questão3(){
        for(int i = 0; i<d.length; i++){
            d[i] = Teclado.leDouble("Digite um valor para ser adicionado ao arrays: ");
        }
        
        for(int i = 0; i<d.length; i++){
            System.out.println(d[i]);
        }
    }
}