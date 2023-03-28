public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
class Test{
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Chung");
        student.setClasses("C0223G1");
        System.out.println(" Name: " + student.getName());
        System.out.println(" Class: " + student.getClasses());

    }
}