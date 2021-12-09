package atm;

public class DefaultTray implements Tray{
    private Tray nextTray = null;
    private int banknote;
    private int banknoteNum = 0;

    public DefaultTray(int banknote){
        this.banknote = banknote;
    }

    @Override
    public void process(int amount) {
        if (nextTray != null){
            banknoteNum = amount / banknote;
            nextTray.process(amount % banknote);
        }else if (amount % banknote > 0){
            throw new IllegalArgumentException();
        }
        System.out.println("You will receive " + banknoteNum + " " + banknote + " banknotes");
    }

    @Override
    public void setNext(Tray tray) {
        nextTray = tray;
    }
}
