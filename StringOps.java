public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest (String string) {
        String new_str = "";
        char c = ' ';
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I'|| string.charAt(i) == 'O' || string.charAt(i) == 'U' || string.charAt(i) == ' ') {
                c = string.charAt(i);
                new_str = new_str + c;
            } else if (string.charAt(i) >64 && string.charAt(i) < 91) {
                c = string.charAt(i);
                c += 32;
                new_str = new_str + c;
            } else if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'|| string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                c = string.charAt(i);
                c -= 32;
                new_str = new_str + c;
            } else if (string.charAt(i) > 96 && string.charAt(i) < 123) {
                c = string.charAt(i);
                new_str = new_str + c;
            }
        }
        return new_str;
    }

    public static String camelCase (String string) {
        String new_str = "";
        String final_str = "";
        int first_space = 0;
        char c;
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            if (c == ' ') {
                first_space++;
            }
            if (first_space == 0) {
                if (c > 64 && c < 91) {
                    c += 32;
                }
                new_str = new_str + c;
            } else {
                if (string.charAt(i-1) == ' ' && (c > 96 && c < 123)) {
                    System.out.println("imm in");
                    c -= 32;
                } else if (c > 64 && c < 91 && string.charAt(i-1) != ' ') {
                    c += 32;
                }
                new_str = new_str + c;
            }
        }
        for (int i = 0; i < new_str.length(); i++) {
            if (new_str.charAt(i) != ' ') {
                final_str = final_str + new_str.charAt(i);
            }
        }
        return final_str;
    }

    public static int[] allIndexOf (String string, char chr) {
        int [] arr = new int [string.length()];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[i] = 1;
                count++;
            }
        }
        int [] final_arr = new int [count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                final_arr[(final_arr.length - count)] = i;
                count--;
            }
        }
        return final_arr;
    }
}
