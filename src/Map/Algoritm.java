package Map;


import java.util.LinkedList;
import java.util.Queue;

public class Algoritm {
    int map[][];

    public Algoritm(int[][] map) {
        this.map = map;
    }

    public void Colorize(Point2D startPoint) {
        Queue<Point2D> deque = new LinkedList<>();
        deque.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (!deque.isEmpty()) {
            Point2D p = deque.remove();

            if (map[p.x - 1][p.y] == 0) {
                deque.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y]=map[p.x][p.y]+1;
            }
            if (map[p.x][p.y + 1] == 0) {
                deque.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1]=map[p.x][p.y]+1;
            }
            if (map[p.x + 1][p.y] == 0) {
                deque.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y]=map[p.x][p.y]+1;
            }
            if (map[p.x][p.y - 1] == 0) {
                deque.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1]=map[p.x][p.y]+1;
            }
        }

    }
//    public ArrayList<Point2D> getRoad(Point2D exit) {
//        ArrayList<Point2D> road = new ArrayList<>();
//        return road;
//    }
        }

