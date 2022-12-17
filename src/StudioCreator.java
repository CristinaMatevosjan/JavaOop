public class StudioCreator {

    int count=1;

    public Studio getCreatorStudio(String name){
        Studio cs=new Studio();
        name=cs.getName();
        int id=cs.getId();
        id=count++;
        return cs;
    }
}
