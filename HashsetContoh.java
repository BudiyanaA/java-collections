import java.util.HashSet;

public class HashsetContoh {
   
    public static void main(String[] args) {
       
        // Membuat Objek HashSet
        HashSet hs = new HashSet(5, 0.5f);
        System.out.println(hs.add("one"));
        System.out.println(hs.add("two"));
        System.out.println(hs.add("three"));
        System.out.println(hs.add("four"));
        System.out.println(hs.add("five"));
       
        // Mencetak Isi dari Objek HashSet
        System.out.println(hs);
       
        // Memasukan Duplikat ke HashSet
        Boolean b = hs.add("one");
        System.out.println("Duplicate item allowed = " + b);
        System.out.println(hs);  
    }
}

