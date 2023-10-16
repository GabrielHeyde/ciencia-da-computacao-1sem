public class Questão8
{
    double[] d = new double[Teclado.leInt("Digite o número de elementos que serão adicionados no seu arrays: ")];
    
    public void questão8(){
        for(int i = 0; i<d.length; i++){
            d[i] = Teclado.leDouble("Digite um valor para ser adicionado ao arrays: ");
        }
        
        for(int i = 0; i<d.length; i++){
            System.out.println(d[i]);
        }
    }
}