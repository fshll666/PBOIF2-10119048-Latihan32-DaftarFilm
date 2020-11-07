/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan32.daftarfilm;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Clas film.
 */
public class Film {
    String nama;
    String genre;
    Double rating;
    int duration;
    
    public void nowPlaying(String genre, String nama, Double rating, int duration){
     System.out.println("Daftar Film Sedang Tayang ");
     System.out.println("Judul Film: " + nama );
     System.out.println("Genre Film : " + genre);
     System.out.println("Rating Film : " + rating);
     System.out.println("Duration Film : " + duration + " Menit");
     System.out.println("");
     System.out.println("==========================================");
     System.out.println("Developed by : Mochammad Faishal");
    }
}
