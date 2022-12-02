import java.util.*;

public class HashSeter {
    public static void hashSet(){
        //Set'ler de değerler sadece 1 tane olur.
        //Değerler rastgele tutulur.
        HashSet hashSet = new HashSet();
        hashSet.add("Selin");
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.forEach(item -> System.out.println(item));

    }
    public static void linkedHashSet(){
        //linkedHashSet Veriler eklendiği gibi tutulur.
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Ahmet");
        linkedHashSet.add("Pazartesi");
        linkedHashSet.add("Salı");
        linkedHashSet.add("Çarşamba");
        linkedHashSet.add("Perşembe");
        linkedHashSet.add("Cuma");
        linkedHashSet.add("Cumartesi");
        linkedHashSet.add("Pazar");

        linkedHashSet.forEach(item -> System.out.println(item));

    }
    public static void treeSet(){
        //TreeSet verileri küçükten büyüğe doğru sıralar.
        TreeSet tree = new TreeSet();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);

        tree.forEach(item -> System.out.println(item));
    }
}
