import java.util.*;
public class Heap{
    public static void swap(List<Integer> heap, int l, int r){
        int temp=heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    public static void push_up_in_minHeap(List<Integer> heap, int index){
        int parent_index=(index-1)/2;
        //until root reached / correct position found
        if(index==0 || heap.get(parent_index)<heap.get(index)){
            return;
        }
        //swap
        swap(heap,index,parent_index);

        // recurssive call.
        push_up_in_minHeap(heap, parent_index);
    }
   public static void insert_in_MinHeap(List<Integer> heap, int element){
        // last me add
        heap.add(element);

        int index=heap.size()-1;
        push_up_in_minHeap(heap,index);
    }




    public static void push_up_in_maxHeap(List<Integer> heap, int index){
        int parent_index=(index-1)/2;
        //until root reached / correct position found
        if(index==0 || heap.get(parent_index)>heap.get(index)){
            return;
        }
        //swap
        swap(heap,index,parent_index);

        // recurssive call.
        push_up_in_maxHeap(heap, parent_index);
    }


    public static void insert_in_MaxHeap(List<Integer> heap, int element){
        // last me add
        heap.add(element);

        int index=heap.size()-1;
        push_up_in_maxHeap(heap,index);
    }





// Deletion in MinHeap.

public static void deleteFromMinHeap(List<Integer> heap){
    swap(heap, 0, heap.size()-1);
    heap.remove(heap.size()-1);
    int n=heap.size()-1;

    push_down_in_MinHeap(heap, 0,n);
}

    public static void push_down_in_MinHeap(List<Integer> heap, int index,int n) {
       
        if(index==n){
            return;
        }

        int left=(2*index)+1;
        int right=(2*index)+2;

        int smallest=index;
        if(left<=n && heap.get(left)<heap.get(smallest)){
            smallest=left;
        }
        if(right<=n && heap.get(right)<heap.get(smallest)){
            smallest=right;
        }

        if(smallest==index){
            return;
        }

        swap(heap,index,smallest);
        push_down_in_MinHeap(heap, smallest,n);
}




// Deletion in MaxHeap.

public static void deleteFromMaxHeap(List<Integer> heap){
    swap(heap, 0, heap.size()-1);
    heap.remove(heap.size()-1);
    int n=heap.size()-1;

    push_down_in_MaxHeap(heap, 0,n);
}

    public static void push_down_in_MaxHeap(List<Integer> heap, int index,int n) { // nlog(n)
      
        if(index==n){
            return;
        }

        int left=(2*index)+1;
        int right=(2*index)+2;

        int biggest=index;
        if(left<=n && heap.get(left)>heap.get(biggest)){
            biggest=left;
        }
        if(right<=n && heap.get(right)>heap.get(biggest)){
            biggest=right;
        }

        if(biggest==index){
            return;
        }

        swap(heap,index,biggest);
        push_down_in_MaxHeap(heap,biggest,n);
}



//Heapify to generate minheap

public static void heapify(List<Integer> arr){ // build heap
    int first_non_leaf_node=((arr.size()-1)-1)/2; // last element ka parent

    for(int i=first_non_leaf_node;i>=0;i--){
        push_down_in_MinHeap(arr, i, arr.size()-1);   
    }

}



//Heapify to generate maxheap

public static void heapifymax(List<Integer> arr){ // build heap
    int first_non_leaf_node=((arr.size()-1)-1)/2; // last element ka parent

    for(int i=first_non_leaf_node;i>=0;i--){
        push_down_in_MaxHeap(arr, i, arr.size()-1);   
    }

}


//HEAPSORT  :-- decending order

public static void heapsort(List<Integer> arr){
    //convert into min heap

    heapify(arr);
    int n = arr.size()-1;
    for(int i=n;i>0;i--){
        swap(arr, 0, i);
        push_down_in_MinHeap(arr, 0, i-1);
    }
}



//HEAPSORT  :-- acending order

public static void heapsortacc(List<Integer> arr){
    //convert into min heap

    heapifymax(arr);
    int n = arr.size()-1;
    for(int i=n;i>0;i--){
        swap(arr, 0, i);
        push_down_in_MaxHeap(arr, 0, i-1);
    }
}

    public static void main(String[] args){
        List<Integer> heap=new ArrayList<>();

  // INSERTION IN MINHEAP..
        // heap.add(10);
        // heap.add(20);
        // heap.add(30);
        // heap.add(40);
        // heap.add(50);

        // System.out.println(heap);
        // insert_in_MinHeap(heap,5);
        // System.out.println(heap);

  // INSERTION IN MAXHEAP..
        // heap.add(60);
        // heap.add(50);
        // heap.add(40);
        // heap.add(30);
        // heap.add(20);
        // heap.add(30);
        // heap.add(10);

        // System.out.println(heap);
        // insert_in_MaxHeap(heap,40);
        // System.out.println(heap);

   // DELETION IN MINHEAP..


        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);

        
        
        System.out.println(heap);
        heapsortacc(heap);
        System.out.println(heap);


        
    }
}