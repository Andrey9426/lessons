public class StudentOp {

    private int age;
    private String name;

    public StudentOp(int age, String name){
        this.age=age;
        this.name=name;
    }

    public StudentOp(int age) {
        this(age,"constructor 1");
    }
    public StudentOp(){
        this(20,"constructor 2");
        System.out.println("constructor 2 cal");
        int a =10;
        this.age=30;
    }
    public StudentOp(String name){
    this(20);
    this.name=name;
    }
    public static void main(String[] args) {
        StudentOp st1=new StudentOp(15);
        StudentOp st2=new StudentOp();
        StudentOp st3=new StudentOp(18,"ivan");
        StudentOp st4=new StudentOp("ivan");
    }
}

