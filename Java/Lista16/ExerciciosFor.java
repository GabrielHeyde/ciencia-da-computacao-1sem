public class ExerciciosFor
{
    private int x;
    
    public void exercicio1(int x){
        for (int i=0; i<x; i++){
            String nome = Teclado.leString("Digite o nome: ");
            System.out.println(nome);
        }
    }
    
    public void exercicio2(int x){
        for (int i=0; i<=x; i++){
            System.out.println(i);
        }
        }
        
    public void exercicio3(int x){
        if (x<0){
            System.out.println("Erro! Valor negativo informado!");
        }
        else if(x>=0){
            for (int i=0; i<=x; i=i+2){
            System.out.println(i);
        }
    }
    }
    
    public void exercicio4(int x){
        if (x<0){
            System.out.println("Erro! Valor negativo informado!");
        }
        else if(x>=0){
            for (int i=x; i>=0; i=i-1){
            System.out.println(i);
            }
        }        
    }
    
    public void exercicio5(int x){
        int gremista=0;
        String time ="";
        for (int i=1; i<=x; i++){
            System.out.println("Digite o time da " + i + "ª pessoa: ");
            time = Teclado.leString();
            if (time.equals("Grêmio") || time.equals("grêmio") || time.equals("Gremio") || time.equals("gremio")){
                gremista++;
            }
        }
        System.out.println("Há " + gremista + " torcedor(es) do Grêmio entre estas pessoas.");
    }   

    public void exercicio6(int x){
        double somaNumeros = 0;
        for(int i = 0; i<x; i++){
            double escritos = Teclado.leDouble("Digite um número: ");
            somaNumeros = somaNumeros + escritos;
        }
        System.out.println("A soma dos números digitados é de: " + somaNumeros);
    }
    
    public void exercicio7(){
        System.out.println("Digite 10 valores inteiros.");
        int somaDosNumeros = 0;
        for(int i = 1; i<11;i++){
            int valor = Teclado.leInt("Digite o " + i + "º " + "valor");
            somaDosNumeros = somaDosNumeros + valor;
        }
        System.out.println("A soma dos valores informados é " + somaDosNumeros + ".");
    }
    
    public void exercicio8(int x){
        int quant = x;
        for(int i = 1; i<=quant; i++){
            int verificaSinal = Teclado.leInt("Digite o " + i + "º " + "valor:");
            if(verificaSinal==0){
                System.out.println("O número " + verificaSinal + " é igual a zero.");
            }
            if(verificaSinal>0){
                System.out.println("O número " + verificaSinal + " é positivo.");
            }
            if(verificaSinal<0){
                System.out.println("O número " + verificaSinal + " é negativo.");
            }
        }
    }
    
    public void exercicio9(){
        int val1 = Teclado.leInt("Digite um primeiro valor: ");
        int val2 = Teclado.leInt("Digite um outro valor: ");
        
        if(val1<0 || val2<0){
            System.out.println("Erro! Valor negativo informado.");
        }
        
        if(val1>=0 && val2>=0){
            int menor = 0;
            int maior = 0;
            if (val1>val2){
                menor = val2;
                maior=val1;
            }
            else if (val2>val1){
                menor = val1;
                maior = val2;
            }
            
            if (menor%2!=0){
                menor=menor+1;
            }
            
            for (int i=menor; i<=maior; i=i+2){
                System.out.println(i);
            }
        }
    }
    
    public void exercicio10(){
        int somaDosNumeros = 0;
        
        for(int i=1; i<199; i++){
            somaDosNumeros = somaDosNumeros + i;
        }
        System.out.println("A soma dos valores entre 1 e 198 é: " + somaDosNumeros);
    }
    
    public void exercicio11(){
        int val1 = Teclado.leInt("Digite um primeiro valor: ");
        int val2 = Teclado.leInt("Digite um outro valor: ");
        int menor = 0;
        int maior = 0;
        int somaDosImpares = 0;
        
        if (val1>val2){
            menor = val2;
            maior = val1;
        }
        else if (val2>val1){
            menor = val1;
            maior = val2;
        }
        
        if (menor%2==0){
            menor=menor+1;
        }
        
        for (int i=menor; i<=maior; i=i+2){
            somaDosImpares=somaDosImpares+i;
        }
        System.out.println("A soma dos número ímpares entre os valores informados é de: " + somaDosImpares);
    }
    
    public void exercicio12(){
        double somaDosNumeros = 0;
        for(;;){
            double numero = Teclado.leDouble("Digite um valor positivo para ser somado aos próximos ou um valor negativo para apresentar a soma dos números digitados até aqui: ");
            if (numero>=0){
                somaDosNumeros = somaDosNumeros + numero;
            }
            else{
                System.out.println("A soma dos números inseridos é de " + somaDosNumeros);
                break;
            }
        }
    }
    
    public void exercicio13(int x){
        int valor = x;
        for(int i = x-1; i>1; i--){
            valor = valor*i;
        }
        System.out.println("O fatorial do valor digitado é: " + valor);
    }
    
    public boolean exercicio14(int x){
        int verificaPrimos = 0;
        boolean primo=true;
        for (int i = x-1; i>1; i--){
            double resto = x%i;
            if(resto==0){
                verificaPrimos++;
            }
        }
        if(verificaPrimos==0){
            return primo = true;
        }
        if(verificaPrimos!=0){
            return primo = false;
        }
        return primo;
    }
    
        public void exercicio15(int x){
        int somaDosPrimos = 0;
        double verificaPrimos = 0;
        for (int i=1; i<=x; i++){
            for (int contador=i-1; contador>1; contador--){
                double restoDaDivisao = i%contador;
                if (restoDaDivisao==0){
                    verificaPrimos++;
                }
            }
            if (verificaPrimos==0){
                System.out.println(i);
                somaDosPrimos=somaDosPrimos+i;
            }
            verificaPrimos=0;
        }
            System.out.println("");
            System.out.println("A soma dos número primos entre 0 e " + x + " é de: " + somaDosPrimos);
    }
    }