//Gabriel Heyde Pintos

public class Teste
{
    public static void main(String[] args){
        Data d = new Data(05, 8, 2023);
        Competicao c = new Competicao("Correr cansa", d);
        
        System.out.println(c.getNomeCompeticao());
        c.imprimeData();
        
        System.out.println("========================");
        
        Nadador n1 = new Nadador("Cielo", 23, "Borboleta");
        n1.imprimeInfo();
        
        System.out.println("========================");
        
        Data p = new Data(05, 2, 2023);
        Competicao g = new Competicao("Correr cansa", p);
        Corredor c1 = new Corredor("Pedro", 91, 68, g);
        
        g.imprimeData();
        System.out.println("");
        c1.imprimeInfo();
        
        System.out.println("========================");
        
        Data augosto = new Data(1,1,2024);
        Competicao h = new Competicao("São Silvestre", augosto);
        Corredor c2 = new Corredor("Augosto",100,70,h);
        
        c2.imprimeInfo();
        
        System.out.println("========================");
        
        Atleta novo;
        int tipoDoAtleta = 0;
        
        while(tipoDoAtleta!=1 && tipoDoAtleta!=2){
        tipoDoAtleta = Teclado.leInt("Digite 1 para criar um Nadador ou Digite 2 para criar um Corredor: ");
        }
        
        String nomeAtleta = Teclado.leString("Digite um nome para o Nadador: ");
        int idadeAtleta = Teclado.leInt("Digite uma idade para o Nadador: ");
        
        if(tipoDoAtleta==1){
            String categoriaAtleta = Teclado.leString("Digite uma categoria para o Nadador: ");
        }
        
        if(tipoDoAtleta==2){
            double PesoAtleta = Teclado.leDouble("Digite um peso para o Corredor: ");
            String corredorCompeticao = Teclado.leString("Digite um nome para competição do Corredor: ");
            int corredorDia = Teclado.leInt("Digite o dia da corrida do Corredor: ");
            int corredorMes = Teclado.leInt("Digite o mês da corrida do Corredor: ");
            int corredorAno = Teclado.leInt("Digite o ano da corrida do Corredor: ");
            
            Data d2 = new Data(corredorDia, corredorMes, corredorAno);
            Competicao c52 = new Competicao(corredorCompeticao, d2);
        }
        
        
    }
}