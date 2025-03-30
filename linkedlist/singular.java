public class singular {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

    // add -first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    // add last=>first search the next node is null
    // and then make point the last node next to the new node
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("NUll");
    }

    // to delete from the front
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;

    }

    // to delete from the last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;// head.next=null->lastNode=null
        while (lastNode.next != null) {// null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast.next=null;
    }

    public void reverseIterate(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public Node reverseRecursion(Node head){
        if(head==null||head.next==null){
            return head;
        }
       Node NewHead= reverseRecursion(head.next);
       head.next.next=head;
       head.next=null;

       return NewHead;
    }
    public static void main(String args[]) {
        singular s1 = new singular();

        s1.addFirst("my");
        s1.addLast("name");
        s1.addLast("is");
        s1.addLast("Ashish");
        s1.printList();
        s1.reverseIterate();
        System.out.println();
        s1.printList();
        System.out.println();
        s1.head=s1.reverseRecursion(s1.head);
        s1.printList();

    }

}
