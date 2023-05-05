public class CodeupCrypt {

    static double version;

    public static String hashPassword(String input) {
        String hash = "";
        for (char letter : input.toCharArray()) {
            if(letter == 'a' || letter == 'A') {
                hash+=4;
            } else if(letter == 'e' || letter == 'E') {
                hash+=3;
            } else if(letter == 'i' || letter == 'I') {
                hash+=1;
            } else if(letter == 'o' || letter == 'O') {
                hash+=0;
            } else if(letter == 'u' || letter == 'U') {
                hash+=9;
            } else {
                hash += letter;
            }
        }
        return hash;
    }

    public static boolean checkPassword (String password, String hash) {
        return hash.equals(hashPassword(password));
    }


}
