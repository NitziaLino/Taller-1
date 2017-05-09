package Cuentas;

import java.util.Date;

public class Cuentas {
    private int id=0;
    private double saldo=0;
    double retiro=0;
    double deposito=0;
    private double interes_anual;
    private Date fecha_creacion;
    
    public Cuentas() {
    }
     public Cuentas(int i, double sa, double reti, double depo){
        this.id = i;
        this.saldo = sa;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public double getInteres_mensual() {
        double intmen=this.saldo*0.045;
        return intmen;
    }
    
    public double deposito(){
        //this.saldo=this.saldo+deposito;
        double depot=this.saldo+deposito;
        return depot;
    }
    public double retiro(){
        double retro=this.saldo-retiro+deposito;
        return retro;
    }
    public void CuentaBalance(){
        System.out.println("------BALANCE------");
        System.out.println("ID: "+this.getId());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Retiro: "+this.retiro());
        System.out.println("Deposito: "+deposito());
        System.out.println("Interes Mensual: "+this.getInteres_mensual());
        System.out.println("Fecha: "+this.fecha_creacion);
    }
    public static void main (String args[]){
        Cuentas cts=new Cuentas();
        cts.id=1122;
        cts.saldo=20.000;
        cts.retiro=2500;
        cts.deposito=3.000;
     
        cts.CuentaBalance();
        
        
    }

}