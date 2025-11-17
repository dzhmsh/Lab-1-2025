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

class MySecondClass {
    private int a, b;

    int getA() {
        return this.a;
    }

    int getB() {
        return this.b;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int diffOperation() {
        return -1 * b + a;
    }
}