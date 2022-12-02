import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {
        Queue q = new LinkedList();
        /*
        *  element() : Kuyruğun başındaki öğeyi verir. Kuyruktan atmaz.
        *  remove()  : Kuyruğun başındaki öğeyi verir. Kuyruktan atar.
        *  offer()   : Mümkünse verilen öğeyi kuyruğa ekler.
        *  peek()    : Kuyruğun başındaki öğeyi verir. Kuyruktan atmaz. Kuyruk boşsa null verir.
        *  pool()    : Kuyruğun başındaki öğeyi verir. Kuyruktan atar.  Kuyruk boşsa null verir.
        */

        q.add("Ali");
        q.add("Veli");
        q.add("Mehmet");
        System.out.println("=========== Element() ===============");
        System.out.println("Element() : " + q.element());
        q.forEach(item -> System.out.println(item));
        System.out.println("=========== Remove() ===============");
        System.out.println("Remove() : " + q.remove());
        q.forEach(item -> System.out.println(item));
        System.out.println("=========== Offer() ===============");
        System.out.println("Offer() : "  + q.offer("Selin"));
        q.forEach(item -> System.out.println(item));
        System.out.println("=========== Peek() ===============");
        System.out.println("Peek() : " + q.peek());
        q.forEach(item -> System.out.println(item));
        System.out.println("============ Pool() ================");
        System.out.println("Pool() : " + q.poll());
        q.forEach(item -> System.out.println(item));
    }
}
