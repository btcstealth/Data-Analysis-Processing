package com.company;

import Parsing.Parser;
import Processing.Preprocessor;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        String[] filePaths = {"app_events.csv", "app_labels.csv", "events.csv", "gender_age_train.csv", "label_categories.csv", "phone_brand_device_model.csv"};

        Parser csvParse = new Parser();

        List<String> events = csvParse.parseFile(filePaths[2], true);
        List<String> users = csvParse.parseFile(filePaths[3], true);

        String[] deviceIdsEvents = Utils.getColumn(events, 1);
        String[] deviceIdsUsers = Utils.getColumn(users, 0);

        int numCommonIds = Utils.countNumCommonElements(deviceIdsEvents, deviceIdsUsers);
        System.out.println(numCommonIds);




        //Map<Integer, String> lines1 = csvParse.parseFile(filePaths[3]);
        //Map<Integer, String> lines2 = csvParse.parseFile(filePaths[4]);

        //compareColumns(lines1, lines2, 1, 1);

        /*
        String filePath = "events.csv";
        Map<Integer, String> lines = csvParse.parseFile(filePath);
        for(Map.Entry<Integer, String> entry : lines.entrySet()){
            int index = entry.getKey();
            String line = entry.getValue();
            //Preprocessor.process(line);
        }
        */

        //System.out.println(lines.get(4906));

        //Preprocessor.process(lines.get(4906));
    }


    private static boolean compareColumns(Map<Integer, String> dataLines1, Map<Integer, String> dataLines2, int numColumn1, int numColumn2){
        final String sepChar = ",";

        for (Map.Entry<Integer, String> entry1 : dataLines1.entrySet()){
            String line1 = entry1.getValue();
            String[] line1columns = line1.split(sepChar);

            for (int i = 0; i < line1columns.length; i++){
                if (i == numColumn1){
                    String column = line1columns[i];
                    System.out.println(column);
                }
            }
        }


        return false;
    }

    private static boolean compareColumns(Map<Integer, String> dataLines, int numColumn){
        final String sepChar = ",";

        for (Map.Entry<Integer, String> entry1 : dataLines.entrySet()){
            String line1 = entry1.getValue();
            String[] line1columns = line1.split(sepChar);

            for (int i = 0; i < line1columns.length; i++){
                if (i == numColumn){
                    String column = line1columns[i];
                    System.out.println(column);
                }
            }
        }
        return false;
    }
}
