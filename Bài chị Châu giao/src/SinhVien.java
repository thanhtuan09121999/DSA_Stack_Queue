public class SinhVien {
    private String name;
    private int Age;
    private String  address;

    public SinhVien() {
    }

    public SinhVien(String name, int age, String address) {
        this.name = name;
        this.Age = Age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SInhVien{" +
                "name='" + name + '\'' +
                ", age=" + Age +
                ", address='" + address + '\'' +
                '}';
    }
    public int compareTo(SinhVien o){
        return this.getAge()-o.getAge();
    }
}
