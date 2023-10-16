public class Exercicios
{
    private int x;
    public Exercicios(int x){
        this.x = x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }

    public void contador(){
        int i = x;
        while (i<301){
            System.out.println(i);
            i++;
        }
    }
    
    public void imprimePares(){
        int i = 0;
        if(x<0){
            System.out.println("Erro! Valor negativo informado!");
        }
        else if(x>=0){
            while(i<x-1){
                i=i+2;
                System.out.println(i);
            }
        }
    }
    
    public boolean verificaPrimos(){
        int i = 2;
        int naoPrimos = 0;
        boolean teste = true;
        while(i<x-1){
            double testaPrimos = x%i;
            if(testaPrimos==0){
                naoPrimos++;
            }
            i++;
        }
        
        if (naoPrimos==0){
            return teste=true;
        }
        else if(naoPrimos!=0){
            return teste=false;
        }
        return teste;
    }
}