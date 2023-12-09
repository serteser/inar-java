package week_14.assignments.Question_14_03;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {

        if (o1.getY() == o2.getY()) {

            return o1.getX() > o2.getX() ? 1 : (o1.getX() < o2.getX() ? -1 : 0);
        } else {

            return o1.getY() > o2.getY() ? 1 : (o1.getY() < o2.getY() ? -1 : 0);
        }
    }
}
