/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg2;

/**
 *
 * @author mica
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KpopGroup group1 = new KpopGroup("IVE",48,true);
        KpopGroup group2 = new KpopGroup("Le Sserafim",16,true);
        KpopGroup group3 = new KpopGroup("Twice",121,false);
        
        Song song1 = new Song("Aphrodite by The Ridleys","Indie");
        Song song2 = new Song ("get him back! by Olivia Rodrigo","Pop");
        
        Singer singer1 = new Singer ("Hanni",song2);
        singer1.performForAudience(12);
        singer1.changeFavSong(song2);
    }
    
    
}