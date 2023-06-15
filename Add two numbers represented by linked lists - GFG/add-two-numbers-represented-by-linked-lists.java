//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        Node h1=reverseList(first);
        Node h2=reverseList(second);
        // int sum=0;
        Node res=new Node(-1);
        Node fa=res;
        int carry=0;
        while(h1!=null || h2!=null || carry!=0)
        {
            int sum=0;
            if(h1!=null)
            {
                sum+=h1.data;
                h1=h1.next;
            }
            if(h2!=null)
            {
                sum+=h2.data;
                h2=h2.next;
            }
            sum+=carry;
            carry=sum/10;

        
            Node dummy3=new Node(sum%10);
            fa.next=dummy3;
            fa=fa.next;
            
        
        }
        return reverseList(res.next);
        
       
    }
    public static Node reverseList(Node head)
    {
        Stack<Integer>st=new Stack<>();
        Node temp=head;
        Node dummy=new Node(-1);
        Node ans=dummy;
        while(temp!=null)
        {
            st.add(temp.data);
            temp=temp.next;
        }
        while(!st.isEmpty())
        {
            Node dummy1=new Node(st.pop());
            dummy.next=dummy1;
            dummy=dummy.next;
        }
        return ans.next;
    }
}