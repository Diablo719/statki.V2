package fucion;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static fucion.plansza.board;
public class ShipsWar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wybierz pole swojego statku\n" +
                "                {A1, 21, 31, 41},\n" +
                "                {12, 22, 32, 42},\n" +
                "                {13, 23, 33, 43},\n" +
                "                {14, 24, 34, 44}");
         String playerShip = sc.next();


         String botBout = (FucionBot.logicBot(board));


        int round = 5;
        while (round > 0) {

            round--;
            System.out.println("wybierz pole do ataku");

            Scanner sc1 = new Scanner(System.in);

            String ruchGracza = sc1.next();

            String botshot = FucionBot.logicBot(board);
            System.out.println("Bot strzela w " + botshot );

                if (ruchGracza.equals(botBout))
                {
                System.out.println("hit trafiles bota wygrałeś");
                break;
                }


                if (playerShip.equals(botshot) )
                 {
                 System.out.println("hit zostales trafiony przegrałeś ");
                break;
                 }
        }
    }
}





//    wybierz pole swojego statku
//                        {11, 21, 31, 41},
//                        {12, 22, 32, 42},
//                        {13, 23, 33, 43},
//                        {14, 24, 34, 44}
//                        11
//                        wybierz pole do ataku
//                        33
//                        bot srzela w11
//                        hit zostales trafiony przegrałeś
// zrobic 2 statki jeden na 2 pola jeden na 3
// licznik co sprawdza czy to nie jest trafione pole


//!(abc == wartoscNaLosowymPolu)

//C:\Users\ingus\.jdks\openjdk-21.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\lib\idea_rt.jar=50197:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\ingus\IdeaProjects\BattleShipsWorkEdition\out\production\BattleShipsWorkEdition ShipsWar
//        wybierz pole swojego statku
//        {11, 21, 31, 41},
//        {12, 22, 32, 42},
//        {13, 23, 33, 43},
//        {14, 24, 34, 44}
//        23
//        wybierz pole do ataku
//        11
//        bot srzela w21
//        wybierz pole do ataku
//        34
//        hit trafiles bota wygrałeś
//
//        Process finished with exit code 0
