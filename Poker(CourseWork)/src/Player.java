import java.util.ArrayList;

public class Player {
    private String fio;
    private int money;
    private Karta[] handKart;

    public Player(String fio, int money, Karta[] handKart){
        this.fio = fio;
        this.money = money;
        this.handKart = handKart;
    }

    public void showCards(){
        System.out.println("Имя: "+fio+"Баланс: "+money);
        for (Karta karta:handKart) karta.show();
    }

    public String getFio() {

        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getMoney() {

        return money;
    }

    public void setMoney(int money) {

        this.money = money;
    }

    public Karta[] getHandKart() {

        return handKart;
    }

    public void setHandKart(Karta[] handKart) {

        this.handKart = handKart;
    }
}
