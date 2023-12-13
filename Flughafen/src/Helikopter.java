public class Helikopter extends Flugzeug{
    
    public Helikopter(int Reichweite, String Rufzeichen){
        super(Reichweite, Rufzeichen);
    }

    public void Tanken(){
        System.out.println("Tanken mit Avgas");
    }
}
