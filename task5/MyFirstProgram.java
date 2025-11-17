import myfirstpackage.*;

class MyFirstClass {

    public static void main(String[] args) {

        MySecondClass o = new MySecondClass(0, 10);
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.diffOperation() + "\t");
            }
            System.out.println();
        }
    }
}