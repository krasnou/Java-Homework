package workbook.lab26collection1;

import java.util.List;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */
public class Launcher {
    public static void main (String [] args){
        Marks<Integer> marks = new Marks<Integer>();

        List<Integer> marksList = marks.randomArray(20);
        System.out.println(marksList);

        marks.deleteNegative(marksList);
    }

}