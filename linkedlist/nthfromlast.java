public class nthfromlast {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add from the first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add from the last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ---> ");
            currNode = currNode.next;
        }
        System.out.print("NULL\n");
    }
    public void findNth(int n){
        
        Node currNode=head;
        int size=0;
        while(currNode!=null){
            currNode=currNode.next;
            size++;
        }
        int indexTofind=size-n;
        int i=0;
        Node curr=head;
        while(i<indexTofind){
            curr=curr.next;
            i++;
        }
        System.out.println(curr.data);



    }
    public void deleteNth(int n){
        Node currNode=head;
        int size=0;
        while(currNode!=null){
            currNode=currNode.next;
            size++;
        }
        Node prevNode=head;
        int i=0;
        int indexOfprevNode=size-n-1;
        while(i<indexOfprevNode){
            prevNode=prevNode.next;
            i++;
        }
        prevNode.next=prevNode.next.next;//it skip the one node and point towards another word
    }

    public static void main(String args[]) {
        nthfromlast obj = new nthfromlast();
        obj.addFirst("ashish");
        obj.addFirst("raj");
        obj.addLast("poudel");
        obj.printList();
        obj.findNth(2);
        obj.deleteNth(2);
        obj.printList();
    }
}
