public class RandomOOP {

    public static void main(String[] args) {
        new B().printStuff();
    }
}

class AB {

    public int i = 0;

    AB() {
        System.out.println("A Called");
    }
}

class B extends AB {

    int i = 1;

    B() {
        System.out.println("Accessing Super Params " + super.i);
    }

    void setJ(int i) {
        this.i = i;
    }

    public void printStuff(){
        System.out.println(super.i+" "+this.i);
    }
}