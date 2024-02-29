public class Soal1 {
    public static void main(String[] args) {
        //soal 1
        System.out.println("================================");
        System.out.println("Soal 1");
        System.out.println("================================");
        for (int i = 0; i < 7; i++) {
            System.out.println("Saya semangat belajar java");
        }
        System.out.println(); // Menambahkan baris kosong

        //soal 2
        System.out.println("================================");
        System.out.println("Soal 2");
        System.out.println("================================");
        int angka = 1;
        for (int i = 0; i < 6; i++) {
            System.out.print(angka+" ");
            angka = angka + 2;
        }
        System.out.println(); // Menambahkan baris kosong

        //soal 3
        System.out.println("================================");
        System.out.println("Soal 3");
        System.out.println("================================");
        for (int i = 9; i >= -6; i -= 3){
            System.out.print(i+" ");
        }
        System.out.println(); // Menambahkan baris kosong

        System.out.println("================================");
        System.out.println("Soal 4");
        System.out.println("================================");
        for (int i = 1; i <= 4; i++) {
            int hasil = 4 * i;
            System.out.println(4+"x"+i+"="+hasil);
        }
        System.out.println();
    }
}
