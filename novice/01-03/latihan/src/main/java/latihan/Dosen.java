package praxis;
public class Dosen extends manusia{
    
    String Nip;
    String gelar;
    String jabatan;
    public Dosen(String Nip, String gelar, String jabatan, String nama, String alamat, String NoHanphone){
        super( nama,  alamat,  NoHanphone);
        this.Nip = Nip;
        this.gelar = gelar;
        this.jabatan = jabatan;

    }
}