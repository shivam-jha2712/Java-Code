class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc {
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class VeryAdvCalc extends AdvCalc {
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

class PC extends VeryAdvCalc {
    public void show() {
        System.out.println("PC prints");
    }
}

class Mobile extends VeryAdvCalc {
    public void show() {
        System.out.println("Mobile plays");
    }
}

public class Demo_12Inheritence {
    public static void main(String[] args) {

        // Result of simple inheritance
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(15, 5);
        int r2 = obj.div(15, 3);

        // Result of multilevel inheritance
        VeryAdvCalc obj2 = new VeryAdvCalc();
        double r3 = obj2.power(2, 5);
        System.out.println(r1 + " : " + r2 + " : " + r3);

        // Result of Hierarchical Inheritance
        PC objPc = new PC();
        objPc.show();
        int r4 = objPc.add(5, 2);
        System.out.println(r4);

        Mobile objMobile = new Mobile();
        objMobile.show();
        double r5 = objMobile.power(5, 2);
        System.out.println(r5);

    }
}
