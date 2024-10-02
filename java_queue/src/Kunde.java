public class Kunde {

    // Variablen
    private int id;
    private String Vorname;
    private double Einkaufspreis;
    private boolean bezahlt;

    // getter/setter
    public int getId(){
        return this.id;
    }
    public String getVorname(){
        return this.Vorname;
    }
    public double getEinkaufspreis(){
        return this.Einkaufspreis;
    }
    public boolean getBezahlt(){
        return this.bezahlt;
    }

    public void setId(int _id){
        this.id = _id;
    }
    public void setVorname(String _Vorname){
        this.Vorname = _Vorname;
    }
    public void setEinkaufspreis(double _Einkaufspreis){
        this.Einkaufspreis = _Einkaufspreis;
    }
    public void setBezahlt(boolean _bezahlt){
        this.bezahlt = _bezahlt;
    }

    // ctor's
    public Kunde(){
        this(0, "Mustermax", 0, false);
    }
    public Kunde (int _id, String _Vorname, double _Preis, boolean _Bezahlt){
        this.setId(_id);
        this.setBezahlt(_Bezahlt);
        this.setVorname(_Vorname);
        this.setEinkaufspreis(_Preis);
    }

    // toString

    public String toString(){
        return this.id + " " + this.Vorname + " " + this.Einkaufspreis + " " + this.bezahlt;
    }

}
