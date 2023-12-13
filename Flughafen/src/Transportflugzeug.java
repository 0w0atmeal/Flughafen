public class Transportflugzeug extends Flugzeug{
    

    public Transportflugzeug(int Reichweite, String Rufzeichen){
        super(Reichweite, Rufzeichen);
    }

    public void Tanken(){
        System.out.println("Tanken mit Kerosin");
    }
}
