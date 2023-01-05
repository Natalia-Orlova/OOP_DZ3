package lesson3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int sizeOfGroup() {
        return this.students.size();
    }

    public Student getStudent(int index) {
        return this.students.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }


    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }
}
