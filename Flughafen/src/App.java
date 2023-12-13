import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Flughafen f1 = new Flughafen("HAM");

        Helikopter h1 = new Helikopter(800, "NC13LH");
        Linienflugzeug l1 = new Linienflugzeug(5000, "LH24DC");
        Privatjet p1 = new Privatjet(2000, "AB12CD");
        Transportflugzeug t1 = new Transportflugzeug(6000, "EF12GH");

        ArrayList<Flugzeug> flugzeuge = new ArrayList<>();
        flugzeuge.add(h1);
        flugzeuge.add(l1);
        flugzeuge.add(p1);
        flugzeuge.add(t1);
    
        for(Flugzeug flugzeug : flugzeuge){
            flugzeug.Tanken();
        }
    }
}
