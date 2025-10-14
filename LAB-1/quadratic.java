import java.util.Scanner;
import java.lang.Math;
class quadratic{
    public static void main(String args[]){
        int a,b,c;
        double r1,r2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter values for a,b,c:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a==0)
        {
            System.out.println("Not a Quadratic Equation");
        }
        int d = b*b-4*a*c;
        if(d==0)
        {
           r1 = r2= (-b)/(2*a);
           System.out.println("Roots are real and equal");
           System.out.println("The roots are:"+r1+"and"+r2);
        }
        else if(d>0){
              r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
              r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
              System.out.println("The roots are:"+r1+"and"+r2);
        }
        else if(d<0){
            System.out.println("Roots are imaginary");
            r1 = (-b)/(2*a);
            r2 = Math.sqrt(-d)/(2*a);
            System.out.println("The roots are:"+r1+"and"+r2);
        }
        else{
            System.out.println("Invalid");
        }
    }
}