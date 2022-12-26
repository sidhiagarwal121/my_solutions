//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer>st=new Stack<>();
        for(char ch:S.toCharArray())
        {
            if(ch=='+')
            {
                int num1=(int)(st.peek());
                st.pop();
                int num2=(int)(st.peek());
                st.pop();
                st.push(num1+num2);
                
            }
            else if(ch=='-')
            {
                int num1=(int)(st.peek());
                st.pop();
                int num2=(int)(st.peek());
                st.pop();
                st.push(num2-num1);
                
            }
            else  if(ch=='*')
            {
                int num1=(int)(st.peek());
                st.pop();
                int num2=(int)(st.peek());
                st.pop();
                st.push(num1*num2);
                
            }
            else if(ch=='/')
            {
                int num1=(int)(st.peek());
                st.pop();
                int num2=(int)(st.peek());
                st.pop();
                st.push(num2/num1);
                
            }
            else
            {
                st.push(ch-'0');
            }
                
            
        }
        return st.peek();
    }
}