public class Questão6
{
    int[] a = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9};
    boolean[] b = new boolean[a.length];
    
    public void questão6(){
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                b[i] = true;
            }
            
            if(a[i]<0 || a[i]==0){
                b[i] = false;
            }
        }
        
        for(int i=0; i<a.length; i++){
            System.out.println(b[i]);
        }
    }
}