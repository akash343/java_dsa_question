import java.util.Scanner;
public class aa{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int N = 1;
        int tem=0;
        while(num>0 && N<num){
            if(num%N==0){
                tem++;
            }
            N++;
        }
        if(tem>=2){
            System.out.print("not a prime number");
        }
        else{
            System.out.print("A prime number");
               }
          }
     }
