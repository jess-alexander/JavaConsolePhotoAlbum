/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltshowcase;

import com.google.gson.Gson; //for parsing json to java object (a stepping stone to get to TreeMap)
import java.util.TreeMap; // for more easily manuvering through albums

/**
 *
 * @author Jess
 */
public class LTShowcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gson gson = new Gson();
        TreeMap gallery = new TreeMap(); //collection of albums--> collection of photos
        
        gallery.put(1,1);
        gallery.put(1,2);
        gallery.put(1,3);
        gallery.put(1,4);
        gallery.put(2,5);
        gallery.put(2,6);
        gallery.put(2,7);
        gallery.put(3,8);
        gallery.put(3,9);
        gallery.put(3,10);
        gallery.put(3,11);
        
        System.out.println("Total albums: " + gallery.size());

         

        // Iterate over all vehicles, using the keySet method.

        for(Object key: gallery.keySet())

            System.out.println(key + " - " + gallery.get(key));

        System.out.println();

         

        System.out.println("Highest album-key: " + gallery.lastKey());

        System.out.println("Lowest album-key: " + gallery.firstKey());

         

        System.out.println("\nPrinting all values:");

        for(Object val: gallery.values())

            System.out.println(val);

        System.out.println();

        // Clear all values.
        gallery.clear();
        
        // Equals to zero.
        System.out.println("After clear operation, size: " + gallery.size());
        
    }
    
    public String getJSON(){
        return "";
    }
}
