import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Яков", "Яковлев", "Яковлевич", LocalDate.now());
        Teacher teacher2 = new Teacher("Савелий", "Смирнов", "Леонидович", LocalDate.now());
        Teacher teacher3 = new Teacher("Антон", "Денисов", "Николаевич", LocalDate.now());
        Teacher teacher4 = new Teacher("Данил", "Попов", "Алексеевич", LocalDate.now());

        TreeSet<Teacher> teacherList = new TreeSet<>(new TeacherComporator<>());
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);

        System.out.println(teacherList);

        Iterator<Teacher> iterator = teacherList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}