import java.util.ArrayList;

public class GenTree implements Tree{
    private ArrayList<Node> tree=new ArrayList<>();

    public ArrayList<Node> getData(){
        return tree;
    }
    public void append(Person parent, Person children){
        tree.add(new Node(parent, Relationship.parent,children));
        tree.add(new Node(children,Relationship.children,parent));
    }
}
