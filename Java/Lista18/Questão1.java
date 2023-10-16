public class Questão1
{
    int[] e3 = new int[10];
    int[] e4 = new int[10];
    public void exercicio3()
    {
       int x = 0;
       for(int i=1; i<=5; i++){
           e3[x] = i;
           x++;
       }
       
       for(int c=10; c<51; c=c+10){
           e3[x] = c;
           x++;
       }
       
       for(int d=0; d<e3.length; d++){
           System.out.println(e3[d]);
       }
    }
    
    public void exercicio4()
    {
        int x = 0;
        for(int i=3; i<=4;i++){
            e4[x] = i;
            x++;
        }
        
        int y = 3;
        int z = 0;
        for(int i=4; i<83;i=z){
            z=i+y;
            e4[x] = z;
            y=y+2;
            x++;
        }
        
        for(int i=0; i<e4.length;i++){
            System.out.println(e4[i]);
        }
    }
}