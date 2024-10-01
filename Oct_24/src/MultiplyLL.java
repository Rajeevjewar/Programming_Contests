// Problem Name: Multiply Two Linked Lists
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
public class MultiplyLL {
    public static void main(String[] args) {

    }
    }
    public static long listToNum(Node node){
        long num = 0, mod = 1000000007;
        while(node!= null){
            num = (num*10+node.data)% mod;
            node = node.next;
        }
        return num;
    }
    public long multiplyTwoLists(Node first, Node second) {
        long num1= listToNum(first);
        long num2 = listToNum(second);
        return (num1*num2)%1000000007;
    }
}
