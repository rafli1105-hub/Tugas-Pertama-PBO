/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;


public class kadal extends reptil{
    public static void main(String[] args) {
        kadal pasir = new kadal();
       pasir.setPeranEkologis("Predator Puncak");
       pasir.setJenisKerangka("Terbuat dari Tulang Rawan");
       pasir.setJeniskulit("Dilapisi kulit Dermal Denticles");
       pasir.setKisaranUmur("Umurnya 20-50 tahun");
        
        System.out.println("Peran Ekologis : " + pasir.getPeranEkologis());
        System.out.println("Jenis Kerangka : " + pasir.getJenisKerangka());
        System.out.println("Jenis kulit : " + pasir.getJeniskulit());
        System.out.println("Kisaran Umur : " + pasir.getKisaranUmur());
    }
    
}
