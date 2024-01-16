package fucion;
import java.util.Scanner;
import static fucion.plansza.board;
public class ShipsWar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wybierz pole swojego statku\n" +
                "                {A1, B1, C1, D1},\n" +
                "                {A2, B2, C2, D2},\n" +
                "                {A3, B3, C3, D3},\n" +
                "                {A4, B4, C4, D4}");
        String playerShip = sc.next();
        String playerShip2 = sc.next();
        String playerShip3 = sc.next();


         String botBout = (FucionBot.shipBot(board));
         String botBout2 =(FucionBot.shipBot(board));
         String botBout3 = (FucionBot.shipBot(board));

        int point = 3;
        int pointbot = 3;
        int round = 15;

        while (round > 0) {

            round--;
            System.out.println("wybierz pole do ataku");

            Scanner sc1 = new Scanner(System.in);

            String ruchGracza = sc1.next();

                if ( ruchGracza.equals(botBout) || ruchGracza.equals(botBout2) || ruchGracza.equals(botBout3) )
                {
                    point--;
                    System.out.println("Trafiłeś w statek bota zostały mu " +point +" statek");
                         if (point == 0)
                         {
                            System.out.println("Zniszczyłeś wysztkie statki bota wygrałeś");
                               break;
                         }
                }
            String botshot = FucionBot.logicBot(board);
            System.out.println(botBout+botBout2+botBout3);
            System.out.println("Bot strzela w " + botshot );

                if ( playerShip.equals(botshot) || playerShip3.equals(botshot) || playerShip2.equals(botshot) )
                {
                    pointbot --;
                    System.out.println("Zostałeś trafion przez bota zostały c " + pointbot +" statki");

                    if(pointbot == 0)
                    {
                        System.out.println("Wysztkie twoje statki są zniszczoen przegrałeś ");
                        break;

                    }
                }
                if (round == 0)
            {
                System.out.println("Remis");
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
