
package guia6ejecomperativoironman;


public class Armadura {
  protected String colorPrimario;
    protected String colorSecundario;
    protected int nivelResistencia;
    protected int nivelSalud;
    protected float nivelEnergia;
    protected Generador generador;
    protected Casco casco;
    protected Bota botas;
    protected Guante guantes;
    

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, Generador generador, Casco casco, Bota botas, Guante guantes) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.generador = generador;
        this.casco = casco;
        this.botas = botas;
        this.guantes = guantes;
        this.nivelEnergia= Float.MAX_VALUE;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public float getEnergia() {
        return nivelEnergia;
    }

    public void setEnergia(int energia) {
        this.nivelEnergia = energia;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Bota getBotas() {
        return botas;
    }

    public void setBotas(Bota botas) {
        this.botas = botas;
    }

    public Guante getGuantes() {
        return guantes;
    }

    public void setGuantes(Guante guantes) {
        this.guantes = guantes;
    }


   
    public void caminar(){
        
    
    }
 
    public void consumoDeEnergia() {
        
        

    }
    
    
}
