class kurirr {
    String asalKurir,nama,tanggalLahir,noPolisi,telepon;
    int idKurir,pengirimanNoResi;

    public kurirr(String asalKurir, int idKurir, String nama, String noPolisi, int pengirimanNoResi, String tanggalLahir, String telepon){
        this.asalKurir = asalKurir;
        this.idKurir = idKurir;
        this.nama = nama;
        this.noPolisi = noPolisi;
        this.pengirimanNoResi = pengirimanNoResi;
        this.tanggalLahir = tanggalLahir;
        this.telepon = telepon;
    }
    String getAsalKurir(){
        return "Asal Kurir: " + asalKurir;
    }
    int getIdKurir(){
        return idKurir;
    }
    String getNama(){
        return "Nama Kurir: " + nama;
    }
    String setNoPolisi(){
        return "No Polisi: " + noPolisi;
    }
    int getPengirimanNoResi(){
        return pengirimanNoResi;
    }
    String getTanggalLahir(){
        return "Tanggal Lahir Kurir: " + tanggalLahir;
    }
    String setTelepon(){
        return "No Telepon: " + telepon;
    }
}

public class Kurir01{
    public static void main(String[] args){
        kurirr kurir1 = new kurirr("Jember", 80867,"Budi","P 2564 WR",1346257,"2 Januari 1987","08123456789");
        System.out.println("\n============ ENTITY KURIR ============");
        System.out.println(kurir1.getAsalKurir());
        System.out.println("ID Kurir: " + kurir1.getIdKurir());
        System.out.println(kurir1.getNama());
        System.out.println(kurir1.setNoPolisi());
        System.out.println("Pengiriman No Resi: " + kurir1.getPengirimanNoResi());
        System.out.println(kurir1.getTanggalLahir());
        System.out.println(kurir1.setTelepon() + "\n");
    }
}
