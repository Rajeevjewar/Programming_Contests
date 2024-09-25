// Problem Title: Palindrome Linked List
// Date: 25/09/2024
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        // Check if the linked list is a palindrome and print the result
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
    static boolean isPalindrome(Node head) {
        Node slow = head, fast = head.next;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node curr = slow.next, nxt = null, prev = null;
        slow.next = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        while(prev!=null){
            if(prev.data!=head.data) return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
