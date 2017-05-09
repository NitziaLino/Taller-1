package ObjetosGeometricos;

public class ObjetosGeometricos{

    public static void main(String args[]){
        triangulos tr1 = new triangulos(1,1.5,1);
        tr1.getArea();
        System.out.println("El Area es= "+tr1.getArea());
        tr1.getPerimetro();
        System.out.println("El Perimetro es= "+tr1.getPerimetro());
    }
}