public class Zaehler{
    
    int zaehlerstand;
    
    public Zaehler(){  
        
        zaehlerstand = 0;
        
        erhoeheZaehlerstand();
        
        System.out.println(zaehlerstand);
        
        erhoeheZaehlerstand();
        
    }
    
    public void erhoeheZaehlerstand(){
        zaehlerstand += 1;
    }
}
