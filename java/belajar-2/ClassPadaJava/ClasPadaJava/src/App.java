import java.time.YearMonth;

class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswaKhairiyan = new Mahasiswa("Khairiyan Hidayat Ramadhan", "1912312312312",
                new MyDate(22, 9, 2001));
        Mahasiswa mahasiswaKhairiyanArray[] = new Mahasiswa[3];

        mahasiswaKhairiyanArray[0] = new Mahasiswa("Riyan", "1298123123123", new MyDate(1, 2, 2003));
        mahasiswaKhairiyanArray[1] = new Mahasiswa("Faiz", "12312313123", new MyDate(4, 12, 2005));
        mahasiswaKhairiyanArray[2] = new Mahasiswa("Alvin", "12312313123", new MyDate(23, 1, 2001));

        // mahasiswaKhairiyanArray[0].setNama("Khairiyan");

        // System.out.println(mahasiswaKhairiyanArray[0]);

        // System.out.println(getAge(mahasiswaKhairiyan));
        int kumpulanUmurMahasiswa[] = new int[mahasiswaKhairiyanArray.length];
        for (int i = 0; i < mahasiswaKhairiyanArray.length; i++) {
            kumpulanUmurMahasiswa[i] = ambilUmur(mahasiswaKhairiyanArray[i]);
        }



        int arrayAngka[] = { 23, 5, 6, 12, 78, 9, 19 };
        System.out.println("=================AMBIL ANGKA================");
        System.out.println("Angka Terkecil : " + ambilAngkaTerkecil(arrayAngka));
        System.out.println("Angka Terbesar : " + ambilAngkaTerbesar(arrayAngka));

        System.out.println("=================Sort================");
        for (int i = 0; i < arrayAngka.length; i++) {
            if (i == arrayAngka.length - 1) {
                System.out.print(urutkanBilangan(arrayAngka)[i]);
            } else {
                System.out.print(urutkanBilangan(arrayAngka)[i] + ", ");
            }
        }

        System.out.println();
        System.out.println("========================Umur Termuda======================");
        System.out.println("Umur termuda : " + ambilAngkaTerkecil(kumpulanUmurMahasiswa));


        int umurTermuda = ambilAngkaTerkecil(kumpulanUmurMahasiswa);
        System.out.println("===================Mahasiwa Termuda=======================");
        for (int i = 0; i < mahasiswaKhairiyanArray.length; i++) {
            if (ambilUmur(mahasiswaKhairiyanArray[i]) == umurTermuda) {
                System.out.println("Mahasiswa Termuda adalah : " + mahasiswaKhairiyanArray[i].getNama() + "\nUmur : "
                        + umurTermuda);
            }
        }
    }

    private static String getAge(Mahasiswa parameterMahasiswa) {
        YearMonth tahunDanBulanIni = YearMonth.now();
        int umurDalamBulan = 0;
        int umurDalamTahun = 0;
        int umurDalamBulanSetelahModulo = 0;
        int umurBulanDariAwalMasehiSampaiSekarang = 0;
        int umurBulanDariAwalMasehiSampaiTahunKelahiran = 0;

        int bulanSaatIni = tahunDanBulanIni.getMonthValue();
        int tahunSaatIni = tahunDanBulanIni.getYear();

        umurBulanDariAwalMasehiSampaiSekarang = tahunSaatIni * 12 + bulanSaatIni;
        umurBulanDariAwalMasehiSampaiTahunKelahiran = parameterMahasiswa.getTanggalLahir().getYear() * 12
                + parameterMahasiswa.getTanggalLahir().getMonth();

        umurDalamTahun = tahunSaatIni - parameterMahasiswa.getTanggalLahir().getYear();
        umurDalamBulan = umurBulanDariAwalMasehiSampaiSekarang - umurBulanDariAwalMasehiSampaiTahunKelahiran;
        umurDalamBulanSetelahModulo = umurDalamBulan % 12;

        if (umurDalamBulanSetelahModulo == 0) {
            return "Umur " + parameterMahasiswa.getNama() + " Adalah " + umurDalamTahun + " Tahun";
        }
        return "Umur " + parameterMahasiswa.getNama() + " Adalah " + umurDalamTahun + " Tahun "
                + umurDalamBulanSetelahModulo + " Bulan";
    }

    private static int ambilUmur(Mahasiswa parameterMahasiswa) {
        YearMonth tahunDanBulanIni = YearMonth.now();
        int umurDalamTahun = 0;
        int tahunSaatIni = tahunDanBulanIni.getYear();

        umurDalamTahun = tahunSaatIni - parameterMahasiswa.getTanggalLahir().getYear();

        return umurDalamTahun;
    }

    public static int ambilAngkaTerkecil(int[] angkaInput) {
        int tempAngkaPindah = 0;
        int size = angkaInput.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (angkaInput[j] > angkaInput[j + 1]) {
                    tempAngkaPindah = angkaInput[j];
                    angkaInput[j] = angkaInput[j + 1];
                    angkaInput[j + 1] = tempAngkaPindah;
                }
            }
        }
        int angkaTerkecil = angkaInput[0];
        return angkaTerkecil;
    }

    public static int ambilAngkaTerbesar(int[] angkaInput) {
        int tempAngkaPindah = 0;
        int size = angkaInput.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (angkaInput[j] < angkaInput[j + 1]) {
                    tempAngkaPindah = angkaInput[j];
                    angkaInput[j] = angkaInput[j + 1];
                    angkaInput[j + 1] = tempAngkaPindah;
                }
            }
        }
        int angkaTerbesar = angkaInput[0];
        return angkaTerbesar;
    }

    public static int[] urutkanBilangan(int[] angkaInput) {
        int tempAngkaPindah = 0;
        int size = angkaInput.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // System.out.print("index ke-" + j + " ");
                if (angkaInput[j] > angkaInput[j + 1]) {
                    tempAngkaPindah = angkaInput[j];
                    angkaInput[j] = angkaInput[j + 1];
                    angkaInput[j + 1] = tempAngkaPindah;
                }
            }
            // System.out.println();
        }
        return angkaInput;
    }
}