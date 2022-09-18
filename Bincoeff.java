import java.util.Scanner;
public class aa{
    
    public static int factorial(int n){
        int f=1;
        for(int i =1;i<=n;i++){
        f=f*i;
        }
            return f;//factorial of n
        }
            
    
    public static int bincoeff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    
    }
public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int b = obj.nextInt();
    
     
    System.out.print(bincoeff(a,b));

}
}
