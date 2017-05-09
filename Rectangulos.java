package Rectangulos;
public class Rectangulos {
    public static double ancho;
    public static double altura;
    public Rectangulos(){
        this.ancho=1;
        this.altura=1;
    }
    public Rectangulos(double anc,double alt){
        this.ancho=anc;
        this.altura=alt;
    }    
    public static double getArea(double anc,double alt){
        return anc*alt;
    }
    public static double getPerimetro(double anc,double alt) {
        return (2*anc)*(2*alt);
    }
    public static void main(String args[]){
        Rectangulos rec=new Rectangulos(4,40);
        System.out.println("Rectangulo 1");
        System.out.println("Su ancho es: "+ancho);
        System.out.println("Su altura es: "+altura);
        System.out.println("Area: "+getArea(ancho,altura));
        System.out.println("Perimetro: "+getPerimetro(ancho,altura));
        
        Rectangulos rect=new Rectangulos(3.5,35.9);
        
        System.out.println("Rectangulo 2");
        System.out.println("Su ancho es: "+ancho);
        System.out.println("Su altura es: "+altura);
        System.out.println("Area: "+getArea(ancho,altura));
        System.out.println("Perimetro: "+getPerimetro(ancho,altura));
       
    }
}
 
