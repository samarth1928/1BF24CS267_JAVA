import java.util.Scanner;

class WrongAge extends Exception{
    public WrongAge(String msg){
          super(msg);
    }
}

class Father{
    int fage;
    Father(int fage) throws WrongAge{
        this.fage=fage;
     if(fage< 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }
}
class Son extends Father {
    int sage;

    Son(int fage, int sage) throws WrongAge {
        super(fage);  
        this.sage=sage;
    
        if (sage < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        if (sage >= fage) {
            throw new WrongAge("Son's age cannot be greater than father's age");
        }
    }

    void display1() {
        System.out.println("Father's Age: " + fage);
        System.out.println("Son's Age: " + sage);
    }
}


public class age{
     public static void main(String[] args){
       try{
          Scanner s = new Scanner(System.in);
          System.out.println("Enter Father's age:");
          int fage=s.nextInt();
          System.out.print("Enter Son Age: ");
          int sage = s.nextInt();
          Son ob=new Son(fage,sage);
          ob.display1();
          }
        catch(WrongAge e){
            System.out.println("error:"+e);
        }
     }
}



