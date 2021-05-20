public class Main {
    public static void main(String[] args) {
        QLSV QL= new QLSV();
        QL.add(new SinhVien("hoài",19,"hà nội "));
        QL.add(new SinhVien("nam",20,"hưng yên "));
        QL.add(new SinhVien("cường",21,"lào cai "));
        QL.add(new SinhVien("huấn",22,"hải phòng  "));
        QL.add(new SinhVien("khá",23,"bắc giang "));
        QL.display();;
        QL.edit("nam",new SinhVien("tiến", 24,"hưng yên" ));
        QL.display();
        QL.delete("hoài");
        QL.display();
    }
}
