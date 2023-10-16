public class Particular extends Universidade
{
    private double valor;

    public Particular(String nome, int qAlunos, int qProfessores, double valor)
    {
        super(nome, qAlunos, qProfessores);
        this.valor = valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String toString(){
        return "Nome da Universidade: " + getNome() + "\nQuantidade de Alunos: " + getQAlunos() + "\nQuantidade de Professores: " + getQProfessores() + "\nValor: " + valor;
    }
}