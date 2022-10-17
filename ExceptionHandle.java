import java.util.Scanner;
class ExceptionHandle{
    public static void main(String[] args){
        Scanner sn= new Scanner(System.in);
        System.out.println("enter two no:");
        int n1= sn.nextInt();
        int n2= sn.nextInt();
        System.out.println("Division value :"+ div(n1,n2));
        System.out.println("End program");
    }
    
    public static int div(int a, int b)
    {
        try{
            int sum = a/b;
        //sum = (a+b);
       return sum;}
       catch(ArithmeticException ae){
            ae.printStackTrace();
            return 0;
       }
       //System.out.println(sum);
    }
}