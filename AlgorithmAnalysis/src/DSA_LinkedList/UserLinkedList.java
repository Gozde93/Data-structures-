package DSA_LinkedList;

public class UserLinkedList {

    User head;
    User tail;
    int size; // this will hold the number of elements in list

    public UserLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head == null;

    }
    void insertLast(User newNode){

        if (isEmpty()){ //2 cases 1: list is empty
            head=tail=newNode;

        }else{ //2nd case: list is not empty
            tail.next=newNode;
            tail=newNode;

        }
        size++;

    }

    void printNames(){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        User current = head;
        while (current!=null){
            System.out.print    (current.name + "=> ");
            current = current.next;
        }
    }
    User get(int index){
        if (index >= size){
            System.out.println("Index out of bounds");
            return null;
        }else{
            User current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }

    }

    User get2(int index){
        if (index >= size){
            System.out.println("Index out of bounds");
            return null;
        }else{
            User current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }

    }

    void insertLast(String name, String lastName){ // don't have the return anything because you don't have any limit

        User newNode = new User(name, lastName);
        if (isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++; // after insertion increase the size

    }

    void deleteByName(String name){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        User prev = head;
        User current = head;
        while (current != null){
            if (current.name.equals(name)){
                //we have three cases
                //case1: head
                if (current==head){
                    if (head==tail) tail =null;
                    head = current.next;
                    current.next = null;

                }
                //case2: tail
                else if (current==tail) {
                    prev.next = null;
                    tail=prev;

                }
                //case3: middle
                else{
                    prev.next = current.next;
                    current.next =null;

                }
                size--;

            }
            //if thre is no match proceed with the next element
            prev = current;
            current=current.next;
        }
    }




}
