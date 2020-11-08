import java.util.LinkedList;

public class LinkedlistContoh {
   
    public static void main(String[] args) {
       
        // Membuat Objek LinkedList dan tambahkan 4 Item.
        LinkedList list = new LinkedList();
        list.add(new Integer.valueOf(1));
        list.add(new Integer.valueOf(2));
        list.add(new Integer.valueOf(3));
        list.add(new Integer.valueOf(1));
        System.out.println(list+", size = "+list.size());
       
        // Menambahkan Item di awal dan diakhir.
        list.addFirst(new Integer.valueOf(0));
        list.addLast(new Integer.valueOf(4));
        System.out.println(list);
        System.out.println(list.getFirst() + ", " + list.getLast());
        System.out.println(list.get(2)+", "+list.get(3));
       
        // Menghapus Item pertama dan terakhir.
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
       
        // Menghapus item pertama yang merupakan Objek Integer(1)
        list.remove(new Integer.valueOf(1));
        System.out.println(list);
       
        // Menambahkan String ke LinkedList
        String s = new String("Boston");
        list.add(s);
        System.out.println(list);
 
        // Mendapatkan Index dari Boston
        System.out.println("Index of Boston String = " + list.indexOf(s));
       
        // Menghapus Objek Ke 3
        list.remove(2);
        System.out.println(list);
       
        // Mengubah nilai pada item ke 2
        list.set(1, "one");
        System.out.println(list);
       
        // Clone Objek LinkedList
        LinkedList clonedLinkedList = (LinkedList) list.clone();
        clonedLinkedList.add(0, new String("Cloned LinkedList"));
        list.add(0, new String("Original LinkedList"));
        System.out.println(list);
        System.out.println(clonedLinkedList);  
    }
}

