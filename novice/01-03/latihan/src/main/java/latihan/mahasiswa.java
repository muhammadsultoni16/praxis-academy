package praxis;
public class mahasiswa extends manusia {

    String Nim;
    String Prodi;
    String Semester;
    public mahasiswa(String Nim, String Prodi, String Semester, String nama, String alamat, String NoHanphone){
        super( nama,  alamat,  NoHanphone);
        this.Nim = Nim;
        this.Prodi = Prodi;
        this.Semester = Semester;

    }
   
        
    
}