import java.util.Scanner;
class loop{
    public static void main(String[] args){
        Scanner sn= new Scanner(System.in);
        System.out.println("enter a no :");
        int n=sn.nextInt();        
        int i=1;

    //    do{
    //         System.out.println("appu"+i);
    //         i++;
    //     } while(i<=n);

    //     System.out.println("end");
    for(i=1;i<=n;i++){
        System.out.println("appu"+i);
    }


    }
}