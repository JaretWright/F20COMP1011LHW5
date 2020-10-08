import java.util.*;

public class ExploringSets {
    public static void main(String[] args) {
        HashSet<String> companyNames = new HashSet<>();
        companyNames.add("IBM");
        companyNames.add("Apple");
        companyNames.add("Google");
        companyNames.add("Apple");

        System.out.println(companyNames);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("IBM");
        treeSet.add("Apple");
        treeSet.add("Google");
        treeSet.add("Apple");
        System.out.println(treeSet);

        //using our simple Student class
        Student st1 = new Student(1001,"Cam","Slept-in",84);
        Student st2 = new Student(1002,"Sky","Slept-in",85);
        Student st3 = new Student(1003,"Anita","Sleep",95);

        TreeSet<Student> students = new TreeSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        System.out.println(students);

        ArrayList<Student> arrayListOfStudents = new ArrayList<>();
        arrayListOfStudents.add(st1);
        arrayListOfStudents.add(st2);
        arrayListOfStudents.add(st3);
        System.out.println("ArrayList: "+arrayListOfStudents);
        Collections.sort(arrayListOfStudents);
        System.out.println("Sorted ArrayList: "+arrayListOfStudents);

        Collections.sort(arrayListOfStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getStudentNum(),s2.getStudentNum());
            }
        });
        System.out.println("Sorted ArrayList: "+arrayListOfStudents);
        Collections.sort(arrayListOfStudents, (s1, s2) -> {
            return Integer.compare(s1.getAverageGrade(),s2.getAverageGrade());
        });
        System.out.println(arrayListOfStudents);
    }
}
