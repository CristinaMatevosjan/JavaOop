public class Main {
    public static void main(String[] args) {
        var kristinaIvanova =new Person("Кристина", "Иванова");
        var natashaPetrova=new Person("Наташа","Петрова");
        var petjaSidorov=new  Person("Петя","Сидоров");
        var romaVase4ckin=new Person("Рома","Васечкин");

        GenTree gt=new GenTree();
        gt.append(kristinaIvanova,natashaPetrova);
        gt.append(petjaSidorov,natashaPetrova);
        gt.append(romaVase4ckin,natashaPetrova);
        gt.append(petjaSidorov,romaVase4ckin);

        //System.out.println(new Research(gt).spend(petja,Relationship.parent));

        var firstResearch=new Research(gt).spend(petjaSidorov,Relationship.parent);
        System.out.println("Результаты исследования: "+ firstResearch);

    }
}