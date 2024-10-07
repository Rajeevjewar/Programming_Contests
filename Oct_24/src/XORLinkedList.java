import java.util.ArrayList;
import java.util.List;

public class XORLinkedList {
    static class Node {
        int data;
        Node npx; // XOR of next and previous nodes

        Node(int data) {
            this.data = data;
            this.npx = null;
        }
    }
    public static void main(String[] args) {
        XORLinkedList xorList = new XORLinkedList();
        Node head = null;

        // Insert some elements
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);

        // Get the list of elements and print them
        List<Integer> result = getList(head);
        System.out.println(result);
    }
    static Node insert(Node head, int data) {
        Node temp = new Node(data);
        temp.npx = head;
        if (head != null) {
            head.npx = XOR(temp, head.npx);
        }
        return temp;
    }
    static List<Integer> getList(Node head) {
        List<Integer> ans = new ArrayList<>();
        Node curr = head, prev = null, nxt = null;

        while (curr != null) {
            ans.add(curr.data);
            nxt = XOR(prev, curr.npx);
            prev = curr;
            curr = nxt;
        }

        return ans;
    }
    static Node XOR(Node a, Node b) {
        return (Node)((a == null ? 0 : a.hashCode()) ^ (b == null ? 0 : b.hashCode()));
    }
}
