package unit;

public class StringHelper {

    public String truncateInFirst2Positions(String str) {
        if(str.length() <= 2){
            return str.replace("A", "");
        }

        String first2Chars = str.substring(0,2);
        String lastChars = str.substring(2);

        return first2Chars.replace("A", "") + lastChars;
    }

    public boolean areFirstAndLastTwoCharactersTheSame(String str) {

        if(str.length() <= 1)
            return false;

        String first2 = str.substring(0,2);
        String last2 = str.substring(str.length()-2);

        return first2.equals(last2);
    }
}
