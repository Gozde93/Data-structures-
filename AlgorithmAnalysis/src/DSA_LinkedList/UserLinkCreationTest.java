package DSA_LinkedList;

public class UserLinkCreationTest {

    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();
        list.printNames();
        list.insertLast(new User("Jason","AAA"));
        list.insertLast(new User("Jack","Reacher"));
        list.insertLast(new User("Carol","Reacher3"));
        list.printNames();
        list.get(2);
        list.deleteByName("Carol");
        list.printNames();


    }



}
