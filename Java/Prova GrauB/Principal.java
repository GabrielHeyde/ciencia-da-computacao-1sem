import java.util.Random;
import java.lang.Math;
public class Principal
{
    public static void main(String[] args){
        int tamanhoArray = (int)(Math.random() * 20) + 1; 
    
        Produto[] produtos = new Produto[tamanhoArray];
    
        for(int i = 0; i<produtos.length; i++){
            int x = i + 1;
            String nomeProduto = "Produto " + x;
            String descricaoDoProduto = "Descrição do Produto " + x;
            
            int valorProduto = (int)(Math.random() * 1000);
            int valorDoProduto = valorProduto;
            
            int anoProduto = (int)(Math.random() * 2030) + 1;
            int mesProduto = (int)(Math.random() * 12) + 1;
            int diaProduto = 0;
            if(mesProduto == 1 || mesProduto == 3 || mesProduto == 5 || mesProduto == 7 || mesProduto == 8 || mesProduto == 10 || mesProduto == 12){
                int dia = (int)(Math.random() * 31) + 1;
                diaProduto = dia;
            }
            if(mesProduto == 4 || mesProduto == 6 || mesProduto == 9 || mesProduto == 11){
                int dia = (int)(Math.random() * 30) + 1;
                diaProduto = dia;
            }
            if(mesProduto == 2){
                int dia = (int)(Math.random() * 28) + 1;
                diaProduto = dia;
            }
            
            Data dataProduto = new Data(diaProduto, mesProduto, anoProduto);
            int tipoDoProduto = (int)(Math.random() * 100) + 1;
            if(tipoDoProduto%2 == 0){
                Perecivel p1 = new Perecivel(nomeProduto, descricaoDoProduto, valorDoProduto, dataProduto);
                produtos[i] = p1;
            }
            else if(tipoDoProduto%2 != 0){
                NaoPerecivel n1 = new NaoPerecivel(nomeProduto, descricaoDoProduto, valorDoProduto, dataProduto);
                produtos[i] = n1;
            }
        }
        
        int maiorValor = 0;
        int posicaoProduto = 0;
        for(int p = 0; p<produtos.length; p++){
            if(produtos[p] instanceof Perecivel){
                if(produtos[p].getValor() > maiorValor){
                    maiorValor = produtos[p].getValor();
                    posicaoProduto = p;
                }
            }
        }
        
        System.out.println("O Produto Perecivel mais caro na lista é:\n");
        System.out.println(produtos[posicaoProduto].toString() + "\n");
        System.out.println("----------------------------------------------");
        
        System.out.println("Produtos não perecíveis fabricados antes do ano de 2022: \n");
        for(int a = 0; a<produtos.length; a++){
            if(produtos[a] instanceof NaoPerecivel){
                NaoPerecivel pA = (NaoPerecivel) produtos[a];
                if(pA.getDataDeFabricacao().getAno() < 2022){
                    System.out.println("Nome do Produto: " + pA.getNome() + "\nData de Fabricação: " + pA.getDataDeFabricacao().toString() + "\n");
                    
                }
            }
        }
        System.out.println("----------------------------------------------");
        
        System.out.println("Produtos  perecíveis que já passaram da data de validade: \n");
        for(int d = 0; d<produtos.length; d++){
            if(produtos[d] instanceof Perecivel){
                Perecivel pB = (Perecivel) produtos[d];
                if(pB.getDataDeValidade().getAno() < 2023){
                    System.out.println(pB.toString() + "\n");
                }
                else if(pB.getDataDeValidade().getAno() == 2023){
                    if(pB.getDataDeValidade().getMes() < 6){
                        System.out.println(pB.toString() + "\n");                        
                    }
                    else{
                        if(pB.getDataDeValidade().getDia() < 28){
                            System.out.println(pB.toString() + "\n");
                        }
                    }
                }
            }
        }
    }
}