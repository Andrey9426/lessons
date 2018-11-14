package student;

import student.school.School;

public class Student {
    public static void main(String[] args) {
        School school = new School(200, "Kozlova 5");
        System.out.println(school.number);
//        System.out.println(school.address);
//        System.out.println(school.get.Number);
//        System.out.println(school.get.Address);
        school.number=12;
//        school.address="Polevai 10";
        school.setAddress("Lenina 5");
        school.setNumber(23);
    }
}
