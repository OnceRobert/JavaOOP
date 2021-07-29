package model;

public class Student {
    public String name;
    public int age;
    public String gender;
    public String ID_No;

    public Student(String name, int age, String gender, String ID_No){  //Constructor Method
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID_No = ID_No;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setID_No(String ID_No){
        this.ID_No = ID_No;
    }

    //Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getID_No(){
        return ID_No;
    }




}
