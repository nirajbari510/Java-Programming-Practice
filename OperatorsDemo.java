public class OperatorsDemo {
    void add(int a,int b){
        int sum=a+b;
        System.out.println("addition:"+sum);
    }
    int multiply(int a,int b){
        return a*b;
    }
    public static void main( String[] args){
     
    int x=21,y=22;

    System.out.println("x + y ="+(x+y));
    System.out.println("x - y ="+(x-y));
    System.out.println("x * y ="+(x*y));
    System.out.println("x / y ="+(x/y));
    System.out.println("x % y ="+(x%y));

    byte a=10,b=20;
    int result=a+b;
    System.out.println("Arithmatic promotion result:" +result);


    OperatorsDemo obj=new OperatorsDemo();
    obj.add(4, 6);
    int product=obj.multiply(4,6);
    System.out.println("Multiplication:" + product);
    }
}