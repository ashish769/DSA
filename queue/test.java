package queue;

public class test {
    public class Queue{
        static int   arr[];
        static int   size;
        static int   rear=-1;

        Queue(int size){
            this.arr=new int[size];
            this.size=size;
        }
        public static boolean  isEmpty(){
            return rear==-1;
        }

        //add
        public static void Add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
            }
            rear++;
            arr[rear]=data;

        }
        //Remove
        public static int Remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return;
            }
           int  front=arr[0];
           for(int i=0;i<size;i++){
            arr[i]=arr[i+1];

           }
           return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(Sting args[]){
        Queue q=new Queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Remove();
        }
    }
    
}
