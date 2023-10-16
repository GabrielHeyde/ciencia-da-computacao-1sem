public class Aluno
{
    private String nome;
    private String matricula;
    private double grauA;
    private double grauB;
    public Aluno()
    {
        nome = "Gabriel";
        matricula = "0";
        grauA = 0.0;
        grauB = 0.0;
    }

    public Aluno(String nomeNovo, String matriculaNovo,double grauANovo,double grauBNovo)
    {
        nome = nomeNovo;
        matricula = matriculaNovo;
        grauA = grauANovo;
        grauB = grauBNovo;
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota do Grau A: " + grauA);
        System.out.println("Nota do Grau B: " + grauB);
        if ((grauA + 2*grauB)/3 <6)
        System.out.println(nome + " deverá realizar o Grau C");
    }
}
