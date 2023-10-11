public class Nilai {
    private String nim;
    private String nama;
    private int nilaiAbsen;
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;

    public Nilai(String nim, String nama, int nilaiAbsen, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public void CetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen[10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%]: " + nilaiTugas);
        System.out.println("Nilai UTS[30%]: " + nilaiUTS);
        System.out.println("Nilai UAS[40%]: " + nilaiUAS);
        int nilaiAkhir = (int) (0.1 * nilaiAbsen + 0.2 * nilaiTugas + 0.3 * nilaiUTS + 0.4 * nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
