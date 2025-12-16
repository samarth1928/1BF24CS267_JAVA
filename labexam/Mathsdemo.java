import Maths.Number;
public class Mathsdemo {
    public static void main(String[] args){
        
        Number ob=new Number(20,0);
        ob.add();
        ob.subtract();
        try {
            ob.division();
        }
         catch (Exception e)
          {
            System.out.println("Error="+e);
        }
    }
}
