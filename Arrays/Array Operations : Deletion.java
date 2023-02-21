import java.util.*;
public class Deletion {
    public static void main(String[] args){
        int n,m,p;
        System.out.println("Enter the number of elements in array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       // System.out.println("Enter the number of elements in array");
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.println("Enter Values");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the index value which you want to be Deleted: ");
        m=sc.nextInt();
        for(int i=0;i<a.length;i++) {
//            if(i<m){
//                b[i]=a[i];
//            }
//            else if(i==m){
//                continue;
//            }
//            else {
//                b[i]=a[i];
//            }
            if (i == m)
                continue;
            else
                b[i] = a[i];
        }
            System.out.println("Elements are: ");
            for(int i = 0; i<b.length; i++){
                System.out.println(b[i]);
            }

        }

    }

