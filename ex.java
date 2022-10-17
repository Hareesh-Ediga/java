import java.util.Scanner;
class ex {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        //int i=0;
        System.out.print("enter no :");
        int n=sn.nextInt();
       // int sum=0;
        
        for(i=0;i<n;i++)
        {   
            sum +=i;
            
            if(sum==10)
            {
                continue;
            }
            i++;
            System.out.println("sum"+i+"is :"+sum);
        }
    }

   // System.out.println("")
}