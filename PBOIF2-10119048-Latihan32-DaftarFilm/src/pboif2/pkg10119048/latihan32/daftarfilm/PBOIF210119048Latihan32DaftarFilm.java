/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan32.daftarfilm;

/**
 *
 * @author SystemOs
 */
public class PBOIF210119048Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film = new Film();
        
        film.nama = "Fingding Dory";
        film.genre = "Animation, Comedy, Adventure";
        film.rating = 7.3;
        film.duration = 120;
        film.nowPlaying(film.nama, film.genre, film.rating, film.duration);
    }
    
}
