package Parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Parser {

    public Map<Integer, String> parseFile(String filePath){
        File file = new File(filePath);
        Map<Integer, String> lines = new HashMap<>();

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        String newline = "\n";

        try {
            br = new BufferedReader(new FileReader(file));
            int index = 1;
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(newline);
                String l = country[0];
                boolean notNullOrEmpty = (l != null && !"".equals(l));
                if (notNullOrEmpty){
                    //if (index==4906){
                      //  System.out.println(country);
                    //}

                    lines.put(index, l);
                }
                index++;
            }


        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        return lines;
    }


    public List<String> parseFile(String filePath, boolean flag){
        File file = new File(filePath);
        List<String> lines = new ArrayList<String>();

        BufferedReader br = null;
        String line = "";
        String newline = "\n";

        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] country = line.split(newline);
                String l = country[0];
                boolean notNullOrEmpty = (l != null && !"".equals(l));
                if (notNullOrEmpty){
                    lines.add(l);
                }
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        return lines;
    }

}
