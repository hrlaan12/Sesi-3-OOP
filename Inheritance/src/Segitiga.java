public class Segitiga extends BangunDatar {
  protected double alas;
  protected double tinggi;
  protected double sisiA; 
  protected double sisiB;
  protected double sisiC;

  public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
    super.setNama(nama);
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiA = sisiA;
    this.sisiB = sisiB;  
    this.sisiC = sisiC;
    
    hitungLuas();
    hitungKeliling();
  }

  public void hitungLuas() {
    luas = 1/2 * alas * tinggi; 
  }

  public void hitungKeliling() {
    keliling = sisiA + sisiB + sisiC; 
  }

}