//Gabriel Heyde Pintos

public class InformacoesAtletas
{
    public void imprimeExclusivosAtleta(Atleta a){
        if(a instanceof Nadador){
            Nadador n = (Nadador) a;
            System.out.println("É um nadador, e sua categoria é " + n.getCategoria());
        }
        
        if(a instanceof Corredor){
            Corredor c = (Corredor) a;
            System.out.println("É um corredor, e seu peso é " + c.getPeso());
        }
    }
    
    public void imprimeInformacoes(Atleta a){
        System.out.println("Nome: " + 
        a.getNome() + "\nIdade: " + a.getIdade());
    }
}