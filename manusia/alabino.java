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
public class alabino extends manusia {

    /**
     * @return the warnamata
     */
    protected String getWarnamata() {
        return warnamata;
    }

    /**
     * @param warnamata the warnamata to set
     */
    protected void setWarnamata(String warnamata) {
        this.warnamata = warnamata;
    }

    /**
     * @return the warnakulit
     */
    protected String getWarnakulit() {
        return warnakulit;
    }

    /**
     * @param warnakulit the warnakulit to set
     */
    protected void setWarnakulit(String warnakulit) {
        this.warnakulit = warnakulit;
    }

    /**
     * @return the penglihatan
     */
    protected String getPenglihatan() {
        return penglihatan;
    }

    /**
     * @param penglihatan the penglihatan to set
     */
    protected void setPenglihatan(String penglihatan) {
        this.penglihatan = penglihatan;
    }

    /**
     * @return the sensitivitas
     */
    protected String getSensitivitas() {
        return sensitivitas;
    }

    /**
     * @param sensitivitas the sensitivitas to set
     */
    protected void setSensitivitas(String sensitivitas) {
        this.sensitivitas = sensitivitas;
    }
    private String warnamata;
    private String warnakulit;
    private String penglihatan;
    private String sensitivitas;
    
    public static void main(String[] args) {
        alabino putih = new alabino();
        putih.setGenetik("albinisme");
        putih.setGolongandarah("o");
        putih.setIrismata("terang");
        putih.setHormon("albinisme");
        

        System.out.println("Genetik : " + putih.getGenetik());
        System.out.println("Golongan darah  :" + putih.getGolongandarah());
        System.out.println("iris mata  : " + putih.getIrismata());
        System.out.println("Hormon :" + putih.getHormon());
    }
    
}
