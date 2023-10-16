//Gabriel Heyde Pintos

public class Corredor extends Atleta
{
    private double peso;
    private Competicao competicaoCorredor;
    
    public Corredor(String nome, int idade, double peso, Competicao competicaoCorredor)
    {
        super(nome, idade);
        this.peso = peso;
        this.competicaoCorredor = competicaoCorredor;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setCompeticaoCorredor(Competicao competicaoCorredor){
        this.competicaoCorredor = competicaoCorredor;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public Competicao getCompeticaoCorredor(){
        return competicaoCorredor;
    }
    
    public void imprimeCompeticao(){
        System.out.println("Competição: " + getCompeticaoCorredor());
    }
    
    public void imprimeInfo(){
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nPeso: " + getPeso());
    }
}