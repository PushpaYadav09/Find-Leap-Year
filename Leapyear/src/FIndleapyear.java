import java.util.*;
class Findleaoyear{

    static boolean year(int year){
        if(year%4==0)
          return true;
        if(year%100==0)
            return false;
        if(year%4==0)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year(year)==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}