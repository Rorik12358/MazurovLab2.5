package lab2_5_1;

/**
 * Created by m18 on 22.02.2016.
 */
public class classCount {
    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }
    static {
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }

    public classCount() {
        System.out.println("constructor 1");
    }
    public classCount(int a) {
        this();
        System.out.println("constructor 2");
    }

}
