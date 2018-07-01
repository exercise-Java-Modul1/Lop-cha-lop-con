package quanlynhanvien;

public class Staff extends Person {

    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    public void showInfor() {
        System.out.println("Staff: ");
        super.showInfor();
        System.out.println("Tên trường: " + school);
        System.out.println("Lương nhận được hàng tháng là: " + pay);
    }
}
