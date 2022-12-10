package Map;

public class WaveFinder {
    int[][] map;

    public WaveFinder(int[][] map) {
        this.map = map;
    }

    void getWay(Point2D end) {

        Point2D p = new Point2D(end.x, end.y);
        while (map[p.x][p.y] != 1) {


            if (map[p.x - 1][p.y] == map[p.x][p.y] - 1) {
                map[p.x][p.y] = 199; // будет показывать путь
                p.x -= 1;
                continue;
            }
            if (map[p.x][p.y - 1] == map[p.x][p.y] - 1) {
                map[p.x][p.y] = 199;
                p.y -= 1;
                continue;
            }
            if (map[p.x + 1][p.y] == map[p.x][p.y] - 1) {
                map[p.x][p.y] = 199;
                p.x += 1;
                continue;
            }
            if (map[p.x][p.y + 1] == map[p.x][p.y] - 1) {
                map[p.x][p.y] = 199;
                p.y += 1;

            }
        }
        System.out.println("++");

    }

}

