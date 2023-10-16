public class Melancia extends Fruta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double precoAdicional;
    private boolean epocaDaFruta;

    public Melancia(String nome, double preco, double precoAdicional, boolean epocaDaFruta)
    {
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.epocaDaFruta = epocaDaFruta;
    }
    
    public void setPrecoAdicional(double precoAdicional){
        this.precoAdicional = precoAdicional;
    }
    
    public void setEpocaDaFruta(boolean epocaDaFruta){
        this.epocaDaFruta = epocaDaFruta;
    }
    
    public double getPrecoAdicional(){
        return precoAdicional;
    }
    
    public boolean getEpocaDaFruta(){
        return epocaDaFruta;
    }
    
    public double calculaPrecoFinal(){
        if(epocaDaFruta == false){
            return getPreco()+precoAdicional;
        }
        else{
            return getPreco();
        }
    }
    
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Época do Ano = " + epocaDaFruta + "\nPreço Final = " + calculaPrecoFinal());
    }
}