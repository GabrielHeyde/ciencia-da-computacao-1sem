//Eduardo Cansan e Gabriel Heyde Pintos
import java.util.Random;
public class Teste
{
    public static void main(String[] args){
        
        Pessoa[] p0 = new Pessoa[10];
        
        Festa teste = new Festa(p0);
        
        Time time = new Time("Time", 0, 0);
        
        for(int i = 0; i<13; i++){
            int numRandom = (int)(Math.random() * 2 ) + 1;
            if(numRandom == 1){
                System.out.println("Homem");
                Homem p1 = new Homem("Nome", 0, time ,"cor");
                p1.setNomePessoa(Teclado.leString("Digite o nome da Pessoa: "));
                p1.setIdadePessoa(Teclado.leInt("Digite a idade da pessoa: "));
                p1.getTimeHomem().setNomeTime(Teclado.leString("Digite o nome do time: "));
                p1.getTimeHomem().setAnoDeCriacao(Teclado.leInt("Digite o ano de fundação do time: "));
                p1.getTimeHomem().setNSocios(Teclado.leInt("Digite o nº de sócios: "));
                p1.setCorDePreferencia(Teclado.leString("Digite a cor de preferência de cabelo: "));
                if(teste.entraPessoa(p1) == true){
                    System.out.println(p1.getNomePessoa() + " entrou na festa.");
                    System.out.println("");
                }
                else{
                    System.out.println(p1.getNomePessoa() + " não entrou na festa.");
                    System.out.println("");
                }
            }
            
            if(numRandom == 2){
                System.out.println("Mulher");
                Mulher p1 = new Mulher("Nome", 0, "cor");
                p1.setNomePessoa(Teclado.leString("Digite o nome da Pessoa: "));
                p1.setIdadePessoa(Teclado.leInt("Digite a idade da pessoa: "));
                p1.setCorDeCabelo(Teclado.leString("Digite a cor do cabelo da mulher: "));
                if(teste.entraPessoa(p1) == true){
                    System.out.println(p1.getNomePessoa() + " entrou na festa.");
                    System.out.println("");
                }
                else{
                    System.out.println(p1.getNomePessoa() + " não entrou na festa.");
                    System.out.println("");
                }
            }
        }
    
        System.out.println("Times dos Homens da Festa: \n");
        teste.imprimeTimeHomens();
                
        System.out.println("Informações das Mulheres na Festa: \n");
        for(int i = 0; i<p0.length; i++){
            if(p0[i] instanceof Mulher){
                Mulher m = (Mulher) p0[i];
                System.out.println(m.toString());
                System.out.println("");
            }
        }
        
        teste.acharParPerfeito();
    } 
}