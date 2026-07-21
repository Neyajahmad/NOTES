public class CircularImplimentation {
    public static class  Cqa {
        int front =-1;
        int rear=-1;
        int size=0;
        int arr[]=new int[8];

        public void add(int val) throws Exception{
         if(size==arr.length){
            throw new Exception("Queue is full");
         }

        else if(size==0){
            front=0;
            rear=0;
            arr[0]=val;
         }
         else if(rear<arr.length-1){
            arr[++rear]=val;
         }
        else if(rear==arr.length-1){
            rear=0;
            arr[0]=val;
         }

         size++;
        }

        public int remove() throws Exception{
           
            if (size==0) {
                throw new Exception("Queue is empty..");
            }
            else if(front==arr.length-1){
                int x=arr[front];
                front=0;
                size--;
                return x;
            }
            else{
                int x=arr[front];
                front++;
                size--;
                return x;
            } 
            
        }

        public int peek() throws Exception{
            if (size==0) {
                throw new Exception("Queue is empty..");
            }
            else return arr[front];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        public void display(){
            if (size==0) {
                System.out.println("Queue is empty..");
            }
            else{
                if(front<=rear){
                    for (int i=front;i<=rear;i++){
                        System.out.print(arr[i]+" ");
                    }
                }
                else{
                    for(int i=front;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                    }
                    for(int i=0;i<=rear;i++){
                        System.out.println(arr[i]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Cqa q=new Cqa();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        
    }
}