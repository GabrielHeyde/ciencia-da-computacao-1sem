//Gabriel Heyde Pintos
public class Cliente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;

    public Cliente(String nome, int idade, char sexo, String email, String senha)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }
    
        public void setNome(String nome){
        this.nome = nome;
    }
    
        public void setIdade(int idade){
        this.idade = idade;
    }
    
        public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
        public void setEmail(String email){
        this.email = email;
    }
    
        public void setSenha(String senha){
        this.senha = senha;
    }
    
        public String getNome(){
        return nome;
    }
    
        public int getIdade(){
        return idade;
    }
    
        public char sexo(){
        return sexo;
    }    
    
        public String email(){
        return email;
    }
    
        public String senha(){
        return senha;
    }    
    
    public void imprimeInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
    }
}
