package Assignments_2;

public class Demo {
    public static void main(String[] args){
        Person kst = new Person("Kaung Sithu", "13/layana(naing)223554", "Lashio, Block 12, Harker Street", "09790523334");
        kst.showInfo();
        kst.showIdentificationInfo();

        System.out.println();
        Teacher yya = new Teacher("Ye Yint Aung", "8/mamana(naing)121212", "Myaing, Block 3", "09123123123", "Primary Grade", "AA", "1000000");
        yya.showInfo();
        yya.showIdentificationInfo();
        yya.showTeacherInfo();
        System.out.println();

        yya.promote("Secondary Grade", "2000000");
        yya.transfer("LL");
        yya.showTeacherInfo();
    }
}
