public class MakhlukHidup {

    private String nama; // Salah syntax sudah diperbaiki     
    private String jenis;
    public double berat; // Nilai yang diberikan di berat dihilangkan karena sudah ada di constructor
    private int umur;

    // Constructor
    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    // Bukan constructor karena ada void dihindari nama method sama dengan nama class
    public void Makhluk(String nama) { 
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    // Parameterized Constructor
    public MakhlukHidup(String nama, String jenis, int umur, double berat) { // Salah penulisan nama class harusnya MakhlukHidup M nya besar
        this.nama = nama; // Sudah diperbaiki yang asalnya this.nama = jenis;
        this.jenis = jenis; // Salah penulisan harusnya this.jenis = nama;
        this.umur = umur;
        this.berat = berat;
    }

    // Copy Constructor
    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama; // Salah penulisan harusnya other.nama bukan nama
        this.jenis = other.jenis; 
        this.umur = other.umur; // Salah penulisan harusnya other.umur bukan this.umur
        this.berat = other.berat;
    }

    // Setter
    public void setUmur(int umur) {// Salah tipe data pada parameter umur yang seharusnya int
        // Validasi umur tidak boleh negatif
        if (umur >= 0) {
            this.umur = umur; 
        }else{
            System.out.println("Umur tidak boleh negatif");
        }
    }

    // Setter
    public void setNama(String nama) {
        // Sudah diperbaiki asalnya nama = this.nama menjadi this.nama = nama;
        this.nama = nama;
    }

    // Getter
    public String getInfo() { // Salah tipe data, harusnya String
        return "Nama=" + nama + ", Jenis=" + jenis + ", Umur=" + umur + ", Berat=" + berat;
    }
}