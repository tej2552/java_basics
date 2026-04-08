package Challenge.LinkedLists;

import java.util.ArrayList;

public class LLUtils {

    public Node insertAtEnd(Node head, int num){
        Node newNode = new Node(num);
        Node temp = head;

        if(head == null){
            head = newNode;
        }else if(head.next == null){
            head.next = newNode;
        }else {
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }

        newNode.next = null;

        return head;
    }

    public Node insertAtBeg(Node head, int num){
        Node newNode = new Node(num);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    public Node reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        Node forw;

        while (curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        head = prev;

        return head;
    }

    public void printList(Node head){
        Node temp = head;

        if(head == null){
            System.out.println("List is empty");
        }else {
            while (temp != null) {
                System.out.print(temp.value);
                if (temp.next != null) {
                    System.out.print(" -> ");
                }else{
                    System.out.println(" -> null ");
                }
                temp = temp.next;
            }
        }
    }

    public Node traverse(Node head){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        return temp;
    }

    public void mergeLists(ArrayList<Node> heads){

        Node head = null, temp;

        for(Node h : heads){
            if (h != null) {
                head = h;
                break;
            }
        }

        for(int i = 0 ; i < heads.size() - 1 ; i++){
            if(heads.get(i) != null){
                temp = traverse(heads.get(i));
                Node nextList = heads.get(i+1);
                if (nextList == null) {
                    continue;
                }
                temp.next = nextList;
            }
        }

        printList(head);
    }
}

