import java.util.Map;
import java.util.TreeMap;

public class TreemapContoh {
   
    private static final Integer ONE = Integer.valueOf(1);
   
    public static void main(String[] args) {
       
        String name[] = {
            new String("Sang"),
            new String("Shin"),
            new String("Boston"),
            new String("Passion"),
            new String("Shin")
        };
       
        // Membat Objek TreeMap
        Map m = new TreeMap();
       
        for (int i=0; i<name.length; i++) {
            Integer freq = (Integer) m.get(name[i]);
           
            m.put(name[i], (freq==null ? ONE :
                Integer.valueOf(freq.intValue() + 1)));
        }
       
        System.out.println(m.size() + " distinct words detected:");
        System.out.println("Display of the TreeMap object = " + m);
    }
}

