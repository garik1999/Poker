public class Karta {
    private Mast mast;
    private Value value;

    public Karta(Mast mast, Value value){
        this.mast=mast;
        this.value=value;
    }

    public void show(){
        System.out.println("Mast = "+mast.name()+" Value = "+value.name());
    }
}
