public class Questão5
{
    int[] g = {7, 5, -8, -42, -78, 7, -78, -11, 7, -789, 87, 7, 98};
    int x = 7;
    public void questão5(){
        int iguais = 0;
        for(int i = 0; i<g.length; i++){
            if(g[i] == x){
                iguais++;
            }
        }
        System.out.println("O número de elementos iguais à " + x + " no arrays é: " + iguais);
    }
}