import java.util.ArrayList;

public class QLSV {
    ArrayList<SinhVien> sinhViens;

    public QLSV() {
        this.sinhViens = new ArrayList<>();
    }

    public void add(SinhVien sinhVien) {
        sinhViens.add(sinhVien);
    }

    public void display() {
        for (int i = 0; i < sinhViens.size(); i++) {
            System.out.println(sinhViens.get(i));
        }
        System.out.println("****************");
    }

    public int findByName(String Name) {
        for (int i = 0; i < sinhViens.size(); i++) {
            System.out.println(sinhViens.get(i));
            return i;
        }
        return 00000000000;
    }
    public void edit(String name,SinhVien sinhVien){
        int indexOfStudent = findByName(name);
        if (indexOfStudent == -1) {
            System.out.println("Không có :)))");
        } else {
           sinhViens.set(indexOfStudent, sinhVien);
        }
    }


    public void delete(String name) {
        int indexOfSinhVien = findByName(name);
        if (indexOfSinhVien == -1) {
            System.out.println("Không có :");
        } else {
           sinhViens.remove(indexOfSinhVien);
        }
    }
    }
