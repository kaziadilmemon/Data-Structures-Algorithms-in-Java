public class ImplementationArray {
    static class QueueA{
        static int arr[];
        static int size;
        static int rear;
        QueueA(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }
//        public static boolean isEmpty(){
//            return rear = -1;
//        }
//        public static boolean isFull(){
//            return rear = size-1;
//        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("overflow");
                return;

            }
            arr[++rear]=data;
        }
        public static int remove(){
            if(rear==-1){
                System.out.println("Empty Queue");
                return -1;}
                int front=arr[0];
                for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];
                }
                rear--;
                return front;

            }
            public static int peek(){
            if(rear==-1){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
            }
            public static  void main(String[] args){
            QueueA q=new QueueA(5);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            System.out.println(q.peek());
            }
        }
    }

