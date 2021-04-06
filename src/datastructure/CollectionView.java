package datastructure;

import java.util.HashMap;
import java.util.Map;


public class CollectionView {

        public static void main(String[] args) {
                /*
                 Map is created and inserted some data.Retrieve the Collection view of values present in map
                 */

                HashMap<Integer, String> realMadrid = new HashMap<>();
                realMadrid.put(10, "Benzima");
                realMadrid.put(7, "Ronaldo");
                realMadrid.put(9, "Bale");
                realMadrid.put(5, "Ramos");
                // for ech loop:
                for (Map.Entry key : realMadrid.entrySet()) {
                        //Answer number 1
                        System.out.println(key.getKey() + " " + key.getValue());

                        //Answer number 2 by Milad
                        //System.out.println(key);

                }

        }
}

