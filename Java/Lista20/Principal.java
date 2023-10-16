public class Principal
{
    public static void main(String[] args){
        
        Livro[] livrinhos = new Livro[Teclado.leInt("Digite a quantidade de livros que você deseja adicionar à sua biblioteca: ")];
        for(int i = 0; i<livrinhos.length; i++){
            String titulozinho = Teclado.leString("Digite o título de seu livro: ");
            String autorzinho = Teclado.leString("Digite o autor deste livro: ");
            int aninho = Teclado.leInt("Digite o ano de publicação deste livro: ");
            
            livrinhos[i] = new Livro(titulozinho, autorzinho, aninho);
            
            System.out.println("");
        }
        
        Biblioteca b1 = new Biblioteca(livrinhos);
        
        System.out.println("");
        
        System.out.println(b1.verificaLivros());
        
        System.out.println("");

        System.out.println(b1.retornaLivro());
    }
}