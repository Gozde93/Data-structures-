//import javax.xml.crypto.dsig.keyinfo.KeyValue;
//import java.util.LinkedList;
//
//
//public class BucketLinkedList {
//
//    LinkedList<KeyValue<Integer,Integer>> bucketList;
//
//    public BucketLinkedList() {
//        this.bucketList = new LinkedList<KeyValue<Integer,Integer>>();
//    }
//    public int get(int key){
//        // Basic search with a loop return value if key matches
//        for ( KeyValue<Integer,Integer> pair:bucketList) {
//            if(pair.key.equals(key)) return pair.value;
//        }
//        return -1;
//    }
//    public void put(int key, int value){
//        // if there is match update value
//        for ( KeyValue<Integer,Integer> pair:bucketList) {
//            if(pair.key.equals(key)) {
//                pair.value=value;
//                return;
//            }
//        }
//        // if no match add it
//        this.bucketList.add(new KeyValue<>(key,value));
//    }
//    public void remove(int key){
//        for ( KeyValue<Integer,Integer> pair:bucketList) {
//            if(pair.key.equals(key)) {
//                // if there is a match remove that pair
//                this.bucketList.remove(pair);
//                return;
//            }
//        }
//}}
