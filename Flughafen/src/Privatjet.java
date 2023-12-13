public class Privatjet extends Flugzeug{
    
    public Privatjet(int Reichweite, String Rufzeichen){
        super(Reichweite, Rufzeichen);
    }

    public void Tanken(){
        System.out.println("Tanken mit Kerosin");
    }
}
