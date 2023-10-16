//Eduardo Cansan e Gabriel Heyde Pintos
public class Homem extends Pessoa
{
    private Time timeHomem;
    private String corDePreferencia;

    public Homem(String nomePessoa, int idadePessoa, Time timeHomem, String corDePreferencia)
    {
        super(nomePessoa, idadePessoa);
        this.timeHomem = timeHomem;
        this.corDePreferencia = corDePreferencia;
    }

    public void setTimeHomem(Time timeHomem){
        this.timeHomem = timeHomem;
    }
    
    public void setCorDePreferencia(String corDePreferencia){
        this.corDePreferencia = corDePreferencia;
    }
    
    public Time getTimeHomem(){
        return timeHomem;
    }
    
    public String getCorDePreferencia(){
        return corDePreferencia;
    }
    
    public String toString(){
        return "Nome do Homem: " + getNomePessoa() + "\nIdade do Homem: " + getIdadePessoa() + "\nTime do Homem: " + getTimeHomem() + "\nCor de Preferência dos cabelos das mulheres: " + getCorDePreferencia();    }
}