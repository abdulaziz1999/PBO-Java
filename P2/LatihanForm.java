class LatihanForm{
    public static void main(String[] args) {
      String namaLengkap,hoby,alamat,status;
      int tahunDaftar,tahunLahir,tinggiBadan,umur;
  
      namaLengkap = "Ani Ariski";
      hoby        = "Menulis";
      alamat      = "Jalan Cempaka Putih no 3";
  
      // tipe integer data
      tahunDaftar = 2020;
      tahunLahir  = 1999;
      tinggiBadan = 149;
  
      umur = tahunDaftar - tahunLahir;
  
      if (tinggiBadan >=150) {
        status = "Lulus";
      }else{
        status = "Gagal";
      }
      System.out.println("=================================");
      System.out.println("Nama Lengkap    : " + namaLengkap);
      System.out.println("Alamat          : " + alamat);
      System.out.println("Hoby            : " + hoby);
      System.out.println("Tahun Daftar    : " + tahunDaftar);
      System.out.println("Tahun Lahir     : " + tahunLahir);
      System.out.println("Umur            : " + umur);
      System.out.println("Tinggi Badan    : " + tinggiBadan);
      System.out.println("=================================");
      System.out.println("Status Pendaftaran    : " + status);
    }
  }