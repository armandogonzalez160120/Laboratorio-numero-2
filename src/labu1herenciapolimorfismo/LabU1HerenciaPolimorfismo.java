/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
public class LabU1HerenciaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 24: Declara tres objetos, uno de tipo Movie (movie), 
        // otro Book (book) y otro de tipo Music (music)
        // Recuerda como se especifica el tipo de referencia para que implementes
        // el polimorfismo
        // Ejemplo: Shape bangle = new Circle();
        // para el objeto movie pasa los siguientes valores: "Titanic", "James Cameron", 180
        // para el objeto book los valores: "Java How To Program", "Deitel", 500
        // para el objeto music los valores: "Imagine" "John Lennon", "Rock"
        Media movie1 = new Movie("Titanic", "James Cameron", 180);
        Media book1 = new Book("Java How To Program", "Deitel", 500);
        Media music1 = new Music("Imagine", "John Lennon", "Rock");
        Media radio1 = new Radio("Who do you think you are", "Calibre 50", "98.3 FM");
        
        
        // TODO 25: Crea un objeto de tipo MediaLibrary llamado mediaLibrary
         MediaLibrary  MediaLibrary1 = new  MediaLibrary();
        
        // TODO 26: Ahora llama al método addLibrary del objeto mediaLibrary
        // y asignale cada uno de tus medios
        // ejemplo: mediaLibrary.addItem(movie);
        // agrega todos los otros dos objetos
        MediaLibrary1.addLibrary(movie1);
        MediaLibrary1.addLibrary(book1);
        MediaLibrary1.addLibrary(music1);
        MediaLibrary1.addLibrary(radio1);
        
        
        
        // TODO 27: Ahora llama al método playAllItems del objeto mediaLibrary
        // para poner en play todos tus medios o items
        MediaLibrary1.playAllItems();
        
        // Ejecuta tu programa, la salida debe ser la siguiente:
        // Watching Titanic directed by James Cameron, Duration: 180 minutes
        // Reading Java How To Program by Deitel with 500 pages
        // Listening to Imagine by Jhon Lennon in the Rock genre
        // Si lo lograste ¡¡¡Felicidades!!!
    }
    
}
