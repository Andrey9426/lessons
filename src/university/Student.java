package university;

import student.school.School;

public class Student {


    private School school;
    private int age;
    private String name;

  static int counter;
  {
      age=12;                           // <--- вызывается каждый раз при создании
      name="name";
    }
    static {                        // <--   вызывается 1 раз при запуске программы
      counter++;                    //       <-- считает сколько

    }
public Student(){}

      public Student(int age,String name){
          this.age=age;
          this.name=name;
    }
    public String getName(){
          return name;
    }
    public int getAge(){
        return age;
    }
    public static void printClassName(){
        System.out.println("university.Student");
    }
    public Student (int age){                  // <---     т.к имена переменых и поля класса совподают htis использовать обязательно
        this.age=age;
    }

//    public university.Student (int ageOfStudent){                    <----  this не обязательно,т.к. разные
//        age=ageOfStudent;
//    }

    public static void main(String[] args) {
        Student st =new Student();
        Student st1=new Student();

        System.out.println(st.getName());
        System.out.println(st1.getAge());
        System.out.println(counter);
//        university.Student.counter;                         <--- Вызывает counter
//        university.Student.printClassName();
    }

}

