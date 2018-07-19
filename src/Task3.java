public class Task3 {
    public static int parseAge(String ageString) {

        String s = ageString;
        int convertFromString = Integer.parseInt(s);

        if (convertFromString <= 120 && convertFromString > 0)
            return convertFromString;
        else
            throw new IllegalArgumentException("The input string is a number that does not correspond to the range 1..120");
    }

}