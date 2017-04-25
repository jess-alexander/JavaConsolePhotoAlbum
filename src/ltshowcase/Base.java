/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltshowcase;

import ltshowcase.model.Photo;
import ltshowcase.model.PhotoCollection;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jess
 */
public class Base {

    static void printIntro(){
        // PRINT ALBUM OPTIONS TO SCREEN
        System.out.println("\t\t===================================================");
        System.out.println("\t\t======  Welcome to your photo album library! ======");
        
        PhotoCollection.printAlbumId();
        
        System.out.println("\nTo return to this menu at any time, enter 0");
        System.out.println("\nTo exit the program, enter -1");
        
    }
    
    public static int userInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean success = false;
        int input = 0;
        do{
            try{
                System.out.print("\n\nEnter Number:");
                input = Integer.parseInt(br.readLine());
                success=true;
            }catch(NumberFormatException e){
                System.err.println("Invalid Format, please try again");
                input = 0;
            } catch (IOException ex) {
                Logger.getLogger(Base.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }while(!success);
        
        return input;
        
    }
    
    static void displayOutput(int input, Photo[] photoArray){
        for(Photo photo: photoArray){
            if(photo.getAlbumId() == input){
                System.out.print("\t"+photo.toString()+"\n");
            }else if(photo.getAlbumId() == input+1){
                break;
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        //read from json URL
        PhotoCollection.jsonAlbumIO();
        // print header and albumIds to choose from
        printIntro();
        
        int input;
        do{
            /// prompt/accept user input
            input = userInput();
            if(input == 0){
              PhotoCollection.printAlbumId();
              continue;
            } else if(input != -1){
                
                PhotoCollection.printPhotos(input);                
            }            
        }while(input != -1);
        
        
    }
    
}