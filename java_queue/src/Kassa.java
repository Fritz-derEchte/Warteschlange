import java.util.LinkedList;
import java.util.Queue;

public class Kassa {
    private int id;
    private Queue<Kunde> warteschlange = new LinkedList<>();

    /*
    public Queue<Kunde> getWarteschlange() {
        return warteschlange;
    }

    public void setWarteschlange(Queue warteschlange) {
        this.warteschlange = warteschlange;
    }
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kassa(){
        this(0);
    }
    public Kassa(int id){
        setId(id);
    }
    // add/remove customer
    public void addCustomer(Kunde k){
        warteschlange.add(k);
    }
    public void removeCustomer(){
        warteschlange.poll();
    }
    public int sizeWarteschlange(){
        return warteschlange.size();
    }
    public double getEinkaufspreis(){
        return warteschlange.peek().getEinkaufspreis();
    }
    public String getName(){
        return warteschlange.peek().getVorname();
    }


}
