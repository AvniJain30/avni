public class parameterised_constructor {
    int id;
    String name;

    parameterised_constructor(int ID,String NAME){
        id = ID;
        name = NAME;
    }

    void display(){
        System.out.println(id + "  " +name);
    }

    public static void main(String[] args){
        parameterised_constructor s1 = new parameterised_constructor(001, "Anjali");
        parameterised_constructor s2 = new parameterised_constructor(002, "Avni");
        s1.display();
        s2.display();
    }
}
