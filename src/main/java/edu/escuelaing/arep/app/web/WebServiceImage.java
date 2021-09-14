package edu.escuelaing.arep.app.web;
import edu.escuelaing.arep.app.anotaciones.Web;

public class WebServiceImage {
	/**
     * Metodo que se encarga de ejecutar la anotacion @Web y retornar el contenido de la pagina HTML en el recurso /fondodepantalla.html.
     * @return Retorna un fondo de pantalla en formato HTML.
     */
    @Web("/fondodepantalla.html")
    public static String showImage() {
        return "<html><title>Fondo de Pantalla</title><body><img src=\"/Wallpaper.jpg\" width=\"1900\" height=\"950\"></body></html>";
    }
}