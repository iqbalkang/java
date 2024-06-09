package Collections;

import com.sun.source.tree.Tree;

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if(x < p.x) return -1;
        else if (x > p.x) return 1;
        else {
            if(y < p.y) return -1;
            else if (y > p.y) return 1;
            else return 1;
        }
    }

    @Override
    public String toString() {
//        return "(x = " + x + ", y = " + y + ")";
        return "(" + x + ", " + y + ")";
    }
}

public class TreeSetPractice {

    public static void main(String[] args) {
        TreeSet<Point> points = new TreeSet<>();
        points.add(new Point(4,1));
        points.add(new Point(3, 4));
        points.add(new Point(3, 2));
        points.add(new Point(5, 2));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));


        System.out.println(points);


//        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 50, 40, 10, 20));
//        ts.add(31);
//        ts.add(31);
//
//        System.out.println(ts.ceiling(30));
//        System.out.println(ts);
    }
}
