package stringarray;

public class StringArray {
    public static void main(String[] args) {
        String str = "ascii";
        for (int i = 0; i <str.length()-1 ; i++) {
            for (int j = i+1; j < str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                }
            }
        }
        String[] arr =  {"as", "bd","as","ak","ht"};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
