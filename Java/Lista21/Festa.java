//Eduardo Cansan e Gabriel Heyde Pintos
public class Festa
{
    private Pessoa[] pessoasNaFesta;

    public Festa(Pessoa[] pessoasNaFesta)
    {
        this.pessoasNaFesta = pessoasNaFesta;
    }

    public void setPessoasNaFesta(Pessoa[] pessoasNaFesta){
        this.pessoasNaFesta = pessoasNaFesta;
    }
    
    public Pessoa[] getPessoasNaFesta(){
        return pessoasNaFesta;
    }
    
    public void imprimePessoasFesta(){
        for(int i = 0; i < pessoasNaFesta.length; i++){
            if(pessoasNaFesta[i] instanceof Mulher){
                Mulher m = (Mulher) pessoasNaFesta[i];
                System.out.println(m.toString());
            }
            if(pessoasNaFesta[i] instanceof Homem){
                Homem h = (Homem) pessoasNaFesta[i];
                System.out.println(h.toString());
            }
        }
    }
    
    public boolean entraPessoa(Pessoa p){
        for(int i = 0; i < pessoasNaFesta.length; i++){
            if(pessoasNaFesta[i] == null){
                pessoasNaFesta[i] = p;
                return true;
            }
        }
        return false;
    }
    
    public Pessoa[] procuraMulheres(){
        Pessoa[] apenasMulheres = new Pessoa[pessoasNaFesta.length];
        for(int i = 0; i<pessoasNaFesta.length; i++){
            if(pessoasNaFesta[i] instanceof Mulher){
                Mulher m = (Mulher) pessoasNaFesta[i];
                apenasMulheres[i] = m;
            }
        }
        return apenasMulheres;
    }
    
    public void imprimeTimeHomens(){
        for(int i = 0; i<pessoasNaFesta.length; i++){
            if(pessoasNaFesta[i] instanceof Homem){
                System.out.println("Nome da Pessoa: " + pessoasNaFesta[i].getNomePessoa());
                Homem h = (Homem) pessoasNaFesta[i];
                System.out.println("Time que torce: " + h.getTimeHomem().getNomeTime());
                System.out.println("");
            }
        }
    }
    
    public void acharParPerfeito(){
        Mulher[] mulheres = new Mulher[pessoasNaFesta.length];
        Homem[] homens = new Homem[pessoasNaFesta.length];
        int DiferencaIdade = 0;
        for(int i = 0; i<pessoasNaFesta.length; i++){
            if(pessoasNaFesta[i] instanceof Homem){
                Homem h = (Homem) pessoasNaFesta[i];
                homens[i] = h;
            }
            
            if(pessoasNaFesta[i] instanceof Mulher){
                Mulher m = (Mulher) pessoasNaFesta[i];
                mulheres[i] = m;
            }
        }
        
        
        for(int i = 0; i<homens.length; i++){
            if(homens[i] != null){
                System.out.println("Mulher(es) que se encaixam no perfil de " + homens[i].getNomePessoa() + ": ");
                for(int c = 0; c<mulheres.length; c++){
                    if(mulheres[c] != null){
                            if(homens[i].getCorDePreferencia().equals(mulheres[c].getCorDeCabelo())){
                            if(homens[i].getIdadePessoa() > mulheres[c].getIdadePessoa()){
                                DiferencaIdade = homens[i].getIdadePessoa() - mulheres[c].getIdadePessoa();
                                System.out.println(mulheres[c].getNomePessoa() + ", " + DiferencaIdade + " anos de diferença (ELE é mais velho)");
                            }
                            if((homens[i].getIdadePessoa() < mulheres[c].getIdadePessoa())){
                                DiferencaIdade = mulheres[c].getIdadePessoa() - homens[i].getIdadePessoa();
                                System.out.println(mulheres[c].getNomePessoa() + ", " + DiferencaIdade + " anos de diferença (ELA é mais velha)");
                            }
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}