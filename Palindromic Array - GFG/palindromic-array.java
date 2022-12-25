//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
               int flag=0;
               for(int num:a)
               {
                   if(palindrome(num)==true);
                   else
                   {
                       flag=1;
                       break;
                   }
                   
               }
               if(flag==0)return 1;
               else
               {
                   return 0;
               }
                 
           }
    public static boolean palindrome(int n)
    {
        String str=String.valueOf(n);
        int lo=0;
        int hi=str.length()-1;
        int f=0;
        while(lo<=hi)
        {
            if(str.charAt(lo)==(str.charAt(hi)));
            else
            {
                f=1;
                break;
            }
            lo++;
            hi--;
        }
        if(f==0)return true;
        else
        {
            return false;
        }
    }
}