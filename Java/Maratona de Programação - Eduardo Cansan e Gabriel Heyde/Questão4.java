public class Questão4
{
    public static void main(String[] args){
        int t = 1;
        int[] valores = new int[1000];
        
        while (t<2 || t>50){
            t = Teclado.leInt("Digite o valor máximo de seu vetor: ");
        }
        
        int x = 0;
        for(int i = 0; i<valores.length; i++){
            valores[i] = x;
            System.out.printf("N["+i+"] = " + valores[i]);
            System.out.println("");
            if(x < t){
                x++;
            }
            if(x == t){
                x=0;
            }
        }
    }
}