public class Publica extends Universidade
{
    private String estado, cidade;

    public Publica(String nome, int qAlunos, int qProfessores, String estado, String cidade)
    {
        super(nome, qAlunos, qProfessores);
        this.estado = estado;
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String toString(){
        return "Nome da Universidade: " + getNome() + "\nQuantidade de Alunos: " + getQAlunos() + "\nQuantidade de Professores: " + getQProfessores() + "\nEstado: " + estado + "\nCidade: " + cidade;
    }
}