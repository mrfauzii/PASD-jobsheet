public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku19() {

    }
    public Buku19(String judul, String pengarang, int halaman, int stok, int harga) {
        judul = judul;
        pengarang = pengarang;
        halaman = halaman;
        stok = stok;
        harga = harga;
    
      }

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
      System.out.println("Stok tidak mencukupi");
    }
  }

  void restock(int jml) {
    stok += jml;
    
  }

  void gantiHarga(int hrg) {
    harga = hrg;
  }
 }
