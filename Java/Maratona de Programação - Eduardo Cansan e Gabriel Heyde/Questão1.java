public class Questão1
{
    public static void main(String[] args){
        System.out.println("MENU\n1 - Cachorro Quente R$4,00\n2 - X-Salada R$4,50\n3 - X-Bacon R$5,00\n4 - Torrada Simples R$2,00\n5 - Refrigerante R$1,50");
        Lanche l0 = new Lanche(1, "Cachorro Quente", 4.00);
        Lanche l1 = new Lanche(2, "X-Salada", 4.50);
        Lanche l2 = new Lanche(3, "X-Bacon", 5.00);
        Lanche l3 = new Lanche(4, "Torrada Simples", 2.00);
        Lanche l4 = new Lanche(5, "Refrigerante", 1.50);
        
        Lanche[] lanches = {l0, l1, l2, l3, l4};
        
        int codProduto = Teclado.leInt("Digite o código do produto desejado: ");
        int quantProduto = Teclado.leInt("Digite a quantidade desejada do produto: ");
        
        for(int i = 0; i<lanches.length; i++){
            if(codProduto == lanches[i].getCodigo()){
                System.out.printf("Total R$:" + "%.2f", lanches[i].getPreco() * quantProduto);
                System.out.println("");
            }
        }
    }
}