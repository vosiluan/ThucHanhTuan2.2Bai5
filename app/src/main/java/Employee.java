public abstract class Employee {
    private String id;
    private String ten;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Employee(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public Employee() {
    }
    public abstract double tinhLuong();

    @Override
    public String toString() {
        return this.id +'-' + this.ten;
    }
}
