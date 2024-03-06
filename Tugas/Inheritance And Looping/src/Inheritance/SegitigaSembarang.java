package Inheritance;

public class SegitigaSembarang extends Segitiga {
    double alas;
    double sisiß;
    double sisic;
    double sudut;

    public SegitigaSembarang(String name, double alas, double sisiß, double sisic, double sudut) {
    super.setNama (name);

    this.alas = alas;
    this.sisiß = sisiß;
    this.sisic = sisic;
    this.sudut = sudut;
    
    super.setSegitiga(alas, 0, alas, sisiß, sisic);

    this.hitungLuas();
    hitungKeliling();
    
    }

    @Override
    public void hitungLuas() {
        super.luas = 0.5 * this.alas * this.sisiß * Math.round(Math.sin(Math.toRadians(this.sudut)) * 100.0) / 100.0;

    }

 }