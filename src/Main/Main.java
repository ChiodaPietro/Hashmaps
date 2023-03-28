package Main;

import Utilities.Classroom;
import Utilities.Student;

//Note that this implementation is not synchronized.
// If multiple threads access a hash map concurrently,
// and at least one of the threads modifies the map structurally,
// it must be synchronized EXTERNALLLY.
public class Main {
    // i can't insert anything if i don't associate a key to it, KEY and VALUE
    // the hashmap is a dynamic structure, it implements map
    public static void main(String[] args) {
//        Main m =new Main();
//        m.print("hallo");
//        HashMap<String, Integer> hashMap=new HashMap<>(10);
//        hashMap.put("first value", 10);
//        hashMap.put("second value", 293);
//        HashMap<String , Integer> hashMap1=new HashMap<>(hashMap);
//        System.out.println(hashMap1.get("first value"));
//        System.out.println(hashMap.get("first value"));
        Classroom classroom = new Classroom("ITT", 4, 30);
        classroom.getStudents().put("Az-31038", new Student("Pietro", "Chioda", 3333333));

        System.out.println(classroom.getStudents().get("Az-31038").getName());

    }
}

