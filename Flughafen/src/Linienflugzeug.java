public class Linienflugzeug extends Flugzeug{
    
    public Linienflugzeug(int Reichweite, String Rufzeichen){
        super(Reichweite, Rufzeichen);
    }

    public void Tanken(){
        System.out.println("Tanken mit Kerosin");
    }
}
