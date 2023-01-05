package lesson3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/*
Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора.
(Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
Он реализует интерфейс ListIterator<Student>. Добавьте в Группу метод listIterator (),
который позволяет начать итерацию с помощью GroupListIterator.

Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает.
 */
public class Main {
    public static void main(String[] args) {
        StudentGroup students1 = new StudentGroup(Arrays.asList(
                new Student ("Ivanov Ivan", "05.12.2006", 4.5f),
                new Student ("Petrov Petr", "25.10.2006", 4.8f),
                new Student ("Solovev Denis", "16.07.2006", 5.0f),
                new Student ("Pavlov Pavel", "16.07.2006", 3.8f)
        ));

        System.out.println("\n запись через while с итераторами \n");

        Iterator<Student> studIt = students1.iterator();
        while (studIt.hasNext()) {
            System.out.println(studIt.next());
        }

        System.out.println("\n запись через while с listIterator \n");
        ListIterator<Student> studListIt = students1.listIterator();
        while (studListIt.hasNext()) {
            System.out.println(studListIt.next());
        }

        System.out.println("\n запись в обратном порядке от выбранного студента \n");
        studListIt.set(students1.getStudent(students1.sizeOfGroup()-1));
        while (studListIt.hasPrevious()) {
            System.out.println(studListIt.previous());
        }

        System.out.println("\n запись через foreach \n");
        for (Student student : students1) {
            System.out.println(student);
        }
    }
}
