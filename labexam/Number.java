package Maths;
class ZeroDivisionException extends Exception{
    ZeroDivisionException(String msg){
        super(msg);
    }

}

public class Number {
    public int a;
    public int b;
    public int result;
    public Number(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        result=a+b;
        System.out.println("a+b="+result);
    }
    public void subtract(){
        result=a-b;
        System.out.println("a-b="+result);
    }
    public void division()throws ZeroDivisionException{
        if(b==0){
            throw new ZeroDivisionException("B cannot be zero gives zero division error");
        }
        else{
            result=a/b;
            System.out.println("a/b="+result);
        }
    }
    }

