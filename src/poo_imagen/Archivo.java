package poo_imagen;

public class Archivo {

    String nombre, extension, ubicacion;
    boolean color;

    public Archivo() {
        this.nombre = "";
        this.extension = "JPG";
        this.color = true;
        this.ubicacion="C:/fotos";
        System.out.println("Creando archivo");
    }
    public Archivo(String nombre){
        this();
        this.nombre=nombre;
    }
    public Archivo(String nombre, boolean color){
        this(nombre);
        this.color=color;
    }
    public Archivo(String nombre, boolean color, String extension){
        this(nombre,color);
        //toUpperCase pasa a mayuscula el dato
        this.extension=extension.toUpperCase();
    }
    public void mostrarInfo(){
        System.out.println("Nombre "+nombre+" Extensión "+extension);
        System.out.println("Ubicacion "+ubicacion+" Color "+color);
    }
}
