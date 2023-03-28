package Main;

import Main.Student;

import java.util.HashMap;

class Classroom {
    private String section;
    private int high_school_grade;
    private HashMap<String, Student> map;

    public Classroom(String section, int high_school_grade, int class_size) {
    this.section=section;
    this.high_school_grade=high_school_grade;
    map=new HashMap<>(class_size);
    }
    public String getSection(){
        return section;
    }
    public int getHigh_school_grade(){
        return high_school_grade;
    }
    public HashMap<String, Student> getStudents(){
        return map;
    }
}
