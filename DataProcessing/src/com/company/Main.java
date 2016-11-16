package com.company;

import Parsing.Parser;
import Processing.Preprocessor;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Parser csvParse = new Parser();
        String filePath = "BX-Books.csv";
        Map<Integer, String> lines = csvParse.parseFile(filePath);
        for(Map.Entry<Integer, String> entry : lines.entrySet()){
            int index = entry.getKey();
            String line = entry.getValue();

            Preprocessor.process(line);
        }

        //Preprocessor.process(lines.get(4906));
    }
}
