public class Principal{
public static void main(String[] args){
    int x = 0;
    while(x==0){
            System.out.println("__________MENU__________");
    System.out.println(" ");
    System.out.println("1. conta até 300");
    System.out.println("2. imprime pares");
    System.out.println("3. verifica primo");
    System.out.println(" ");
    
    int opcao = Teclado.leInt("Digite a opção desejada: ");
    System.out.println(" ");
    if(opcao==1){
        int valorX = Teclado.leInt("Digite o valor de X");
        System.out.println(" ");
        Exercicios playContador = new Exercicios(valorX);
        playContador.contador();
        System.out.println(" ");
    }
    
    if(opcao==2){
        int valorX = Teclado.leInt("Digite o valor de X");
        System.out.println(" ");
        Exercicios playPares = new Exercicios(valorX);
        playPares.imprimePares();
        System.out.println(" ");
    }
    
    if(opcao==3){
        int valorX = Teclado.leInt("Digite o valor de X");
        System.out.println(" ");
        Exercicios playPrimos= new Exercicios(valorX);
        System.out.println(playPrimos.verificaPrimos());
        System.out.println(" ");
    }
    
    else if(opcao>3 || opcao<1){
        System.out.println("Obrigado por usar nosso sistema!:D ");
        break;
    }
}
}
}