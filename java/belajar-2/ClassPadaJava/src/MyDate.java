import java.time.Year;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) throws Exception {
        if (day < 1 || day > 31) {
            throw new Exception("Input tanggal tidak boleh kurang dari 1 dan tidak boleh lebih dari 31");
        } else {
            this.day = day;
        }
    }

    public void setMonth(int month) throws Exception {
        if (month < 1 || month > 12) {
            throw new Exception("Input bulan tidak boleh kurang dari 1 dan tidak boleh lebih dari 12");
        } else {
            this.month = month;
        }
    }

    public void setYear(int year) throws Exception {
        Year yearNow = Year.now();
        int tahunIni = yearNow.getValue();
        if (year > tahunIni) {
            throw new Exception("Input tahun tidak boleh lebih dari tahun " + tahunIni);
        } else {
            this.year = year;
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }
}


