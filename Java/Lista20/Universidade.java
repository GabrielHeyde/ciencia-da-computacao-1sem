public class Universidade
{
    private String nome;
    private int qAlunos;
    private int qProfessores;

    public Universidade(String nome, int qAlunos, int qProfessores)
    {
        this.nome = nome;
        this.qAlunos = qAlunos;
        this.qProfessores = qProfessores;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQAlunos(int qAlunos){
        this.qAlunos = qAlunos;
    }
    
    public void setQProfessores(int qProfessores){
        this.qProfessores = qProfessores;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getQAlunos(){
        return qAlunos;
    }
    
    public int getQProfessores(){
        return qProfessores;
    }
    
    public String toString(){
    return "Nome da Universidade: " + nome + "\nQuantidade de Alunos: " + qAlunos + "\nQuantidade de Professores: " + qProfessores;    
    }
}