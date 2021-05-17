import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MusicLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLibrary
{
    String info = "";
    public MusicLibrary(List<Album> albums){
        for(int i=0; i<albums.size(); i++){
            info += albums.get(i).info;
        }
    }
    
}