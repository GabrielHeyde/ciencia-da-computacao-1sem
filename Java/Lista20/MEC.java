public class MEC
{
    private Universidade[] universidade;

    public MEC(Universidade[] universidade)
    {
        this.universidade = universidade;
    }

    public void setUniversidade(Universidade[] universidade){
        this.universidade = universidade;
    }
    
    public Universidade[] getUniversidade(){
        return universidade;
    }
    
    public void imprimeUniversidades(){
        for(int i = 0; i<universidade.length; i++){
            if(universidade[i] instanceof Publica){
                Publica q = (Publica) universidade[i];
                System.out.println("Universidade Pública");
                System.out.println(q.toString());
                System.out.println("");
            }
            
            if(universidade[i] instanceof Particular){
                Particular p = (Particular) universidade[i];
                System.out.println("Universidade Particular");
                System.out.println(p.toString());
                System.out.println("");
            }
        }
    }
    
    public void maisCara(){
        int salvaX = 0;
        for(int i = 0; i<universidade.length; i++){
            if(universidade[i] instanceof Particular){
                Particular p = (Particular) universidade[i];
                if(p.getValor() > salvaX){
                    salvaX = i;
                }
            }
        }
        System.out.println(universidade[salvaX].toString());
    }
    
    public void universidadesDoSul(){
        for(int i = 0; i<universidade.length; i++){
            if(universidade[i] instanceof Publica){
                Publica q = (Publica) universidade[i];
                if(q.getEstado().equals("RS")  || q.getEstado().equals("SC") || q.getEstado().equals("PR")){
                    System.out.println(q.toString());
                    System.out.println("");
                }
            }
        }
    }
}