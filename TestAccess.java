class TestAccess {

    public static void main(String[] args) {

        MakhlukHidup m = new MakhlukHidup();
        
        // MEnggunakan setter untuk mengubah nama
        m.setNama("Kucing"); 

        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        // Mengcopy objek m2 ke m3
        MakhlukHidup m3 = new MakhlukHidup(m2);
        
        // Menampilkan informasi dari objek m
        System.out.println(m.getInfo());
        
        // Menampilkan informasi dari objek m2
        System.out.println(m2.getInfo());
        
        // Nama method sudah disesuaikan dengan perubahan pada class MakhlukHidup
        m2.Makhluk("Kuda"); 
        
        // Menampilkan informasi dari objek m2 setelah diubah namanya
        System.out.println(m2.getInfo());
        
        // Umur dibuat positif karena ada validasi di setter
        m3.setUmur(10); 
        
        // Menampilkan informasi dari objek m3 setelah diubah umurnya
        System.out.println(m3.getInfo());

    }
}