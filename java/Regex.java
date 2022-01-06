package java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String regex = "(\\w)(.)([a-z])(.\\bcom)";
        Pattern regexPattern = Pattern.compile(regex);

       Matcher target = regexPattern.matcher("raphael1angel@hotmail.com");

       boolean encontrou = target.find();

       if(encontrou){
            String group = target.group();
            String group1 = target.group(1);
            String group2 = target.group(2);

            System.out.println(group);
            System.out.println(group1);
            System.out.println(group2);

       }
            
    }
}
