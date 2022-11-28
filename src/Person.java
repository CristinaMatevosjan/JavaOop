public class Person implements Human{
    private String firstName;
    private String secondName;

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public Person(String firstName,String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.secondName;
    }
}
