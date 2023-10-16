public class Principal2
{
    public static void main(String[] args){
        Universidade[] uni = new Universidade[Teclado.leInt("Digite o número de universidades que serão informadas: ")];
        
        String tipo = "";
        for(int i = 0; i<uni.length; i++){
            while(true){
            tipo = Teclado.leString("Digite publica para definir uma universidade publica ou particular para definir uma universidade particular: ");
            if (tipo.equals("publica") || tipo.equals("particular")){
                break;
            }
            }
            if (tipo.equals("publica")){
                String nomePublica = Teclado.leString("Digite o nome da universidade: ");
                int qAlunosPublica = Teclado.leInt("Digite o número de alunos da universidade: ");
                int qProfessoresPublica = Teclado.leInt("Digite o número de professores da universidade: ");
                String estadoPublica = Teclado.leString("Digite a sigla do estado da universidade: ");
                String cidadePublica = Teclado.leString("Digite a cidade da universidade: ");
                uni[i] = new Publica(nomePublica, qAlunosPublica, qProfessoresPublica, estadoPublica, cidadePublica);
                System.out.println("");
            }
            
            if (tipo.equals("particular")){
                String nomeParticular = Teclado.leString("Digite o nome da universidade: ");
                int qAlunosParticular = Teclado.leInt("Digite o número de alunos da universidade: ");
                int qProfessoresParticular = Teclado.leInt("Digite o número de professores da universidade: ");
                double mensalidadeParticular = Teclado.leDouble("Digite o valor da mensalidade da universidade: ");
                uni[i] = new Particular(nomeParticular, qAlunosParticular, qProfessoresParticular, mensalidadeParticular);
                System.out.println("");
            }
        }
        
        MEC teste = new MEC(uni);
        
        System.out.println("");
        
        teste.imprimeUniversidades();
        
        System.out.println("");
        
        teste.maisCara();
        
        System.out.println("");
        
        teste.universidadesDoSul();
    }
}