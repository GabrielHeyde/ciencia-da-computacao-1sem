public class Teste
{
    public static void main(String[] args){
        Banana banana = new Banana("banana", 3.50, "Prata");
        banana.imprimeDados();
        
        System.out.println("");
        
        Melancia melancia = new Melancia("melancia", 10.75, 4.25, false);
        melancia.imprimeDados();
        
        System.out.println("\n\n\n");
        
        Programador programador = new Programador("Gabriel", 19, "Python");
        programador.imprimeDados();
        
        System.out.println("");
        
        Aluno aluno = new Aluno("Gabriel", 19, 9.5);
        aluno.imprimeDados();
        
        System.out.println("");
        
        String nome = Teclado.leString("Digite o nome da pessoa");
        int idade = Teclado.leInt("Digite a idade da pessoa: ");
        Pessoa p = new Pessoa(nome, idade);
        
        int opcao = Teclado.leInt("Digite 1. para atribuir a pessoa como programador ou 2. para atribuir a pessoa como aluno: ");
        
        if(opcao == 1){
            String linguagemDeProgramacao = Teclado.leString("Digite a linguagem preferida do programador: ");
            p = new Programador(nome, idade, linguagemDeProgramacao);
        }
        
        if (opcao == 2){
            int nota = Teclado.leInt("Digite a nota do aluno: ");
            p = new Aluno(nome, idade, nota);
        }
        
        p.imprimeDados();
    }
}