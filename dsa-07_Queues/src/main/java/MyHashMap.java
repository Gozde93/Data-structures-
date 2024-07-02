//import java.util.ArrayList;
//import java.util.List;
//
//public class MyHashMap {
//
//        List<BucketLinkedList>list;
//        public int modNumber;
//
//        public MyHashMap(){
//                this.modNumber=2003;
//                this.list= new ArrayList<BucketLinkedList>();
//                for (int i = 0; i < 2003; i++) {
//                        this.list.add(new BucketLinkedList());
//
//                }}
//
//        public void put(int key, int value){
//                int index = key % modNumber;
//                list.get(index).put(key, value);
//
//        }
//
//        public int get(int key){
//                int index = key % modNumber;
//                return list.get(index).get(key);
//
//        }
//
//        public void remove(int key){
//                int index = key % modNumber;
//                list.get(index).remove(key);
//        }
//
///**
// * Your MyHashMap object will be instantiated and called as such:
// * MyHashMap obj = new MyHashMap();
// * obj.put(key,value);
// * int param_2 = obj.get(key);
// * obj.remove(key);
// */
//}
