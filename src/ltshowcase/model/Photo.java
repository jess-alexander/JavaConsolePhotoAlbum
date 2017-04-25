/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltshowcase.model;

/**
 *
 * @author Jess
 */
public class Photo {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;
    
    // ISSUE: Option to include url and thumbnailurl if upgrade to GUI 
    public Photo(int albumId, int id, String title){

        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = "";
        this.thumbnailUrl = "";
    }
    
    private Photo(){  }        
    
    @Override
    public String toString() {
        return "["+ id +"]"+"  "+title;
    }
    
    public int getAlbumId(){
        return this.albumId;
    } 
    public void setAlbumId(int albumId){
        this.albumId = albumId;
    }
    public int getId(){
        return this.id;
    } 
    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return this.title;
    } 
    public void setTitle(String title){
        this.title = title;
    }
}
