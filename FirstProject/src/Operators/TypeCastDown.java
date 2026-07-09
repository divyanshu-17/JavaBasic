class TypeCastDown {
        public void show1(){
            System.out.println("In show 1st");
        }

}

class C extends TypeCastDown {
    public void show2(){
        System.out.println("In show 2nd");
    }
}

class DemoTD{
    public static void main(String[] args) {
        TypeCastDown obj = (TypeCastDown) new C();
        obj.show1();

        C obj1 = (C) obj; // ‼️Down Casting
        obj1.show2();
    }
}