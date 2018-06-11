import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;


public class GameCards {
    ArrayList<Karta> coloda;
    ArrayList table;
    Player[]players={
            new Player("Иван",30,null),
            new Player("Игорь",50,null),
            new Player("Дима", 100,null)

    };

    public static void main(String[] args) {
        GameCards gameCards=new GameCards();
        //gameCards.showAllCards();
        gameCards.testShow();
        gameCards.handOut();
        gameCards.showCardsTable();

    }


    /*public GameCards(){
        coloda=new ArrayList<>(52);
        for (int i = 0; i < Mast.values().length; i++) {
            for (int j = 0; j < Value.values().length; j++) {
                coloda.add(new Karta(Mast.values()[i],Value.values()[j]));
            }
        }
    }*/

    // test
    public GameCards() {
        coloda = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < Mast.values().length; i++) {
            for (int j = 0; j < Value.values().length; j++) {
                coloda.add(index++, new Karta(Mast.values()[i],Value.values()[j]));
            }
        }
    }

    /*private void showAllCards(){
        Collections.shuffle(coloda);//Тасовка
        for (Karta karta: coloda){
            karta.show();
        }
    }
*/
    private void testShow(){
        Karta k;
        Collections.shuffle(coloda);
        for (int i=0;i<coloda.size();i++){
            k = coloda.get(i);
            System.out.print("Index = "+coloda.indexOf(k)+" ");
            k.show();
        }

    }
    private void showCardsTable(){
       // table=new ArrayList<>();
        Karta[]table=new Karta[3];
        int index=0;
        int i=0;
        for(Karta karta:coloda){
                if (i < 3) {
                    System.out.println();
                    table[i] = coloda.get(index++);
                    karta.show();
                    i++;
                }

            }

        }


    private void handOut(){
        //ArrayList<Karta>col1;
        //Karta[]table=new Karta[3];
        Karta[]hand= new Karta[2];
        int index = 0;
        int i;
        for (Player player:players){
            i=0;
            for (Karta karta:coloda) {
                if(i<2){
                    System.out.print(index+" ");
                    hand[i] = coloda.get(index++);
                    //coloda.remove(index);
                    i++;
                }
            }
            //Collections.shuffle(coloda);
            player.setHandKart(hand);
            System.out.println(" ");
            player.showCards();
        }


    }

    }



