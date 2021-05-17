import java.util.List;
import java.util.ArrayList;
/*
 * Graham Davidson
 * 5/5/21
 */
public class MusicLibraryClient
{
    static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        albums.add(a1);
        albums.add(a2);
        albums.add(a3);
        MusicLibrary myLibrary = new MusicLibrary(albums);

        System.out.println(myLibrary.info);
        System.out.println(albums.size());
        
        doubleSize();
        myLibrary = new MusicLibrary(albums);
        
        System.out.println(myLibrary.info);
        System.out.println(albums.size());

    }
    static void doubleSize(){
        final int size = albums.size();
        for(int i=0; i<=size; i++){
            if(i < size){
                albums.add(new Album("New Album","Unknown",0, 0));
            }
        }
    }
}