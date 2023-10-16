public class Principal
{
    public static void main(String args[]){
        String nomePessoa1 = "Joaquim";
        char sexoPessoa1 = 'M';
        int idadePessoa1 = 19;
        double alturaPessoa1 = 1.78;
        int irmaosPessoa1 = 0;
        String enderecoPessoa1 = "Rua C,145";
        Pessoa pessoa1 = new Pessoa(nomePessoa1,sexoPessoa1,idadePessoa1,alturaPessoa1,irmaosPessoa1,enderecoPessoa1);
        
        
        String nomePessoa2 = "Manuelita";
        char sexoPessoa2 = 'F';
        int idadePessoa2 = 30;
        double alturaPessoa2 = 1.67;
        int irmaosPessoa2 = 3;
        String enderecoPessoa2 = "Rua dos Camelos,12";
        Pessoa pessoa2 = new Pessoa(nomePessoa2,sexoPessoa2,idadePessoa2,alturaPessoa2,irmaosPessoa2,enderecoPessoa2);
        
        String nomePessoa3 = "Pedro";
        char sexoPessoa3 = 'M';
        int idadePessoa3 = 10;
        double alturaPessoa3 = 1.91;
        int irmaosPessoa3 = 1;
        String enderecoPessoa3 = "Rua dos Gigantes,189";
        Pessoa pessoa3 = new Pessoa(nomePessoa3,sexoPessoa3,idadePessoa3,alturaPessoa3,irmaosPessoa3,enderecoPessoa3);        
    }
}
