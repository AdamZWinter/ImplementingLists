import edu.greenriver.sdev333.ArrayList;
import edu.greenriver.sdev333.DoublyLinkedList;
import edu.greenriver.sdev333.List;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<String> friends = new ArrayList<String>();
//        System.out.println("Initial size is: "+friends.size());
//        System.out.println("List is empty: " + friends.isEmpty());
//
//        friends.add("Ehren");
//        System.out.println("Size after added one: "+friends.size());

        for(int i = 0; i < 50; i++){
            friends.add("Friend"+i);
        }
//        System.out.println("Size after many added: "+friends.size());

//        System.out.println(friends.contains("Friend1"));
//        System.out.println(friends.contains("Friendx"));


        System.out.println(friends);

//        System.out.print(System.lineSeparator());
//        Iterator<String> itr = friends.iterator();
//        while(itr.hasNext()){
//            String name = itr.next();
//            System.out.print(name+" ");
//        }
//
//        System.out.print(System.lineSeparator());
//        for(String name : friends){
//            System.out.print(name+ " ");
//        }

        List<String> friendsLL = new DoublyLinkedList<>();

        for(int i = 0; i < 50; i++){
            friendsLL.add("Friend"+i);
        }

        System.out.println(friendsLL);

    }
}