import java.util.*;
class User{
    public static void main(String[] args){
        int i,j,n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n=sc.nextInt();
        System.out.println("Enter the number of columns");
        m=sc.nextInt();
        int a[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
}
