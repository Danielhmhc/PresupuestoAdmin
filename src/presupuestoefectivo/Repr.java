/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presupuestoefectivo;

/**
 *
 * @author Daniel
 */
public class Repr {
    float Efectivo,cuentas,totalcir,equipo,depreciacion,totalfijo,totalact;
    float Prestamo,capital,utilidad;
    double Totalcap,pasmascap;
    
    public Repr(float e,float c, float tc, float eq,float d,float tf, float tact,float p, float cap,float u, double tcap,double pmc){
    
        Efectivo=e;
        cuentas=c;
        totalcir=tc;
        equipo=eq;
        depreciacion=d;
        totalfijo=tf;
        totalact=tact;
        Prestamo=p;
        capital=cap;
        utilidad=u;
        Totalcap=tcap;
        pasmascap=pmc;
    }
}
