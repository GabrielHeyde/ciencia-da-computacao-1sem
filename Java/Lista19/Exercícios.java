import java.util.Random;
public class Exercícios
{
    public void exercício1(){
        double[] notasDoAluno = new double[Teclado.leInt("Digite o número de notas que serão inseridas: ")];
        
        for(int i = 0; i<notasDoAluno.length; i++){
            notasDoAluno[i] = Teclado.leDouble("Digite a nota do aluno: ");
        }
        
        double somaDasNotas = 0;
        for(int i = 0; i<notasDoAluno.length; i++){
            somaDasNotas = somaDasNotas + notasDoAluno[i];
        }
        System.out.println(somaDasNotas/notasDoAluno.length);
    }
    
    public void exercicio2(){
        String[] nomes = new String[Teclado.leInt("Digite a quantidade de nomes que serão digitados: ")];
        
        for(int i =  0; i<nomes.length; i++){
            nomes[i] = Teclado.leString("Digite o nome: ");
        }
        
        for(int i = 0; i<nomes.length; i++){
            if(i<nomes.length-2){
                System.out.print(nomes[i] + ", ");
            }
            
            if(i==nomes.length-2){
                System.out.print(nomes[i] + " e ");
            }
            
            if(i==nomes.length-1){
                System.out.println(nomes[i]);
            }
        }
    }
    
    public int exercicio3(){       
        int[] inteiros = new int[Teclado.leInt("Digite o número de valores que serão informados: ")];
        
        for (int i = 0; i<inteiros.length; i++){
            inteiros[i] = Teclado.leInt("Digite um valor: ");
        }
        
        int somaDosInteiros = 0;
        for(int i = 0; i<inteiros.length; i++){
            somaDosInteiros = somaDosInteiros + inteiros[i];
        }
        
        for(int i = 0; i<inteiros.length; i++){
            System.out.println(inteiros[i]);
        }
        System.out.print("A soma dos elementos no arrays é de: ");
        return somaDosInteiros;
    }
    
    public boolean procuraNome(){
        String[] nomes = {"Pedro", "Lucas", "Felipe", "Gabriel", "Davison", "Raphael", "Nicolas", "João", "Marcelo", "André"};;
        String nome = "Gabriel";
        int contador = 0;
        
        for(int i = 0; i<nomes.length; i++){
            System.out.print(nomes[i] + " ");
        }
        
        System.out.println("O nome procurado é: " + nome);
        
        for(int i = 0; i<nomes.length; i++){
            if(nomes[i] == nome){
                System.out.println("Nome localizado na posição de memória " + i + "!");
                contador++;
            }
        }
        if(contador>0){
        return true;
        }
        else{
        return false;
        }
    }
    
    public void exercício5(){
        int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] b = {6,9,7,12,54,23,21,11,47,15,19,98,62,11,22,33};
        
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        System.out.println("");
        
        for(int i = 0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        
        System.out.println("");

        if(a.length!=b.length){
            System.out.print("null");
        }
        else{
            int[] c = new int[a.length];
            for(int i=0; i<a.length; i++){
                c[i] = (a[i] + b[i]);
            }
            
            for(int i=0; i<c.length; i++){
                System.out.println(c[i]);
            }
        }
    }
    
    public void exercício6(){
        double[] dd = {-1,2,-3,4,-5,6,-7,8,-9};
        
        double maiorValor = dd[0];
        double menorValor = dd[0];
        double somaDoArray = 0;
        
        for(int i = 0; i<dd.length; i++){
            System.out.print(dd[i] + " ");
        }
        
        for(int i = 0; i<dd.length; i++){
            if(dd[i]>maiorValor){
                maiorValor=dd[i];
            }
            if(dd[i]<menorValor){
                menorValor=dd[i];
            }
            somaDoArray = somaDoArray + dd[i];
        }
        System.out.println("\nO maior valor encontrado no array é " + maiorValor + "\nO menor valor encontrado no array é " + menorValor + "\nA média dos valores encontrados dentro do Array é de " + somaDoArray/dd.length);
    }
    
    public void exercício7(){
        int[] aleatorio = new int[(int)((Math.random( )*100)+1)];
        
        for(int i = 0; i<aleatorio.length; i++){
            aleatorio[i] = (int) ((Math.random( )*1000)+1);
        }
        
        System.out.println("O tamanho do Arrays é de " + aleatorio.length + ":");
        for(int i = 0; i<aleatorio.length; i++){
            if(i<aleatorio.length-1){
            System.out.print(aleatorio[i] + " - ");
            }
            
            else{
                System.out.print(aleatorio[i]);
            }
        }
    }
}