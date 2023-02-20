import java.util.*;
class UserDefined {
    public static void main(String[] args){
    int n,i;

        
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Numbers");
       n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++ ){
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++){
        System.out.println(a[i]);

      }
    }
}
