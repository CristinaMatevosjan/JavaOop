public class Node {
    Person p1;
    Person p2;
    Relationship re;

    public Node(Person p1,Relationship re,Person p2){
        this.p1=p1;
        this.p2=p2;
        this.re=re;
    }

    @Override
    public String toString(){
        return String.format("<%s %s % s>", p1,re,p2 );
    }
}
