package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Ganti nama objek sesuai nama panggilan kamu dan dua digit terakhir NPM
        Matematika rehan = new Matematika(2, 3);

        // Tampilkan hasil operasi
        System.out.println("Penjumlahan: " + rehan.setPenjumlahan());
        System.out.println("Pengurangan: " + rehan.setPengurangan());
        System.out.println("Perkalian  : " + rehan.setPerkalian());
        System.out.println("Pembagian  : " + rehan.setPembagian());
    }
}