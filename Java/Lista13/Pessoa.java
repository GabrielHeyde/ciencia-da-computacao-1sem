public class Pessoa
{
    private String nome;
    private char sexo;
    private int idade;
    private double altura;
    private int irmaos;
    private String endereco;
    public Pessoa()
    {
        nome = "João";
        sexo = 'M';
        idade = 18;
        altura = 1.60;
        irmaos = 1;
        endereco = "Rua dos Bobos, número 0";
    }
    
        public Pessoa(String nomeNovo, char sexoNovo, int idadeNovo, double alturaNovo, int irmaosNovo, String enderecoNovo)
    {
        nome = nomeNovo;
        sexo = sexoNovo;
        idade = idadeNovo;
        altura = alturaNovo;
        irmaos = irmaosNovo;
        endereco = enderecoNovo;
        System.out.println("Nome: "+ nome);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Quantidade de Irmãos: "+ irmaos);
        System.out.println("Endereço: "+ endereco);
        if (irmaos==0 && sexo == 'M'){
        System.out.println("Filho único");}
        else if (irmaos==0 && sexo == 'F'){
        System.out.println("Filha único");}
        else if (irmaos>0 && sexo == 'F'){
        System.out.println("Não é filha única");}
        else if (irmaos>0 && sexo == 'M'){
        System.out.println("Não é filho único");}
        System.out.println("");
    }
}