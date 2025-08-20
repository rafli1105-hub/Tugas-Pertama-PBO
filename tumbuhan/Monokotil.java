/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tumbuhan;

import hewan.reptil;

/**
 *
 * @author ACER
 */
public class Monokotil extends tumbuhan{

    /**
     * @param jumlahbiji the jumlahbiji to set
     */
    protected void setJumlahbiji(int jumlahbiji) {
        this.jumlahbiji = jumlahbiji;
    }

    /**
     * @param jumlahbunga the jumlahbunga to set
     */
    protected void setJumlahbunga(int jumlahbunga) {
        this.jumlahbunga = jumlahbunga;
    }

    /**
     * @return the jenisakar
     */
    protected String getJenisakar() {
        return jenisakar;
    }

    /**
     * @param jenisakar the jenisakar to set
     */
    protected void setJenisakar(String jenisakar) {
        this.jenisakar = jenisakar;
    }

    /**
     * @return the jumlahbiji
     */
    protected int getJumlahbiji() {
        return jumlahbiji;
    }

    /**
     * @param jumlahbiji the jumlahbiji to set
     */
    protected void setJumlahbiji(String jumlahbiji) {
        this.setJumlahbiji(jumlahbiji);
    }

    /**
     * @return the bentukdaun
     */
    protected String getBentukdaun() {
        return bentukdaun;
    }

    /**
     * @param bentukdaun the bentukdaun to set
     */
    protected void setBentukdaun(String bentukdaun) {
        this.bentukdaun = bentukdaun;
    }

    /**
     * @return the jumlahbunga
     */
    protected int getJumlahbunga() {
        return jumlahbunga;
    }

    /**
     * @param jumlahbunga the jumlahbunga to set
     */
    protected void setJumlahbunga(String jumlahbunga) {
        this.setJumlahbunga(jumlahbunga);
    }
    private String jenisakar;
    private int jumlahbiji;
    private String bentukdaun;
    private int jumlahbunga;
    
    public static void main(String[] args) {
        Monokotil biji = new Monokotil();
        biji.setJenistumbuhan("buah");
        biji.setHabitat("terestial");
        biji.setWarnadaun("hijau");
        biji.setCaraberkembangbiak("generatif");
        

        System.out.println("Jenis tumbuhan : " + biji.getJenistumbuhan());
        System.out.println("Habitat  :" + biji.getHabitat());
        System.out.println("Warna daun : " + biji.getWarnadaun());
        System.out.println("Cara berkembang biak :" + biji.getCaraberkembangbiak());
    }
}
