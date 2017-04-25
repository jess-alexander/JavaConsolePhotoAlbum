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
public class Photo extends Album {
    public int albumId;
    public int id;
    public String title;
    public String url;
    public String thumbnailUrl;
    
    public Photo(int albumId, int id, String title, String url, String thumbnailUrl){

        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;

    }
    // ISSUE: remove later, used for quicker testing
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
}
