package Main;

class Student {
    private String name;
    private String surname;
    private int number;
    public Student(String name, String surname, int number){
        this.name=name;
        this.surname=surname;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getNumber(){
        return number;
    }
}
