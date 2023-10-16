public class Programador extends Pessoa
{
    private String linguagemDeProgramacao;

    public Programador(String nome, int idade, String linguagemDeProgramacao)
    {
        super(nome, idade);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao){
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }
    
    public String getLinguagemDeProgramacao(){
        return linguagemDeProgramacao;
    }
    
    public void imprimeDados(){
        System.out.println("Nome = " + getNome() + "\nIdade = " + getIdade() + "\nLinguagem de Programação = " + linguagemDeProgramacao);
    }
}