package com.company;

import java.util.List;

public class Utils {

    public static String[] getColumn(List<String> dataLines, int columnIndex) {
        String[] columnRes = new String[dataLines.size()];
        int curIndex = 0;
        for (String line : dataLines) {
            String[] columns = line.split(",");
            for (int i = 0; i < columns.length; i++) {
                if (i == columnIndex) {
                    columnRes[curIndex] = columns[i];
                }
            }
            curIndex++;
        }
        return columnRes;
    }

    public static int countNumCommonElements(String[] columns1, String[] columns2) {
        int count = 0;
        for (String column1 : columns1) {
            for (String column2 : columns2) {
                if (areIdentical(column1, column2))
                    count++;
            }
        }
        return count;
    }

    private static boolean areIdentical(String str1, String str2) {
        if (str1.equals(str2)) // || Integer.parseInt(str1) == Integer.parseInt(str2)
            return true;
        else
            return false;
    }

}
