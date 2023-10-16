import java.util.Random;
public class Baralho
{
    Carta[] baralho = new Carta[56];

    public Baralho()
    {
        for(int i = 0; i<baralho.length; i++){
            if(i>=0 && i<10){
                baralho[i] = new Carta((i+1)+"", " de Copas");
            }
            
            if(i==10){
                baralho[i] = new Carta("Valete", " de Copas");
            }
            
            if(i==11){
                baralho[i] = new Carta("Dama", " de Copas");
            }
            
            if(i==12){
                baralho[i] = new Carta("Rei", " de Copas");
            }
            
            if(i>=13 && i<22){
                baralho[i] = new Carta((i+1)-13+"", " de Paus");
            }
            
            if(i==23){
                baralho[i] = new Carta("Valete", " de Paus");
            }
            
            if(i==24){
                baralho[i] = new Carta("Dama", " de Paus");
            }
            
            if(i==25){
                baralho[i] = new Carta("Rei", " de Paus");
            }
            
            if(i>=26 && i<35){
                baralho[i] = new Carta((i+1)-26+"", " de Espada");
            }
            
            if(i==36){
                baralho[i] = new Carta("Valete", " de Espada");
            }
            
            if(i==37){
                baralho[i] = new Carta("Dama", " de Espada");
            }
            
            if(i==38){
                baralho[i] = new Carta("Rei", " de Espada");
            }
            
            if(i>=39 && i<49){
                baralho[i] = new Carta((i+1)-39+"", " de Ouro");
            }
            
            if(i==49){
                baralho[i] = new Carta("Valete", " de Ouro");
            }
            
            if(i==50){
                baralho[i] = new Carta("Dama", " de Ouro");
            }
            
            if(i==51){
                baralho[i] = new Carta("Rei", " de Ouro");
            }
            
            if(i>=52 && i<baralho.length){
                baralho[i] = new Carta("Coringa", " Ouro");
            }
        }
    }
    
    public void embaralha(){
        int numRandom1 = (int)(Math.random() * baralho.length ) + 1;
        int numRandom2 = (int)(Math.random() * baralho.length ) + 1;
        
        Carta salva1 = baralho[numRandom1];
        
        baralho[numRandom1] = baralho[numRandom2];
        baralho[numRandom2] = salva1;
    }
    
    public void daCarta(){
        int x = 0;
        while(baralho[x] == null){
            x++;
        }
        System.out.println(baralho[x].getNome() + baralho[x].getNaipe());
        baralho[x]= (null);
    }
    
    public boolean temCarta(){
        int possuiCarta = 0;
        for(int i = 0; i<baralho.length; i++){
            if(baralho[i]!=null){
                possuiCarta++;
            }
        }
        if(possuiCarta==0){
                return false;
        }
            
        else{
                return true;
        }
    }
    
    public void imprimeBaralho()
    {   
        for(int i = 0; i<baralho.length; i++){
            if(baralho[i]!= null){
            System.out.println(baralho[i].getNome() + "" + baralho[i].getNaipe());
            }
        }
        System.out.println("");
    }
}