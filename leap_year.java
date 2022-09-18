import java.util.Scanner;
class aa{
   public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       int year = obj.nextInt();
       if(year%4==0){
           System.out.print("leap year");

       }
       else if(year%400==0){
           System.out.print("leap year");
       }
        else if (year%100==0){
           System.out.print(" not a leap year");
            
                
           
        }
   }
}
