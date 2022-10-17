import java.util.Scanner;
class method{
    public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    System.out.println("enter two no :");
    int n1 =sn.nextInt();
    int n2 = sn.nextInt();
    div(n1,n2);
    sum(n1,n2);
    //System.out.println(sum);

}
    public static void div(int a,int b)
    {
        int div=a/b;
        System.out.println("Div :"+div);
    }
    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println("sum :"+sum);
    }
}