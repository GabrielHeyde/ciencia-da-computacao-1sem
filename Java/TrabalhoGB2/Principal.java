//Gabriel Heyde Pintos e Eduardo Menegat Meirelles Cansan
public class Principal
{
    public static void main(String[] args){
        
        Churros[] teste = new Churros[27];
        
        for(int i = 0; i<teste.length; i++){
            if(i<8){
                teste[i] = new Churros("Doce de Leite", 3.00);
            }
            if(i>=8 && i<20){
                teste[i] = new Churros("Chocolate", 3.50);
            }
            if(i>=20 && i<teste.length){
                teste[i] = new Churros("Paçoca", 4.25);
            }
        }
        
        BancaDeChurros b1 = new BancaDeChurros(teste);
        
        System.out.println(b1.estoqueChurros("Doce de Leite"));
        System.out.println(b1.estoqueChurros("Chocolate"));
        System.out.println(b1.estoqueChurros("Paçoca"));
        
        System.out.println("");
        
        Churros novo = new Churros("Doce de Leite", 3.00);
        
        System.out.println("TESTE COM ESPAÇO SOBRANDO: ");
        teste[1] = null;
        System.out.println(b1.insereChurros(novo));
        
        System.out.println("TESTE SEM ESPAÇO SOBRANDO: ");
        System.out.println(b1.insereChurros(novo));
        
        System.out.println("");
        
        System.out.println(b1.valorTotal());
        
        System.out.println("");
        
        System.out.println("TESTE COM CHURROS EM ESTOQUE: ");
        b1.vendeChurros("Doce de Leite");
        b1.vendeChurros("Doce de Leite");
        b1.vendeChurros("Doce de Leite");
        b1.vendeChurros("Doce de Leite");
        b1.vendeChurros("Doce de Leite");
        b1.vendeChurros("Doce de Leite");
        b1.vendeChurros("Doce de Leite");
        b1.vendeChurros("Doce de Leite");
        
        System.out.println("");
        
        System.out.println("TESTE SEM CHURROS EM ESTOQUE: ");
        b1.vendeChurros("Doce de Leite");
        
        System.out.println("");
        
        b1.imprimeChurros();
        
        System.out.println("");
        
        b1.lePedidos("Gabriel", "Chocolate", 4);
        System.out.println("");
        
        b1.lePedidos("Pedro", "Paçoca", 12);
    }
}