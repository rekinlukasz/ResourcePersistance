package pl.wsb.resource_persistance.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "doskonalosc")
    private double doskonalosc;

    @Column(name = "opor_aerodynamiczny")
    private double oporAerodynamiczny;

    @Column(name = "masa_wlasna")
    private double masaWlasna;

    @Column(name = "rozpietosc_skrzydel")
    private double rozpietoscSkrzydel;

    @Column(name = "minimalna_predkosc_opadania")
    private double minimalnaPredkoscOpadania;

    @Column(name = "minimalna_predkosc_lotu")
    private double minimalnaPredkoscLotu;

    @Column(name = "promien_krazenia")
    private double promienKrazenia;

    @Column(name = "liczba_przyrzadow")
    private int liczbaPrzyrzadow;

    @Column(name = "czy_posiada_radio")
    private boolean czyPosiadaRadio;

    @Column(name = "maksymalne_przeciazenie")
    private double maksymalnePrzeciazenie;

    // Konstruktory
    public Resource() {}

    public Resource(double doskonalosc, double oporAerodynamiczny, double masaWlasna,
                    double rozpietoscSkrzydel, double minimalnaPredkoscOpadania,
                    double minimalnaPredkoscLotu, double promienKrazenia,
                    int liczbaPrzyrzadow, boolean czyPosiadaRadio, double maksymalnePrzeciazenie) {
        this.doskonalosc = doskonalosc;
        this.oporAerodynamiczny = oporAerodynamiczny;
        this.masaWlasna = masaWlasna;
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
        this.minimalnaPredkoscOpadania = minimalnaPredkoscOpadania;
        this.minimalnaPredkoscLotu = minimalnaPredkoscLotu;
        this.promienKrazenia = promienKrazenia;
        this.liczbaPrzyrzadow = liczbaPrzyrzadow;
        this.czyPosiadaRadio = czyPosiadaRadio;
        this.maksymalnePrzeciazenie = maksymalnePrzeciazenie;
    }

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDoskonalosc() {
        return doskonalosc;
    }

    public void setDoskonalosc(double doskonalosc) {
        this.doskonalosc = doskonalosc;
    }

    public double getOporAerodynamiczny() {
        return oporAerodynamiczny;
    }

    public void setOporAerodynamiczny(double oporAerodynamiczny) {
        this.oporAerodynamiczny = oporAerodynamiczny;
    }

    public double getMasaWlasna() {
        return masaWlasna;
    }

    public void setMasaWlasna(double masaWlasna) {
        this.masaWlasna = masaWlasna;
    }

    public double getRozpietoscSkrzydel() {
        return rozpietoscSkrzydel;
    }

    public void setRozpietoscSkrzydel(double rozpietoscSkrzydel) {
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    public double getMinimalnaPredkoscOpadania() {
        return minimalnaPredkoscOpadania;
    }

    public void setMinimalnaPredkoscOpadania(double minimalnaPredkoscOpadania) {
        this.minimalnaPredkoscOpadania = minimalnaPredkoscOpadania;
    }

    public double getMinimalnaPredkoscLotu() {
        return minimalnaPredkoscLotu;
    }

    public void setMinimalnaPredkoscLotu(double minimalnaPredkoscLotu) {
        this.minimalnaPredkoscLotu = minimalnaPredkoscLotu;
    }

    public double getPromienKrazenia() {
        return promienKrazenia;
    }

    public void setPromienKrazenia(double promienKrazenia) {
        this.promienKrazenia = promienKrazenia;
    }

    public int getLiczbaPrzyrzadow() {
        return liczbaPrzyrzadow;
    }

    public void setLiczbaPrzyrzadow(int liczbaPrzyrzadow) {
        this.liczbaPrzyrzadow = liczbaPrzyrzadow;
    }

    public boolean isCzyPosiadaRadio() {
        return czyPosiadaRadio;
    }

    public void setCzyPosiadaRadio(boolean czyPosiadaRadio) {
        this.czyPosiadaRadio = czyPosiadaRadio;
    }

    public double getMaksymalnePrzeciazenie() {
        return maksymalnePrzeciazenie;
    }

    public void setMaksymalnePrzeciazenie(double maksymalnePrzeciazenie) {
        this.maksymalnePrzeciazenie = maksymalnePrzeciazenie;
    }
}
