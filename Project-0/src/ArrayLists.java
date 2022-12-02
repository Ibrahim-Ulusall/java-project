import java.util.*;
public class ArrayLists {
    Iterator iterator;
    public void arrayList(){
        ArrayList array = new ArrayList();
        array.add("Türkiye");
        array.add("Amerika");
        array.add("Rusya");
        array.add("Türkiye");
        array.add(1,"Çin");
        array.remove("Türkiye");
        iterator = array.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next());

    }

    public void linkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
    }
}
