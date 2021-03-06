package tr.edu.maltepe.oop;

public class Student extends Person {


    private Professor parentProf;

    public Student(long id, String name, int year, Professor parentProf) {
        super(id, name, year);
        this.parentProf = parentProf;
        this.setPersonType("Student");

    }

    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Connected professor :" + getParentProf().getName());
    }



    public Professor getParentProf() {
        return parentProf;
    }

    public void setParentProf(Professor parentProf) {
        this.parentProf = parentProf;
    }
}