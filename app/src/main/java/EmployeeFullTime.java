public class EmployeeFullTime extends Employee {
    @Override
    public double tinhLuong() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString() + "---> Full time = " + tinhLuong();
    }
}
