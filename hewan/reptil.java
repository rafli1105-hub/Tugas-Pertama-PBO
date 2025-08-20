/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

public class reptil extends hewan {

    /**
     * @return the KisaranUmur
     */
    protected String getKisaranUmur() {
        return KisaranUmur;
    }

    /**
     * @param KisaranUmur the KisaranUmur to set
     */
    protected void setKisaranUmur(String KisaranUmur) {
        this.KisaranUmur = KisaranUmur;
    }

    /**
     * @return the PeranEkologis
     */
    protected String getPeranEkologis() {
        return PeranEkologis;
    }

    /**
     * @param PeranEkologis the PeranEkologis to set
     */
    protected void setPeranEkologis(String PeranEkologis) {
        this.PeranEkologis = PeranEkologis;
    }

    /**
     * @return the JenisKerangka
     */
    protected String getJenisKerangka() {
        return JenisKerangka;
    }

    /**
     * @param JenisKerangka the JenisKerangka to set
     */
    protected void setJenisKerangka(String JenisKerangka) {
        this.JenisKerangka = JenisKerangka;
    }

    /**
     * @return the JenisSisik
     */
    protected String getJeniskulit() {
        return Jeniskulit;
    }

    /**
     * @param Jeniskulit the JenisSisik to set
     */
    protected void setJeniskulit(String Jeniskulit) {
        this.Jeniskulit = Jeniskulit;
    }

    /**
     * @return the Habitat
     */
    private String PeranEkologis;
    private String JenisKerangka;
    private String Jeniskulit;
    private String KisaranUmur;

    public static void main(String[] args) {
        reptil pasir = new reptil();
        pasir.setCaraBergerak("Merayap");
        pasir.setAlatPernapasan("paru-paru");
        pasir.setLingkunganHidup("ektotermik");
        pasir.setCaraBerkembangbiak("Ovovivipar");
        

        System.out.println("Cara Bergerak reptil : " + pasir.getCaraBergerak());
        System.out.println("Alat Pernapasan reptil :" + pasir.getAlatPernapasan());
        System.out.println("Lingkungan Hidup reptil : " + pasir.getLingkunganHidup());
        System.out.println("Cara Berkembangbiak reptil :" + pasir.getCaraBerkembangbiak());
    }
}