package Utilities;

import java.util.HashMap;

public class Classroom {
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
    @Override
    public String toString(){
        if(!map.isEmpty()) {
            StringBuilder str = new StringBuilder();
            str.append("section: "+ section+" grade: "+high_school_grade);
            str.append("\n");
            for (String item : map.keySet()) {
                try {
                    str.append(map.get(item).toString());
                    str.append("\n");
                } catch (NullPointerException e) {
                    System.out.println("there is an item with value to null");
                }
            }
            return str.toString();
        }
        return null;
    }
}
