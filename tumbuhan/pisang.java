/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tumbuhan;

import hewan.kadal;

/**
 *
 * @author ACER
 */
public class pisang extends Monokotil {
    public static void main(String[] args) {
        pisang tanduk = new pisang();
       tanduk.setJenisakar("Serabut");
       tanduk.setJumlahbiji(1);
       tanduk.setBentukdaun("menyirip");
       tanduk.setJumlahbunga(3);
        
        System.out.println("Jenis akar : " + tanduk.getJenisakar());
        System.out.println("jumlah biji : " + tanduk.getJumlahbiji());
        System.out.println("Bentuk daun : " + tanduk.getBentukdaun());
        System.out.println("Jumlah bunga : " + tanduk.getJumlahbunga());
    }
}
