import java.util.*;
public class arrayCreation {
    public static void main(String[] args){
            int n,m,p;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n+1];
            System.out.println("Enter the numbers of Element in Array");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the index in which you want to insert: ");
            m=sc.nextInt();
            System.out.println("Enter the number which you want to insert: ");
            p=sc.nextInt();
            for(int i=0;i<n+1;i++){
                if(i<m){
                    b[i]=a[i];
                }
                else if(i==m){
                    b[i]=p;
                }
                else {
                    b[i]=a[i-1];
                }
            }
            System.out.println("Elements are: ");
            for(int i=0;i<n+1;i++){
                System.out.println(b[i]);
            }
        }
    }
