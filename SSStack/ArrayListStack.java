
import java.util.ArrayList;



public class ArrayListStack {
   public static  class Stack{
        static ArrayList<Integer> List=new ArrayList<>();
        public static boolean isEmpty(){
            return List.size()==0;
        }
        //push
        public  void push(int data){
            List.add(data);
        }
        //pop
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }
        //peek
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return List.get(List.size()-1);
        }
        //print
        public  void printList(){
            while(!isEmpty()){
                System.out.println(peek());
                pop();
            }
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(3);
        s.push(6);
        s.push(5);
        s.push(4);
        s.printList();
    }
}
