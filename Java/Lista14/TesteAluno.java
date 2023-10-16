public class TesteAluno
{
    public static void main(String args[]){
        String nomeAluno1 = "Petrônio";
        String matriculaAluno1 = "0058487";
        double grauAAluno1 = 1.6;
        double grauBAluno1 = 7.1;
        Aluno aluno1 = new Aluno(nomeAluno1, matriculaAluno1, grauAAluno1, grauBAluno1);
        
        String nomeAluno2 = "Javonilda";
        String matriculaAluno2 = "1254870";
        double grauAAluno2 = 9.5;
        double grauBAluno2 = 9.3;
        Aluno aluno2 = new Aluno(nomeAluno2, matriculaAluno2, grauAAluno2, grauBAluno2);
        
        String nomeAluno3 = "Josepha";
        String matriculaAluno3 = "4487512";
        double grauAAluno3 = 7.7;
        double grauBAluno3 = 0.3;
        Aluno aluno3 = new Aluno(nomeAluno3, matriculaAluno3, grauAAluno3, grauBAluno3); 
}
}