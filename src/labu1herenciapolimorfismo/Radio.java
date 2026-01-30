/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author jorge
 */
public class Radio extends Media{
    private String estacion;
    public Radio(String title, String creator, String estacion) {
        super(title, creator);
        setEstacion(estacion);
    }

    /**
     * @return the estacion
     */
    public String getEstacion() {
        return estacion;
    }

    /**
     * @param estacion the estacion to set
     */
    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    
    
    @Override
    public void play() {
        System.out.println("Listening to " + getTitle() + " by " + getCreator() + " in the " + estacion + " season");
    }
}
