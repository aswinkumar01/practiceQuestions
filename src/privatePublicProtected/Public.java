package privatePublicProtected;

import java.util.Scanner;

public class Public {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Private prv = new Private();
        Protected protect =  new Protected();
         System.out.println("enter your id");
         prv.setId(sc.nextInt());
        sc.nextLine();
         System.out.println("enter your name");
        prv.setName(sc.nextLine());
         System.out.println("enter your job type");
         String jobType= sc.nextLine();
         System.out.println("enter your salary");
        protect.salary=sc.nextLong();
        System.out.println("Your id "+prv.getId()+", your name "+prv.getName()+", your job salary "+jobType+", your Salary is "+protect.salary);

    }
}
