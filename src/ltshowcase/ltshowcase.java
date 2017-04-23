/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltshowcase;

import ltshowcase.model.Photo;
import ltshowcase.model.Album;
//import ltshowcase.RemoveDuplicates;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import java.net.URL;
import java.nio.charset.Charset;

import com.google.gson.*;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Jess
 */
public class ltshowcase {
    
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

    public static void main(String[] args) throws IOException {
        
        // IMPORT JSON DATA INTO A LARGE STRING FOR PARSING
        String json = "";
        try{
            json = readJsonFromUrl("https://jsonplaceholder.typicode.com/photos");
        }catch (IOException ex) {
            System.out.println("something bad happened WITH I/O...");
            // ISSUE: INSERT BETTER ERROR HANDLING
        } finally{
            if (json.equals(""))
                json = "error";
        }
        
        // PARSE THE JSON INTO AN ARRAY OF PHOTO OBJECTS
        Gson gson = new Gson();       
        Photo[] photoArray  = gson.fromJson(json, Photo[].class);
        //Album[] photoAlbum = photoArray;
        
        // REMOVE albumId DUPLICATES FOR EASY DISPLAY FOR USER
        Object[] displayAlbumId = RemoveDuplicates.removeDuplicates(photoArray);        
        
        System.out.println("\t\t===================================================");
        System.out.println("\t\t======  Welcome to your photo album library! ======");
        System.out.println("\t\t==== Enter the album id you would like to open ====");
        System.out.println("\t\t===================================================");
        
        for(int i=0; i<displayAlbumId.length; i++){
            if(i%10 == 0)
                System.out.print("\n");
            System.out.print("\t"+displayAlbumId[i]);
            
        }
        System.out.println("\nTo return to this menu at any time, enter 0");
        
        /// ACCEPT USER INPUT
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean success = false;
        int input;
        do{
            try{
                System.out.print("\n\nEnter Number:");
                input = Integer.parseInt(br.readLine());
                success=true;
            }catch(NumberFormatException nfe){
                System.err.println("Invalid Format, please try again");  
            }   
        }while(!success);
        
        // search/ pull all photos with the albumId == input
        
    }
    
}