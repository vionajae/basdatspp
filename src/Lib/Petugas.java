/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author Client
 */
public class Petugas {
    static int id_petugas;
    static String username;
    static String password;
    static String nama_petugas;
    static String level;

    public static int getId_petugas() {
        return id_petugas;
    }

    public static void setId_petugas(int id_petugas) {
        Petugas.id_petugas = id_petugas;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Petugas.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Petugas.password = password;
    }

    public static String getNama_petugas() {
        return nama_petugas;
    }

    public static void setNama_petugas(String nama_petugas) {
        Petugas.nama_petugas = nama_petugas;
    }

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        Petugas.level = level;
    }
    
    
}
