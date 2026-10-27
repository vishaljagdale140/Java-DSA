//package LinkedList;
//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val = val;
//    }
//}
//
//public class LinkedList {
//    Node head;
//    Node tail;
//    int size;
//    void AddAtHead(int val){
//        Node temp = new Node(val);
//        if(head == null) head=tail=temp;
//        else{
//            temp.next = head;
//            head = temp;
//        }
//        size++;
//    }
//    void AddAtTail(int val){
//        Node temp = new Node(val);
//        if(head == null) tail=head=temp;
//        else {
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
//    void DeleteAtHead(int val){
//        if(head == null){
//            System.out.println("List Is Empty!!!");
//            return;
//        }
//        else{
//            head = head.next;
//            if(head == null) tail=null;
//            size--;
//        }
//    }
//    void display(){
//        if(head == null) return;
//        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    void Insert(int val, int idx){
//        if(idx < 0 || idx > size){
//            System.out.println("Invalid Index !!!");
//        }
//        else if(idx == 0) AddAtHead(val);
//        else if(idx == size) AddAtTail(val);
//        else {
//            Node temp = head;
//            for(int i=1; i<=idx-1; i++){
//                temp = temp.next;
//            }
//            Node t = new Node(val);
//            t.next = temp.next;
//            temp.next = t;
//            size++;
//        }
//    }
//}
//class LinkedListDataStructure{
//    public static void main(String[] args) {
//        LinkedList LL = new LinkedList();
////        LL.DeleteAtHead();
//        LL.AddAtTail(60);
//        LL.AddAtTail(90);
//        LL.AddAtTail(30);LL.display();
//        LL.AddAtHead(20);
//        LL.AddAtHead(30);
//        LL.AddAtHead(40);
//        LL.AddAtHead(50);LL.display();
//
//        LL.DeleteAtHead(10);LL.display();
//        LL.Insert(10,2);
//        LL.display();
//    }
//}

