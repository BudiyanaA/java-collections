import java.util.ArrayList;
import java.util.ListIterator;

public class ArraylistContoh {
   
    public static void main(String[] args) {
       
        // Membuat Objek ArrayList dengan kapasitas 2 Elemen
        ArrayList al = new ArrayList(2);
        System.out.println(al+", size = "+al.size());
       
        // Tambahkan item ke ArrayList
        al.add("R");
        al.add("U");
        al.add("O");
        al.add(new String("x"));
        al.add(2, new Integer.valueOf(10));
        System.out.println(al+", size = " + al.size());
       
        // Menghapus item
        al.remove("U");
        System.out.println(al+", size = " + al.size());
       
        // Check if the list contains the specified element
        Boolean b = al.contains("x");
        System.out.println("The list contains x = " + b);
        b = al.contains("p");
        System.out.println("The list contains p = " + b);
        b = al.contains(new Integer.valueOf(10));
        System.out.println("The list contains Integer of 10 = " + b);
       
        // Membuat ListIterator dan meng-iterasi setiap item
        // Iterator akan dijelaskan di slide selanjutnya
        ListIterator li = al.listIterator();
        while (li.hasNext())
            System.out.println("From ListIterator = " + li.next());
       
        // Membuat Objek array dari ArrayList
        Object a[] = al.toArray();
        for (int i=0; i<a.length; i++)
            System.out.println("From an Array = " + a[i]);
    }
}

