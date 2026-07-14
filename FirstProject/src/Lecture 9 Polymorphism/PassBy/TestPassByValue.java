package PassBy;

public class TestPassByValue {
//    public static void main(String[] args) {
//        int x=5;
//        int y=10;
//        int sum= add(x,y);
//        System.out.printf("x=%d, y=%d, sum=%d ", x, y, sum);
//    }
//    public static int add(int a, int b){
//        return a+b;
//    }
//}
//🌟Output: x=5, y=10, sum=15

    public static void main(String[] args) {
        int x=5;
        int y=10;
        int sum= add(x,y);
        System.out.printf("x=%d, y=%d, sum=%d ", x, y, sum);
    }
    public static int add(int a, int b){
        a=99;                          // Value of original 'a' didn't change as primitive type‼️‼️ pass by value‼️‼️
        return a;
    }
// 🌟Output: x=5, y=10, sum=99
}