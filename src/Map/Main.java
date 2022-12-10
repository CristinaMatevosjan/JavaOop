package Map;

public class Main {
    public static void main(String[] args) {
        var mg=new MapGenerator();
//        mg.setExit(new Point2D(7,7));
//        mg.setExit(new Point2D(10,10));


        System.out.println(new MapPrinter().rawData(mg.getMap()));

        var wa=new Algoritm(mg.getMap());
        wa.Colorize(new Point2D(3,3)); // точка начала пути в лабиринте

        System.out.println(new MapPrinter().rawData(mg.getMap()));

        Point2D p = new Point2D(10, 13); // точка выхода из лабиринта

        System.out.println(mg.getMap()[p.x][p.y]);
        new WaveFinder(mg.getMap()).getWay(p);

        System.out.println(
                new MapPrinter().rawData(mg.getMap()));

        }

    }

