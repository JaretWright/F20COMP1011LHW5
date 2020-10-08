public class Student implements Comparable<Student> {
    private int studentNum;
    private String firstName, lastName;
    private int averageGrade;

    public Student(int studentNum, String firstName, String lastName, int averageGrade) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String toString()
    {
        return String.format("Student #: %d, name: %s %s, average: %d",
                studentNum, firstName, lastName, averageGrade);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return lastName.compareTo(otherStudent.lastName);
    }
}
