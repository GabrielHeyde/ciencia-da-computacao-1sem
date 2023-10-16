//Eduardo Cansan e Gabriel Heyde Pintos
public class Pessoa
{
    private String nomePessoa;
    private int idadePessoa;

    public Pessoa(String nome, int idade)
    {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
    }

    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
    
    public void setIdadePessoa(int idadePessoa){
        this.idadePessoa = idadePessoa;
    }
    
    public String getNomePessoa(){
        return nomePessoa;
    }
    
    public int getIdadePessoa(){
        return idadePessoa;
    }
    
    public String toString(){
        return "Nome da Pessoa: " + nomePessoa + "\nIdade Pessoa: " + idadePessoa;
    }
}