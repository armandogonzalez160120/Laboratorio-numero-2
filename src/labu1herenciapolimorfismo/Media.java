/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
public class Media {
    // TODO 1: Crea los campos titulo y autor de tipo String
    // y privados
    private String title;
    private String creator;
    
    // 3.1 Recuerda poner este constructor después de la declaración de los campos.
    public Media(String title, String creator) 
    {
        setTitle(title);
        setCreator(creator);
    }
    
    // TODO 2: Crea los getter y setter para los campos
    /**
     * @return the title
     */
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    
    
    // TODO 3: Crea el constructor para inicializar los campos
    // utiliza los métodos setter para establecer sus valores.
    // Recuerda poner este constructor después de la declaración de los campos.
      
    

    
    // TODO 4: Crea un método llamado play(), público de tipo void
    // este método tiene la siguiente instrucción.
    // System.out.println("Playing: " + title + " by " + creator);
    public void play(){
        System.out.println("Playing: " + title + " by " + creator);
    }
    
    
}
