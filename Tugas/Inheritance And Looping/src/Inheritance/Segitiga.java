package Inheritance;

public class Segitiga extends BangunDatar {

    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiß;
    protected double sisic;
    private double sisiB;

    // public Segitiga() {
    // hitungLuas();
    // hitungKeliling();
    // )

    public void setSegitiga(double alas, double tinggi, double sisiA, double sisiB, double sisic) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiß = sisiB;
        this.sisic = sisic;

    }

   public void hitungLuas() {
     super.luas = Math.round(0.5* this.alas * this.tinggi * 100.0) / 100.0;
   
   }

    public void hitungKeliling() {
        super.keliling = this.sisiA + this.sisiB + this.sisic;

    }
 }