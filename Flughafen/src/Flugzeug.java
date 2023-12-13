public abstract class Flugzeug {
    
    int Reichweite;
    String Rufzeichen;

    public Flugzeug(int Reichweite, String Rufzeichen){
        setReichweite(Reichweite);
        setRufzeichen(Rufzeichen);
    }

    public void setReichweite(int reichweite) {
        Reichweite = reichweite;
    }
    public int getReichweite() {
        return Reichweite;
    }
    public void setRufzeichen(String rufzeichen) {
        Rufzeichen = rufzeichen;
    }
    public String getRufzeichen() {
        return Rufzeichen;
    }

    public abstract void Tanken();

}
