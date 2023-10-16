public class Aluno extends Pessoa
{
    private double nota;

    public Aluno(String nome, int idade, double nota)
    {
        super(nome, idade);
        this.nota = nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }
    
    public double nota(){
        return nota;
    }
    
    public void imprimeDados(){
        System.out.println("Nome = " + getNome() + "\nIdade = " + getIdade() + "\nNota = " + nota);
    }
}