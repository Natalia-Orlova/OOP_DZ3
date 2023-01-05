package lesson3;

import javax.xml.crypto.Data;

public class Student {
    private String name;
    private String dateofBirth;
    private float averageGrade;


    public Student(String name, String dateofBirth, float averageGrade) {
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
