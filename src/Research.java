import java.util.ArrayList;

public class Research {
    ArrayList<Node> tree;

    public Research(Tree pd){
        tree=pd.getData();
    }

    public ArrayList<Person> spend(Human p, Relationship re){
        var result=new ArrayList<Person>();

        for (Node t: tree) {
            if(t.p1.getFirstName()== p.getFirstName() && t.p1.getSecondName()==p.getSecondName()
                    && t.re==re){
                result.add(t.p2);
            }
        }
        return result;
    }
}
