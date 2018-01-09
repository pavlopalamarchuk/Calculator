package com.company;
import java.io.*;
import java.util.regex.*;

public class Parse {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:/READM.txt");
        BufferedReader reader = new BufferedReader(file);

        String text = "";
        String line = reader.readLine();
        while (line != null)
        {
            text +=line;
            line = reader.readLine();
        }

        regexChecker("(http(s)?://)?+([A-Za-z0-9]{3}\\.)?+[A-Za-z0-9]+\\.[A-Za-z0-9]{3}",text);
        reader.close();}

        public static void regexChecker(String theRegex, String str2Check) throws IOException {

            Pattern checkRegex = Pattern.compile(theRegex);
            Matcher regexMatcher = checkRegex.matcher( str2Check );
            while ( regexMatcher.find() ){

                if (regexMatcher.group().length() != 0){

                    System.out.println(regexMatcher.group());}

                File newFile = new File("D:/MY.txt");
                FileWriter fileW = new FileWriter(newFile, true);

                BufferedWriter buffW = new  BufferedWriter(fileW);
                buffW.write(regexMatcher.group()+"\r\n");

                buffW.close();

            }

        }
    }



