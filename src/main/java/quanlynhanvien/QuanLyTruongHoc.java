package quanlynhanvien;

public class QuanLyTruongHoc {
    public static void main(String[] args) {
        Person student = new Student("Henry", "CT012", "Học javaScrip", 2018, 7000);
        student.showInfor();
        System.out.println("------------------------------------------------------");
        Person staff = new Staff("Mr.Culi", "HH4A", "Đh FPT", 15000);
        staff.showInfor();
    }
}
