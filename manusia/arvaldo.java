/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

import tumbuhan.Monokotil;

/**
 *
 * @author ACER
 */
public class arvaldo extends alabino {
    public static void main(String[] args) {
        arvaldo tiktok = new arvaldo();
        tiktok  .setWarnamata("Abu-Abu");
        tiktok.setWarnakulit("Putih");
        tiktok.setPenglihatan("fotopobia");
        tiktok.setSensitivitas("Sunburn");
        

        System.out.println("Warna mata : " + tiktok.getWarnamata());
        System.out.println("Warna kulit  :" + tiktok.getWarnakulit());
        System.out.println("Penglihatan : " + tiktok.getPenglihatan());
        System.out.println("Sensitivitas :" + tiktok.getSensitivitas());
    }
}
