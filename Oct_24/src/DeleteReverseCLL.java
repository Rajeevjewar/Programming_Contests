public class DeleteReverseCLL {
    public static void main(String[] args) {

    }
    Node reverse(Node head) {
        Node curr = head.next, nxt = null, prev= head;
        while(curr!= head){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head.next = prev;
        return prev;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        Node temp = head.next, prev=head;
        if(head.data == key){
            while(temp!=head){
                prev = temp;
                temp = temp.next;
            }
        }
        else{
            while(temp!=head && temp.data!= key){
                prev =temp;
                temp = temp.next;
            }
        }
        if(head.data == key || temp!=head)
            prev.next = temp.next;
        return head.data == key?prev.next:head;
    }

}
