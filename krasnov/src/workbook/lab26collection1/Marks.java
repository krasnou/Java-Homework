package workbook.lab26collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Marks<E> {

    public List<Integer> randomArray(int size) {

        List<Integer> newArrayList = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            int next = (int) (Math.random() * 10);
            newArrayList.add(next);
        }
        return newArrayList;
    }

    public void deleteNegative(List<Integer> marks) {
        int negative = 4;
        for (Iterator<Integer> it = marks.iterator(); it.hasNext(); )
            if (it.next() <= negative)
                it.remove();
        System.out.println(marks);
    }
}
