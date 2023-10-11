public class DemoNilai {
    public static void main(String[] args) {
        String nim = "2210631170026";
        String nama = "Jesica Mila";
        int absen = 80;
        int tugas = 90;
        int uts = 85;
        int uas = 88;

        Nilai nilai = new Nilai(nim, nama, absen, tugas, uts, uas);
        System.out.println("Data Nilai Mahasiswa:");
        nilai.CetakNilai();
    }
}
