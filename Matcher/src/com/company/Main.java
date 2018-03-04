package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
	        boolean pattern = Pattern.matches("^[0-9]", "asdasd");

	        System.out.println("a".matches("^[1-9]"));

            String parsedPhone = parsePhone("+77076765656");
            System.out.println(parsedPhone);
    }

    public static String parsePhone(String phone) {
        if (phone.matches("^((\\+7)+([0-9]){10})$")) {
            return "8" + phone.substring(2,12);
        }
        return null;
    }
}
