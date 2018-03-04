package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

	            /*  boolean pattern = Pattern.matches("^[0-9]", "asdasd");
	        System.out.println("a".matches("^[1-9]"));

            String parsedPhone = parsePhone("+77076765656");
            */
            System.out.println(parsePhone("87076777878"));
            System.out.println(parsePhone("7076777878"));
            System.out.println(parsePhone("+77076777878"));

    }

    public static String parsePhone(String phone) {
        if (phone.matches("((\\+7)+([0-9]){10})$")) {
            return "7" + phone.substring(2);
        }
        else if (phone.matches("((8)+([0-9]){10})$")) {
            return "7" + phone.substring(1);
        }

        else if (phone.matches("((^7)+([0-9]){9})$")) {
            return "77" + phone.substring(1);
        }

        return null;
    }
}
