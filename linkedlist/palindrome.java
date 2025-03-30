public class palindrome {
        Node head;
        public class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }

        }
            //add from the first
            public void addFirst(int data){
                Node newNode= new Node(data);
                if(head==null){
                    head=newNode;
                    return;
                }
                newNode.next=head;
                head=newNode;
            }
            //add fron the last
            public void addLast(int data){
                Node newNode=new Node(data);
                if(head==null){
                    head=newNode;
                    return;
                }
                Node currNode=head;
                while(currNode.next!=null){
                    currNode=currNode.next;
                }
                currNode.next=newNode;
            }
            //print the list
            public void printList(){
                Node currNode=head;
                while(currNode!=null){
                    System.out.print(currNode.data+"--->");
                    currNode=currNode.next;
                }
                System.out.print("Null");
            }
            //find middle
            public Node findMiddle(Node head){
                Node currNode=head;
                int size=0;
                while(currNode!=null){
                    currNode=currNode.next;
                    size++;
                }
                Node middle=head;
                int i=0;
                while(i<size/2){
                    middle=middle.next;
                    i++;

                }
                return middle;
            }

            public Node reverse(Node head){
                if (head == null || head.next == null) {
                    return head; 
                }
                Node prevNode=null;
                Node currNode=head;
                while(currNode!=null){
                    Node nextNode=currNode.next;
                    currNode.next=prevNode;
                    //update
                    prevNode=currNode;
                    currNode=nextNode;
                }
                return prevNode;
            }

            //make the function to check the palindrome
            public boolean isPalindrome(){
                if(head==null||head.next==null){
                    return true;
                }
                Node middle=findMiddle(head);
                Node secondHalfStart=reverse(middle.next);
                Node firsthalfStart=head;
                while(secondHalfStart!=null){
                    if(firsthalfStart.data!=secondHalfStart.data){
                        return false;
                    }
                    firsthalfStart=firsthalfStart.next;
                    secondHalfStart=secondHalfStart.next;
                }
                return true;
               

            }


    public static void main(String args[]){
        palindrome pm=new palindrome();
        pm.addFirst(1);
        pm.addLast(2);
        pm.addLast(2);
        pm.addLast(2);
        pm.addLast(1);
        pm.addLast(3);
        pm.printList();
        System.out.println();
       if(pm.isPalindrome()){
        System.out.println("linked list is palindrome");
       }else{
        System.out.println("oho!!!!!!!!!!!!!linked list isnot palindrome");
       }
    }
    
}
