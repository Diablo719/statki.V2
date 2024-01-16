//package fucion;
//
//import java.util.Random;
//
//public class FucionBot {
//    public static int strzalBota(int [][] board) {
//
//        Random random = new Random();
//        int liczbaWierszy = board.length;
//        int liczbaKolumn = board[0].length;
//        int losowyWiersz = random.nextInt(liczbaWierszy);
//        int losowaKolumna = random.nextInt(liczbaKolumn);
//        int wartoscNaLosowymPolu = board[losowyWiersz][losowaKolumna];
//
//        return wartoscNaLosowymPolu;
//    }
//
//}
package fucion;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class FucionBot {

    private static  Set<String> usedValues = new HashSet<>();

    public static String logicBot(String[][] board) {
        Random random = new Random();
        int numRows = board.length;
        int numColumns  = board[0].length;
        int numRow;
        int numColumn;
        String randomPlaceOnBoard;
        do {
            numRow = random.nextInt(numRows);
            numColumn = random.nextInt(numColumns );
            randomPlaceOnBoard = board[numRow][numColumn];
        } while (usedValues.contains(randomPlaceOnBoard));
        usedValues.add(randomPlaceOnBoard);


        return randomPlaceOnBoard ;

    }
    private static  Set<String>  usedValues2 = new HashSet<>();
    public static String shipBot(String[][] board) {
        Random random = new Random();
        int numRows = board.length;
        int numColumns = board[0].length;
        int numRow;
        int numColumn;
        String randomPlaceOnBoard;
        do {
            numRow = random.nextInt(numRows);
            numColumn = random.nextInt(numColumns);
            randomPlaceOnBoard = board[numRow][numColumn];
        } while (usedValues2.contains(randomPlaceOnBoard));
        usedValues2.add(randomPlaceOnBoard);


        return randomPlaceOnBoard;
    }

}
