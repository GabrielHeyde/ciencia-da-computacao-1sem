public class Biblioteca
{
    private Livro[] biblioteca;
    
    public Biblioteca(Livro[] biblioteca)
    {
        this.biblioteca = biblioteca;
    }
    
    public void setBiblioteca(Livro[] biblioteca){
        this.biblioteca = biblioteca;
    }
    
    public Livro[] getBiblioteca(){
        return biblioteca;
    }
    
    public boolean verificaLivros(){
        String procura = Teclado.leString("Digite o título que você deseja procurar: ");
        int verificador = 0;
        for(int i=0; i<biblioteca.length; i++)
        {
            if (procura.equals(biblioteca[i].getTitulo())){
                verificador++;
            }
        }
        
        if (verificador==0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public String retornaLivro(){
        String procura = Teclado.leString("Digite o título que você deseja procurar: ");
        Livro meuLivro = new Livro("a", "b", 0);
        for(int i=0; i<biblioteca.length; i++){
            if (biblioteca[i].getTitulo().equals(procura)){
                meuLivro.setTitulo(biblioteca[i].getTitulo());
                meuLivro.setAutor(biblioteca[i].getAutor());
                meuLivro.setAnoLivro(biblioteca[i].getAnoLivro());
            }
        }
        return "Titulo: " + meuLivro.getTitulo() + "\nAutor:" + meuLivro.getAutor() + "\nAno de Publicação: " + meuLivro.getAnoLivro();
    }
}