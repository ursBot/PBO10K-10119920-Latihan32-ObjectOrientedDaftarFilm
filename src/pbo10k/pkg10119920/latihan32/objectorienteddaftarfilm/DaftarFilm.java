/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Film {
    
    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit");
    }
}

public class DaftarFilm {
    
    public static void main(String[] args) {
        
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();
        
        Film f = new Film();
        
        f.filmName = "Venom";
        f.filmGenre = "Action, Horror, Scifi";
        f.filmRating = 8.5;
        f.filmDuration = 120;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Small Foot";
        f.filmGenre = "Animation";
        f.filmRating = 9.0;
        f.filmDuration = 96;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Crazy Rich Asian";
        f.filmGenre = "Comedy";
        f.filmRating = 7.8;
        f.filmDuration = 119;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Asih";
        f.filmGenre = "Horror";
        f.filmRating = 6.0;
        f.filmDuration = 100;
        f.nowPlaying();
        System.out.println();
    }
}