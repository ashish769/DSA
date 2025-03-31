public class hareTurtle {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a new node to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return; // Exit after setting the head
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) { // Traverse until the end
            System.out.print(currNode.data + " ----> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Detect if the list has a cycle
    public boolean hasCycle() {
        Node hare = head;
        Node turtle = head;

        if (head == null || head.next == null) {
            return false; // No cycle if list is empty or has one node
        }

        while (hare != null && hare.next != null) {
            hare = hare.next.next; // Move hare two steps
            turtle = turtle.next; // Move turtle one step
            if (hare == turtle) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }

   
 public void createCycle(int pos){
    if(head.next==null||pos<0)return;
    Node currNode=head;
    Node cycleNode=null;
    int index=0;
    while(currNode.next!=null){
        if(index==pos){
            cycleNode=currNode;
        }
        currNode=currNode.next;
        index++;
    }
    currNode.next=cycleNode;
 }
    // Main method to test
    public static void main(String[] args) {
        hareTurtle ht = new hareTurtle();

        ht.addLast(1);
        ht.addLast(2);
        ht.addLast(3);
        ht.addLast(4);
        ht.addLast(5);

        System.out.println("Linked List:");
        ht.printList();

        System.out.println("\nCycle Detection (before creating a cycle):");
        System.out.println(ht.hasCycle()); // Should return false

        // Create a cycle and test again
        ht.createCycle(2); // Creates a cycle starting at node with value 3

        System.out.println("\nCycle Detection (after creating a cycle):");
        System.out.println(ht.hasCycle()); // Should return true

   
    }
}
