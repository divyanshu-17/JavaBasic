class TypeCastUp {
    public void show1(){
        System.out.println("In show 1st");
    }

}

class B extends TypeCastUp{
    public void show2(){
        System.out.println("In show 2nd");
    }
}

class DemoTC{
    public static void main(String[] args) {
        TypeCastUp obj = (TypeCastUp) new B();
        obj.show1();
        //❤️ TypeCastUp obj = new B(); This too will do as we are upcasting

        // obj.show2();  ‼️‼️error
        // TypeCastUp is the reference type (the type of the variable) — it determines what methods/members you can call through that reference at compile time.
        //new B() creates the actual object, which lives on the heap and is of type B.
    }
}
