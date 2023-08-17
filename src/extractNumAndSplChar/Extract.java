package extractNumAndSplChar;

class Str{
    String number;
    String splChar;
    String name = "wFvLrl2xQjyrWrxeNI21@#9w";

    String printSplCharacters(){
        splChar = name.replaceAll("[!^0-9 A-Z a-z]", "");
        return splChar;
    }

    String printNumber(){
        number = name.replaceAll("[^0-9]","");
        return  number;
    }
}

public class Extract {
    public static void main(String[] args) {
       Str s =new Str();
        System.out.println("the numbers are "+s.printNumber());
        System.out.println("the specila characters are "+s.printSplCharacters());
        }
}
