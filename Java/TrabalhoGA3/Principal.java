//Gabriel Heyde Pintos
public class Principal{
    public static void main(String[] args){
        String tituloL1 = Teclado.leString("Digite o titulo do livro");
        String autorL1 = Teclado.leString("Digite o autor do livro");
        int anoL1 = Teclado.leInt("Digite o ano de publicação do livro");
        double precoL1 = Teclado.leDouble("Digite o valor do livro");
        int paginasL1 = Teclado.leInt("Digite o número de páginas do livro");
        System.out.println("");
        Livro l1 = new Livro(tituloL1,autorL1,anoL1,precoL1,paginasL1);
        l1.calcularPrecoPorPagina();
        l1.imprimeInformacoes();
        System.out.println("");
        
        String tituloL2 = Teclado.leString("Digite o titulo do livro");
        String autorL2 = Teclado.leString("Digite o autor do livro");
        int anoL2 = Teclado.leInt("Digite o ano de publicação do livro");
        double precoL2 = Teclado.leDouble("Digite o valor do livro");
        int paginasL2 = Teclado.leInt("Digite o número de páginas do livro");
        System.out.println("");
        Livro l2 = new Livro(tituloL2,autorL2,anoL2,precoL2,paginasL2);
        l2.calcularPrecoPorPagina();
        l2.imprimeInformacoes();
        System.out.println("");
        
        String tituloL3 = Teclado.leString("Digite o titulo do livro");
        String autorL3 = Teclado.leString("Digite o autor do livro");
        int anoL3 = Teclado.leInt("Digite o ano de publicação do livro");
        double precoL3 = Teclado.leDouble("Digite o valor do livro");
        int paginasL3 = Teclado.leInt("Digite o número de páginas do livro");
        System.out.println("");
        Livro l3 = new Livro(tituloL3,autorL3,anoL3,precoL3,paginasL3);
        l3.calcularPrecoPorPagina();
        l3.imprimeInformacoes();
        System.out.println("");
        
        
        
        String nomeC1 = Teclado.leString("Digite o nome do cliente: ");
        int idadeC1 = Teclado.leInt("Digite a idade do cliente: ");
        char sexoC1 = Teclado.leChar("Digite M para masculino e F para feminino: ");
        String emailC1 = Teclado.leString("Digite o email do cliente: ");
        String senhaC1 = Teclado.leString("Digite a senha do cliente: ");
        System.out.println("");
        Cliente c1 = new Cliente(nomeC1,idadeC1,sexoC1,emailC1,senhaC1);
        c1.imprimeInformacoes();
        System.out.println("");
        
        String nomeC2 = Teclado.leString("Digite o nome do cliente: ");
        int idadeC2 = Teclado.leInt("Digite a idade do cliente: ");
        char sexoC2 = Teclado.leChar("Digite M para masculino e F para feminino: ");
        String emailC2 = Teclado.leString("Digite o email do cliente: ");
        String senhaC2 = Teclado.leString("Digite a senha do cliente: ");
        System.out.println("");
        Cliente c2 = new Cliente(nomeC2,idadeC2,sexoC2,emailC2,senhaC2);
        c2.imprimeInformacoes();
        System.out.println("");
        
        String nomeC3 = Teclado.leString("Digite o nome do cliente: ");
        int idadeC3 = Teclado.leInt("Digite a idade do cliente: ");
        char sexoC3 = Teclado.leChar("Digite M para masculino e F para feminino: ");
        String emailC3 = Teclado.leString("Digite o email do cliente: ");
        String senhaC3 = Teclado.leString("Digite a senha do cliente: ");
        System.out.println("");
        Cliente c3 = new Cliente(nomeC3,idadeC3,sexoC3,emailC3,senhaC3);
        c3.imprimeInformacoes();
    }
}