import java.util.HashMap;
import java.util.Map;

public class HashmapContoh {
   
    private static final Integer ONE = Integer.valueOf(1);
   
    public static void main(String[] args) {
       
        // Set up testing data
        String name[] = {
            new String("Sang"),
            new String("Shin"),
            new String("Boston"),
            new String("Passion"),
            new String("Shin")
        };
       
        // Membuat Objek HashMap
        Map m = new HashMap();
       
        // Initialize tabel frekuensi dengan testing data
        for (int i=0; i<name.length; i++) {
            Integer freq = (Integer) m.get(name[i]);
           
            // Tambahkan item ke HashMap
            m.put(name[i], (freq==null ? ONE :
                Integer.valueOf(freq.intValue() + 1)));
        }
       
        // Menampilkan size Objek Map
        System.out.println(m.size() + " distinct words detected:");
       
        // Menampilkan isi Objek Map
        System.out.println("Display of the HashMap object = " + m);  
    }   
}

