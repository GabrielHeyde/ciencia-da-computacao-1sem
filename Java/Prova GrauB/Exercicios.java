public class Exercicios
{
    public int exercicioA(String[] p){
        int somaDosTextos = 0;
        
        String textoBuscado = Teclado.leString("Digite o texto que você deseja buscar no array: ");
        
        for(int g = 0; g<p.length; g++){
            if(p[g].equals(textoBuscado)){
                somaDosTextos++;
            }
        }
        
        return somaDosTextos;
    }
    
    public int[] exercicioB(int[] a, int[]b, int[]c){
        int somaA = 0;
        int somaB = 0;
        int somaC = 0;
        for(int q = 0; q<a.length; q++){
            somaA = somaA + a[q];
        }
        for(int w = 0; w<b.length; w++){
            somaB = somaB + b[w];
        }
        for(int e = 0; e<c.length; e++){
            somaC = somaC + c[e];
        }
        
        if(somaA > somaB && somaA > somaC){
            return a;
        }
        else if(somaB > somaA && somaB > somaC){
            return b;
        }
        else{
            return c;
        }
    }
    
    public int[] exercicioC(int x, int y){
        if(y > x){
            int tamanhoDoArray = (y - x) + 1;
        
            int[] elementos = new int[tamanhoDoArray];
        
            for(int r = 0; r<elementos.length; r++){
                elementos[r] = x + r;
            }
        
            return elementos;
        }
        else{
            return null;
        }
    }
}