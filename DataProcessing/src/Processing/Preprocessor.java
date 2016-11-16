package Processing;

import java.util.Map;

public class Preprocessor {


    public static void process(String line) {
        /*
        boolean validNumColumns = validNumColumns(line);
        if (!validNumColumns) {
            System.out.println();
        }
        */


        iterateColumns(line.split(";"));


    }

    private static void iterateColumns(String[] columns){
        final int numColumns = columns.length;
        for (int i = 0; i < numColumns; i++){
            String column = columns[i];
            if (containsInlineQuoteChar(column))
                System.out.println("contained \" character");
        }
    }

    private static void iterateColumn(String column){
        final String quoteChar = "\"";
        int numQuoteChars = 0;

        for (int i = 0; i < column.length(); i++){
            String c = ""+column.charAt(i);
            if (quoteChar.equals(c)){
                numQuoteChars++;
            }
            //Process char
        }
    }

    private static boolean validNumColumns(String line) {
        final int expectedNumColumns = 8;
        final String columnSep = ";";
        String[] columns = line.split(columnSep);
        final int numColumns = columns.length;
        if (numColumns == expectedNumColumns)
            return true;
        else {
            System.out.println("num columns was different from: " + numColumns);
            return false;
        }
    }

    private static boolean validFormat(String line){
        String[] columns = line.split(";");
        int numColumns = columns.length;
        for (int i = 0; i < numColumns; i++){
            //columns[i].
        }
        return false;
    }

    private static boolean containsInlineQuoteChar(String column){
        final String quoteChar = "\"";
        final String firstChar = column.substring(0,1);
        final String lastChar = column.substring(column.length()-1, column.length());
        final boolean startOrEndsAndQuoteChar = (quoteChar.equals(firstChar) && quoteChar.equals(lastChar));
        if (startOrEndsAndQuoteChar){
            String cutLine = column.substring(1, column.length()-1);
            if (cutLine.contains(quoteChar)){
                return true;
            }
        }
        return false;
    }

    private static boolean constainsInvalidCharacters(){
        return false;
    }


}
