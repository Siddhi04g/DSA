//GFG
import java.util.*;
public class CheckArithmeticProg {
    public static boolean checkIsAP(int arr[],int n)
    {
        // code here
        int diff;
        int count=0;
        Arrays.sort(arr);
        diff=arr[1]-arr[0];
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]==diff)
            count++;
        }
        if(count==n-1)
        return true;
        else
        return false;
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size and array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println("no.of split");
        boolean ans=checkIsAP(arr,n);
        System.out.print(ans);
        sc.close();
    }

}


