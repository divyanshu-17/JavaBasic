package AnotherEx;

public class TestArrIn {
    public static void main(String[] args) {
        ArrayOpInhert opr = new ArrayOpInhert(new int[]{1,3,5,9});
        ArrayOpInhert.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
