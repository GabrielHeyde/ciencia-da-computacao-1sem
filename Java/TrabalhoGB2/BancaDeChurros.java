public class BancaDeChurros
{
    private Churros[] banca;

    public BancaDeChurros(Churros[] banca)
    {
        this.banca = banca;
    }

    public void setBanca(Churros[] banca){
        this.banca = banca;
    }
    
    public Churros[] getBanca(){
        return banca;
    }
    
    public String estoqueChurros(String saborA){
        int nSabor = 0;
        for(int i = 0; i<banca.length; i++){
            if(banca[i].getSabor().equals(saborA)){
                nSabor++;
            }
        }
        if(nSabor == 0){
            return "NÃO HÁ ESTE SABOR EM ESTOQUE!";
        }
        else{
            return "O número de churros do sabor " + saborA + " é de: " + nSabor;
        }
    }
    
    public boolean insereChurros(Churros churrosA){
        for(int i = 0; i<banca.length; i++){
            if(banca[i] == null){
                banca[i] = churrosA;
                return true;
            }
        }
        return false;
    }
    
    public double valorTotal(){
        double precoTotal = 0;
        for(int i = 0; i<banca.length; i++){
            precoTotal = precoTotal + banca[i].getPreco();
        }
        return precoTotal;
    }
    
    public boolean vendeChurros(String saborB){
        for(int i = 0; i<banca.length; i++){
            if(banca[i]!=null){
                if(banca[i].getSabor().equals(saborB)){
                    System.out.println("Este churros custou: " + banca[i].getPreco());
                    banca[i] = null;
                    return true;
                }
            }
        }
        System.out.println("Não há churros do sabor solicitado!");    
        return false;
    }
    
    public void imprimeChurros(){
        for(int i = 0; i<banca.length; i++){
            if(banca[i] != null){
                System.out.println("Sabor: " + banca[i].getSabor() + " e " + "Preço: " + banca[i].getPreco());
            }
        }
    }
    
    public void lePedidos(String nome, String saborC, int quantChurros){
        int estoque = 0;
        for(int i = 0; i<banca.length; i++){
            if(banca[i]!=null){
                if(banca[i].getSabor().equals(saborC)){
                estoque++;
                }
            }
        }
        if(estoque >= quantChurros){
            System.out.println(nome + " Pedido realizado com sucesso!");
        }
        if(estoque < quantChurros){
            System.out.println(nome + ":" + " Falha no pedido!");
        }
    }
}