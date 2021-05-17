import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
    String info;
    public Album(String albumName, String artistName, int numSongs, double playTime){
        info = "Album: " + albumName + "\nArtist: " + artistName + 
        "\n# Songs: " + numSongs + "\nAlbum Duration(min): " + playTime + "\n+++++++++++++++++++++++++++++++++++++++\n";
    }
}