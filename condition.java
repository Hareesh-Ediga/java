import java.util.Scanner;
class condition{
    public static void main(String[] args){
        int c;
        //String c;
        Scanner sn = new Scanner(System.in);
        //System.out.println("enter one of  (+,-,*,/)");
        //c=sn.netxLine();
        System.out.println("c:");
        c=sn.nextInt();
       // b=sn.nextInt();
        switch(c){
            case 1 :
                    System.out.println("sun");
                    break;
             case 2 :
                    System.out.println("mun");
                    break;
             case 3 :
                    System.out.println("tu");
                    break;
             case 4 :
                    System.out.println("wed");
                    break;
            default : 
                         System.out.println("invalid input");
        }

        //System.out.println("result"+d);

    }
}
