package lesson3;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {

    private int index = -1;
    private StudentGroup studentGroup;

    public GroupListIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return this.index < studentGroup.sizeOfGroup() - 1;
    }

    @Override
    public Student next() {
        this.index++;
        return studentGroup.getStudent(this.index);
    }

    @Override
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override
    public Student previous() {
        this.index--;
        return studentGroup.getStudent(this.index);
    }

    @Override
    public int nextIndex() {
        return this.index++;
    }

    @Override
    public int previousIndex() {
        return this.index--;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Student student) {

    }

    @Override
    public void add(Student student) {

    }
}
