/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltshowcase.model;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Jess
 */
public class PhotoCollection {
    private static Gson gson = new Gson();
    private static Map<Integer, Photo> photoMap = new TreeMap<>();
    private static Map<Integer, Photo> albumMap = new TreeMap<>();
    private static String json;

     private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
          sb.append((char) cp);
        }
        return sb.toString();
    }

    public static String readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try  {
          BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
          String jsonText = readAll(rd);
          return jsonText;
        } finally {
          is.close();
        }
    }
    
    public static Photo[] jsonAlbumIO(){
        Photo[] photoArray=null;
        try{
            json = readJsonFromUrl("https://jsonplaceholder.typicode.com/photos");
            // PARSE THE JSON INTO AN ARRAY OF PHOTO OBJECTS   
            //ISSUE: a missing entry in JSON results in setting the corresponding field in the object to null
            photoArray  = gson.fromJson(json, Photo[].class);
            //put each Photo Object into a Map to facilitate easily displaying albums available
            for(Photo photo: photoArray){
                albumMap.put(photo.getAlbumId(), photo);
            } 
        }catch (IOException ex) {
            System.out.println("error in reading file");
            System.exit(0);
        } 
        return photoArray;
    }
    
    static Photo[] jsonPhotoIO(int key){
        Photo[] photoArray = null;
        try{
            json = readJsonFromUrl("https://jsonplaceholder.typicode.com/photos?albumId="+key);
            // PARSE THE JSON INTO AN ARRAY OF PHOTO OBJECTS   
            // POTENTIAL ISSUE: a missing entry in JSON results in setting the corresponding field in the object to null
            photoArray  = gson.fromJson(json, Photo[].class);
        }catch (IOException ex) {
            System.out.println("error in reading file");
            System.exit(0);
        } 
        return photoArray;
    }
   
    public static void printAlbumId(){                
        System.out.println("\t\t===================================================");
        System.out.println("\t\t==== Enter the album id you would like to open ====");
        System.out.println("\t\t===================================================");

        // display all albums
        Iterator iterator = albumMap.keySet().iterator();
        int count = 0;
        System.out.print(" "); //only for spacing on first line
        while(iterator.hasNext()){
            count++;
            System.out.print("\t"+iterator.next());
            if(count%10 == 0)
                System.out.print("\n");
        }
    }
    /* 
     * Original idea was to use the HashMap to quickly sort and display data here,
     *    but it proved to be a little complicated and because the hint was provided
     *    to use another JSON call, that is the route I took.
     */
    public static void printPhotos(int albumId){     

        if(albumMap.containsKey(albumId) || albumId == -1){
            System.out.println("\t\t===================================================");
            System.out.println("\t\t\t Listing the photo info for album "+albumId);
            System.out.println("\t\t===================================================");
            // display photos associated with parameter
            Photo[] photoArray = jsonPhotoIO(albumId);
            for(Photo photo: photoArray){
                System.out.println("\t"+photo.toString());
            }
        } else {
            System.out.println("\t\t==!==!==!==!==!==!==!==!==!==!==!==!==!==!==!==");
            System.out.println("\t\tAlbum id entered is not found, please try again");
        }
    }
}
