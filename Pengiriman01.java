class pengiriman{
    String noResi, pembayaran, status, tujuan, kodePos;
    int beratBarang, ongkosKirim, totalHarga;

    public pengiriman(String noResi, String pembayaran, String status, String tujuan, String kodePos, int beratBarang, int ongkosKirim, int totalHarga){
        this.noResi = noResi;
        this.pembayaran = pembayaran;
        this.status = status;
        this.tujuan = tujuan;
        this.kodePos = kodePos;
        this.beratBarang = beratBarang;
        this.ongkosKirim = ongkosKirim;
        this.totalHarga = totalHarga;
    }
    String getNoResi(){
        return "No Resi: " + noResi;
    }
    String getPembayaran(){
        return "Pembayaran: " + pembayaran;
    }
    String getStatus(){
        return "Status: " + status;
    }
    String getTujuan(){
        return "Tujuan: " + tujuan;
    }
    String getKodePos(){
        return "Kode Pos: " + kodePos;
    }
    int setBeratBarang(){
        return beratBarang;
    }
    int setOngkosKirim(){
        return ongkosKirim;
    }
    int setTotalHarga(){
        return totalHarga;
    }

}

public class Pengiriman01 {
    public static void main(String[] args){
        pengiriman pengiriman1 = new pengiriman("1346257", "M-Banking", "Dikemas", "Surabaya", "60281", 5, 12000, 60000);
        System.out.println("\n============ ENTITY PENGIRIMAN ============");
        System.out.println(pengiriman1.getNoResi());
        System.out.println(pengiriman1.getPembayaran());
        System.out.println(pengiriman1.getStatus());
        System.out.println(pengiriman1.getTujuan());
        System.out.println(pengiriman1.getKodePos());
        System.out.println("Berat barang: " + pengiriman1.setBeratBarang() + " kg");
        System.out.println("Ongkos Kirim: Rp " + pengiriman1.setOngkosKirim());
        System.out.println("Total Harga: Rp " + pengiriman1.setTotalHarga() + "\n");
    }
}
