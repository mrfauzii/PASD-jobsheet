public class BukuMain19 {
    String judul, pengarang;
    int halaman;
    int stok;
    int harga;
  
    void tampilInformasi() {
      System.out.println("judul :" + judul);
      System.out.println("Pengarang: " + pengarang);
      System.out.println("Jumlah halaman: " + halaman);
      System.out.println("Sisa stok: " + stok);
      System.out.println("Harga : Rp " + harga);
    }
    void terjual(int jml) {
      if (stok > 0) {
        stok -= jml;
      } else {
        System.out.println("Stok tidak mencukupi! Penjualan gagal.");
      }
    }
  
    void restock(int jml) {
      stok += jml;
    }
  
    void gantiHarga(int hrg) {
      harga = hrg;
    }  
    public static void main(String[] args) {
      Buku19 bk1 = new Buku19(null, null, 0, 0, 0);
      bk1.judul = "Today Ends Tommorow Comes";
      bk1.pengarang = "Denanta Pratiwi";
      bk1.halaman = 198;
      bk1.stok = 13;
      bk1.harga = 71000;

      String judulBuku = bk1.judul;
      bk1.tampilInformasi();
      bk1.terjual(5);
      bk1.gantiHarga(60000);
      bk1.tampilInformasi();

      Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
      bk2.terjual(0); 
      bk2.tampilInformasi();
    }
  }
  