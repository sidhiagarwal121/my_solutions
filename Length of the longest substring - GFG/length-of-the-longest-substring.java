//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        HashSet<Character>hs=new HashSet<>();
        int ans=0;
        int i=0;
        int j=0;
        while(i<S.length())
        {
            if(!hs.contains(S.charAt(i)))
            {
                hs.add(S.charAt(i++));
                ans=Math.max(ans,hs.size());
                
            }
            else
            {
                hs.remove(S.charAt(j++));
            }
        }
        return ans;
        
    }
}