import model.Student;

public class StudentDemo {
    public static void main(String args[]){
        Student Momo = new Student("",0,"","");
        Momo.setName("Hirai Momo");
        Momo.setAge(24);
        Momo.setGender("Female");
        Momo.setID_No("TW-03");

        System.out.println("Name: " + Momo.getName());
        System.out.println("Age: " + Momo.getAge());
        System.out.println("Gender: " + Momo.getGender());
        System.out.println("ID Number: " + Momo.getID_No());

        Student Sana = new Student("",0,"","");
        Sana.setName("Minatozaki Sana");
        Sana.setAge(24);
        Sana.setGender("Female");
        Sana.setID_No("TW-04");

        System.out.println("Name: " + Sana.getName());
        System.out.println("Age: " + Sana.getAge());
        System.out.println("Gender: " + Sana.getGender());
        System.out.println("ID Number: " + Sana.getID_No());

        Student Mina = new Student("",0,"","");
        Mina.setName("Myoui Mina");
        Mina.setAge(24);
        Mina.setGender("Female");
        Mina.setID_No("TW-06");

        System.out.println("Name: " + Mina.getName());
        System.out.println("Age: " + Mina.getAge());
        System.out.println("Gender: " + Mina.getGender());
        System.out.println("ID Number: " + Mina.getID_No());
    }
}
