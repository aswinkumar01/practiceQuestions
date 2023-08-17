package inheritanceandpolymorphism;

class ClassA {
    //it for inheritance and polymorphism
    int empid;
    String name;

    void add(int k){ // this is for polymorphism(over riding)
        System.out.println(k+k);
    }

}

class ClassB extends ClassA{
    String jobType;

    void justPrint(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(jobType);
    }
    @Override
    void add(int a){ // this is for polymorphism(overriding)
        System.out.println(100-a);
    }
}
public class PolyAndInherit {

    int multiply(int k){ // this is for polymorphism(overloading)
        return k*k;
    }

    int multiply(int k,int l){// this is for polymorphism(overloading)
        return k*l;
    }
    public static void main(String[] args) {
        ClassB cb = new ClassB();
        PolyAndInherit pi = new PolyAndInherit();
        cb.empid = 1234;
        cb.name = "aswin";
        cb.jobType = "permananent";

        cb.justPrint();

        cb.add(12);

        System.out.println(pi.multiply(12,78));


    }
}



