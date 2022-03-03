class IIB {
    IIB(){
        System.out.println("constructor of parent class");
    }
}

class child extends IIB{
    child(){
        System.out.println("constructor of child class");
    }
    {System.out.println("Instance initializer block");}

    public static void main(String[] args){
        child obj = new child();
    }
}


