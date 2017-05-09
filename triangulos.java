package ObjetosGeometricos;
public class triangulos extends ObjetosGeometricos {
    public static double Ar;
    public static double Per;
    public static double lado1;
    public static double lado2;
    public static double lado3;
    
    public triangulos () {
        
    }
    public triangulos ( double la1,double la2, double la3){
        this.lado1=la1;
        this.lado2=la2;
        this.lado3=la3;     
    }
    public double getlado1(){
        return lado1;
    }
    public double getlado2(){
        return lado2;
    }
    public double getlado3(){
        return lado3;
    }
    public void setlado1(double lado1){
        this.lado1=lado1;
    }
    public void setlado2(double lado2){
        this.lado2=lado2;
    } 
    public void setlado3(double lado3){
        this.lado3=lado3;
    }
    public double getArea( ){
        return Ar=this.lado1*this.lado2/2;
        
    }
    public double getPerimetro( ){
        return Per=this.lado1+this.lado2+this.lado3;
    }
    
}

