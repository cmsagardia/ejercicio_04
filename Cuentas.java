/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cuentas {
    
    public Cuentas(String tit, double cant){
        
        titular=tit;
        cantidad=cant;
    }
    
    public Cuentas (String tit){
        
        titular=tit;
    }
    
    //set
    public void setTitular(String tit){
        
        this.titular=tit;
    }
    
    public void ingresar(double cant){
        
        if(cant>0)
        this.cantidad=cant;
    }
    
    //get
    public String getTitular(){
        
        return titular;
    }
    
    public double getCantidad(double cantidad){
        
        return cantidad;
    }
    
    String retirar(double retiro){
        
        double res=cantidad-retiro;
        if(res>0){
            return "Su saldo es: "+res;
            }
        else{
            this.cantidad=0;
            return "Su cantodad es: "+cantidad;
            }
        
    }

    @Override
    public String toString() {
        return "Cuentas{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
    
    private String titular;
    private double cantidad;
}
