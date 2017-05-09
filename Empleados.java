package Personas;

public class Empleados extends Personas{
    private double salario;
    private String fecha_entrada;
    
    public Empleados(double salario,String fecha_entrada){
        
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    public static void main(String[] args){
        Empleados emplead=new Empleados(27.8,"10 de Junio");
    }
}

