package hu.petrik.bankapplication13t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bank {
    private Set<Szamla> szamlak = new HashSet<>();
    private List<Tranzakcio> tranzakciok = new ArrayList<>();

    private String honnan, hova;
    private long osszeg;

    public Bank(String honnan, String hova, long osszeg) {
        this.honnan = honnan;
        this.hova = hova;
        this.osszeg = osszeg;
        boolean hiba=true;
        if(this.honnan.equals(hova)){
            hiba=false;
            System.out.println("honna hova telepules megy egyezik");
        }
        if(this.osszeg<0){
            System.out.println(" pozitiv számokaat kell beirni");
            hiba=false;
        }
        if(hiba){
            utal(honnan, hova, osszeg);
        }
    }

  
    public int getSzamlaCount() {
        return szamlak.size();
    }
    
    public int getTranzakcioCount() {
        return tranzakciok.size();
    }
    
    public List<Tranzakcio> getTranzakciok() {
        return new ArrayList<>(tranzakciok);
    }
    
    public void utal(String honnan, String hova, long osszeg) {
        Szamla forras = null;
        for (Szamla sz: szamlak) {
            if (sz.getSzamlaszam().equals(honnan)) {
                forras = sz;
                break;
            }
        }
        if (forras == null) {
            throw new IllegalArgumentException("Forras szamla nem letezik");
        }
        Szamla cel = null;
        for (Szamla sz: szamlak) {
            if (sz.getSzamlaszam().equals(hova)) {
                cel = sz;
                break;
            }
        }
        if (cel == null) {
            throw new IllegalArgumentException("Cel szamla nem letezik");
        }
        
        // Megvan a ket szamla
        forras.setOsszeg(forras.getOsszeg() - osszeg);
        cel.setOsszeg(cel.getOsszeg() + osszeg);
        
        tranzakciok.add(new Tranzakcio(forras, cel, osszeg));
    }

    public void ujSzamla(Szamla szamla) {
        
        szamlak.add(szamla);
    }
    
    public void ujszamlas(String szamlaszam){
        try {
            Szamla szamla=new Szamla(szamlaszam, osszeg);
            ujSzamla(szamla);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
