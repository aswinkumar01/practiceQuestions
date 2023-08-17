package abstractionEncapsulation;

abstract class HeadOfz {
    int empid;
    String name;

    void yourDetials() {
        System.out.println("your name "+name+", your id "+empid);
    }

    abstract void managerName();
}

class Chennai extends HeadOfz{
    @Override
    void managerName() {
        System.out.println("dhoni");
    }
}

class Bangalore extends HeadOfz{
    @Override
    void managerName() {
        System.out.println("virat");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Chennai chn = new Chennai();
        chn.name = "ashwin";
        chn.empid = 123;
        chn.yourDetials();
        chn.managerName();

        Bangalore bgl = new Bangalore();
        bgl.name = "jadeja";
        bgl.empid = 321;
        bgl.yourDetials();
        bgl.managerName();



    }

}
