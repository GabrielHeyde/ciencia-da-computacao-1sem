//Eduardo Cansan e Gabriel Heyde Pintos
public class Time
{
    private String nomeTime;
    private int anoDeCriacao;
    private int nSocios;
    
    public Time(String nomeTime, int anoDeCriacao, int nSocios)
    {
        this.nomeTime = nomeTime;
        this.anoDeCriacao = anoDeCriacao;
        this.nSocios = nSocios;
    }

    public void setNomeTime(String nomeTime){
        this.nomeTime = nomeTime;
    }
    
    public void setAnoDeCriacao(int anoDeCriacao){
        this.anoDeCriacao = anoDeCriacao;
    }
    
    public void setNSocios(int nSocios){
        this.nSocios = nSocios;
    }
    
    public String getNomeTime(){
        return nomeTime;
    }
    
    public int getAnoDeCriacao(){
        return anoDeCriacao;
    }
    
    public int getNSocios(){
        return nSocios;
    }
    
    public String toString(){
        return "Nome do Time: " + getNomeTime() + "\nAno de Criação: " + getAnoDeCriacao() + "\nNúmero de Sócios: " + getNSocios();
    }
}