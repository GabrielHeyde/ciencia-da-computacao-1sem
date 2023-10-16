public class Questão2
{
    double a[] = new double[5];   
    public void questão2()
    {
        int x = 0;
        for(int i=7; i<36; i=i+7)
        {
            a[x] = i;
            x++;
        }
        
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}