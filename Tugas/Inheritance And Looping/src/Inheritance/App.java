package Inheritance;

public class App {
    public static void main(String[] args) throws Exception {
    Lingkaran lingkaran = new Lingkaran (7, "lingkaran ABC");
    lingkaran.getInfo();
    
    System.out.println("\t");
    Persegi persegi1 = new Persegi("persegi CAB", 5);
    persegi1.getInfo();
    
    System.out.println("\t");
    SegitigaSamaKaki segitigaSamakaki1 = new SegitigaSamaKaki("Segitiga Sama Kaki 1", 5, 3); 
    segitigaSamakaki1.getInfo();

    System.out.println("\t");
    SegitigaSembarang segitigaSembarang1 = new SegitigaSembarang("Segitiga Sembarang Normal 1", 16, 12, 10, 30);
    segitigaSembarang1.getInfo();

    System.out.println("\t");
    SegitigaSikuSiku segitigaSikuSikul = new SegitigaSikuSiku("Segitiga Siku Siku 1", 5, 3);
    segitigaSikuSikul.getInfo();
    
    
    System.out.println("\t");
    SegitigaSamaSisi segitigaSamaSisil = new SegitigaSamaSisi ("Segitiga Sama Sisi 1", 12);
    segitigaSamaSisil.getInfo();
    
     }
    }