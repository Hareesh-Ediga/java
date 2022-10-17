import java.util.Scanner;
class simple{
    public static void main(String args[]){
        Scanner sn= new Scanner(System.in);
        //String name;
        int a,b,c;
        //float marks;
        System.out.println("enter a:");
        a=sn.nextInt();
        System.out.println("enter b:");
        b=sn.nextInt();
        c=a+b;
        //System.out.println("enter marks:");
        //marks=sn.nextFloat();
        sn.close();

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("total:"+c);
        


    }
}