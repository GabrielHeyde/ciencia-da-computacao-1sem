//Eduardo Cansan e Gabriel Heyde Pintos
public class Mulher extends Pessoa
{
    private String corDeCabelo;

    public Mulher(String nomePessoa, int idadePessoa, String corDeCabelo)
    {
        super(nomePessoa, idadePessoa);
        this.corDeCabelo = corDeCabelo;
    }

    public void setCorDeCabelo(String corDeCabelo){
        this.corDeCabelo = corDeCabelo;
    }
    
    public String getCorDeCabelo(){
        return corDeCabelo;
    }
    
    public String toString(){
        return "Nome da Mulher: " + getNomePessoa() + "\nIdade da Mulher: " + getIdadePessoa() + "\nCor de Cabelo da Mulher: " + getCorDeCabelo();
    }
}