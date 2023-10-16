//Gabriel Heyde Pintos
public class Livro{
    private String titulo, autor;
    private int ano, paginas;
    private double preco;

    public Livro(String titulo, String autor, int ano, double preco, int paginas)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
        this.paginas = paginas;
    }
    
        public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
        public void setAutor(String autor){
        this.autor = autor;
    }
    
        public void setAno(int ano){
        this.ano = ano;
    }
    
        public void setPreco(double preco){
        this.preco = preco;
    }
    
        public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
        public String getTitulo(){
        return titulo;
    }
    
        public String getAutor(){
        return autor;
    }
    
        public int getAno(){
        return ano;
    }    
    
        public double getPreco(){
        return preco;
    }
    
        public int getPaginas(){
        return paginas;
    }  
    
    public void calcularPrecoPorPagina(){
        double media;
        media = preco/paginas;
        System.out.println("Preço por página: " + media);
    }
    
        public void imprimeInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
        System.out.println("Preço: " + preco);
        System.out.println("Páginas: " + paginas);
    }
}