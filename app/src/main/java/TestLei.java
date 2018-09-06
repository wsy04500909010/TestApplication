/**
 * Created by WangSiYe on 18/6/22.
 */

public class TestLei {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int i = 0;
        myClass.setI(i);
        i++;
        System.out.println(i);
        myClass.outI();
    }

}

class MyClass {
    private int i;

    public void setI(final int i) {
        this.i = i;
    }

    public void outI() {
        System.out.println(this.i);
    }
}
