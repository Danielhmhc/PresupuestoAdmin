/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Conexionyfunciones {
    //Variables para la conexion con la base
    private String Driver_BD, Url_BD, Usuario_BD, Contrasena_BD;
    private Connection conexion=null;
    private Statement statequieto=null;
    //Constructor que sirve para inicializar variables para cualquier base de datos
    public Conexionyfunciones(String driver, String url, String usuario, String contra){
        Driver_BD=driver;
        Url_BD=url;
        Usuario_BD=usuario;
        Contrasena_BD=contra;
    }
    //Constructor que sirve para inicializar variables para cualquier Base de Datos en MySql
    public Conexionyfunciones(){
        Driver_BD="com.mysql.jdbc.Driver";
        Url_BD="jdbc:mysql://127.0.0.1:3306/dbranking";
        Usuario_BD="root";
        Contrasena_BD="201313";
    }
    //Conexion a la BD
    public void conectar(){
        try {
            Class.forName(Driver_BD).newInstance();
            conexion = DriverManager.getConnection(Url_BD, Usuario_BD, Contrasena_BD);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException err) {
            System.out.println("Error " + err.getMessage());
        }
    }
    //Cerrar la conexion de BD
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
    
    public void obtenerEmpresasreg(JComboBox cmbllenar){
        ResultSet resultado;
        Statement state;
        int cont=0;
        
        try {
            state = conexion.createStatement();
            resultado= state.executeQuery("Select nombreEmpresa from tblempresas");
            
            while(resultado.next()){
                cmbllenar.insertItemAt(resultado.getString("nombreEmpresa"),cont);
                cont++;   
            }
        } catch (SQLException ex) {
            System.out.println("Se obtuvo el error: " + ex.getMessage());
            cmbllenar.insertItemAt("Error al cargar elementos",0);
        }
        
    }
    
    public int obtenerUltimoID(){
        int resultado=0;
        try {
            Statement estado=  conexion.createStatement();
            ResultSet res= estado.executeQuery("select max(idEmpresa) as maximo from tblempresas;");
            res.next();
            resultado= res.getInt("maximo");
        } catch (SQLException ex) {
            System.out.println("Error en la obtencion del ID");
            
        }
        return resultado;
    }
    
    public int insertarEmpresa(int id,String nombreEmpresa,String descripcion){
        int dev=5;
        
        try {
            
            PreparedStatement insertar= conexion.prepareStatement("INSERT INTO tblempresas VALUES (?,?,?)");
            insertar.setInt(1, id);
            insertar.setString(2, nombreEmpresa);
            insertar.setString(3, descripcion);
            dev=insertar.executeUpdate();
            if(dev==1)
                System.out.println("Se inserto correctamente");
            else
                System.out.println("Se tuvo un problema al actualizar");
        } catch (SQLException ex) {
            System.out.println("Error :"+ex.getMessage());
        }
        return dev;
    }
    
    public int insertarIngresos(int idEmpresa, int idPeriodo, float preciovenuni, float ventauni, float ventaef, float cobromes,float cobromespas,float cobro2mespas,float total){
    
        int dev=5;
        
        try {
            
            PreparedStatement insertar= conexion.prepareStatement("insert into empresa_ingresos values(?,?,?,?,?,?,?,?,?);");
            insertar.setInt(1, idEmpresa);
            insertar.setInt(2, idPeriodo);
            insertar.setFloat(3, preciovenuni);
            insertar.setFloat(4,ventauni);
            insertar.setFloat(5,ventaef);
            insertar.setFloat(6,cobromes);
            insertar.setFloat(7,cobromespas);
            insertar.setFloat(8,cobro2mespas);
            insertar.setFloat(9,total) ;
            dev=insertar.executeUpdate();
            if(dev==1)
                System.out.println("Se inserto correctamente");
            else
                System.out.println("Se tuvo un problema al actualizar");
        } catch (SQLException ex) {
            System.out.println("Error :"+ex.getMessage());
        }
        return dev;
    }
    
    public int insertarEgresos(int idEmpresa, int idPeriodo, float costomanouni, float costoadminuni, float costoventasuni, float costomanotot,float iva,float costogastosadm,float costogastosven,float prestamo, float gastosfin,float impuestos,float total){
    
        int dev=5;
        
        try {
            
            PreparedStatement insertar= conexion.prepareStatement("insert into empresa_egresos values(?,?,?,?,?,?,?,?,?,?,?,?,?);");
            insertar.setInt(1, idEmpresa);
            insertar.setInt(2, idPeriodo);
            insertar.setFloat(3, costomanouni);
            insertar.setFloat(4,costoadminuni);
            insertar.setFloat(5,costoventasuni);
            insertar.setFloat(6,costomanotot);
            insertar.setFloat(7,iva);
            insertar.setFloat(8,costogastosadm);
            insertar.setFloat(9,costogastosven) ;
            insertar.setFloat(10,prestamo);
            insertar.setFloat(11,gastosfin);
            insertar.setFloat(12,impuestos);
            insertar.setFloat(13,total);
            dev=insertar.executeUpdate();
            if(dev==1)
                System.out.println("Se inserto correctamente");
            else
                System.out.println("Se tuvo un problema al actualizar");
        } catch (SQLException ex) {
            System.out.println("Error :"+ex.getMessage());
        }
        return dev;
    }
    
    public int insertarFlujo(int idEmpresa, int idPeriodo, float totaling, float totalegr, float flujoneto, float saldoini,float saldofin,float financiamiento){
    
        int dev=5;
        
        try {
            
            PreparedStatement insertar= conexion.prepareStatement("insert into empresa_presupuesto values(?,?,?,?,?,?,?,?);");
            insertar.setInt(1, idEmpresa);
            insertar.setInt(2, idPeriodo);
            insertar.setFloat(3, totaling);
            insertar.setFloat(4,totalegr);
            insertar.setFloat(5,flujoneto);
            insertar.setFloat(6,saldoini);
            insertar.setFloat(7,saldofin);
            insertar.setFloat(8,financiamiento);
            dev=insertar.executeUpdate();
            if(dev==1)
                System.out.println("Se inserto correctamente");
            else
                System.out.println("Se tuvo un problema al actualizar");
        } catch (SQLException ex) {
            System.out.println("Error :"+ex.getMessage());
        }
        return dev;
    }
    
     public int insertarBalance(int idEmpresa, int idPeriodo, float efectivo, float cuentascobrar, float activocirc, float equiporep,float depreciacionac,float totactivosfijos, float totalactivos,float pasivos,float capitalsocial,float utilacu, float totcapital,float pasmascap){
    
        int dev=5;
        
        try {
            
            PreparedStatement insertar= conexion.prepareStatement("insert into empresa_balance values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            insertar.setInt(1, idEmpresa);
            insertar.setInt(2, idPeriodo);
            insertar.setFloat(3, efectivo);
            insertar.setFloat(4,cuentascobrar);
            insertar.setFloat(5,activocirc);
            insertar.setFloat(6,equiporep);
            insertar.setFloat(7,depreciacionac);
            insertar.setFloat(8,totactivosfijos);
            insertar.setFloat(9,totalactivos);
            insertar.setFloat(10,pasivos);
            insertar.setFloat(11,capitalsocial);
            insertar.setFloat(12,utilacu);
            insertar.setFloat(13,totcapital);
            insertar.setFloat(14,pasmascap);
            
            dev=insertar.executeUpdate();
            if(dev==1)
                System.out.println("Se inserto correctamente");
            else
                System.out.println("Se tuvo un problema al actualizar");
        } catch (SQLException ex) {
            System.out.println("Error :"+ex.getMessage());
        }
        return dev;
    }
     
    public int insertarVariables(int idEmpresa, float precioini, float incprecio, float venini, float incven,float cosmano,float incmano, float cosadm,float incadm,float cosven,float inccosven, float pormes,float pormes1,float pormes2,float efeini,float cobini , float rep ,float depini,float decper,float pasini,float capini,float utilac){
    
        int dev=5;
        
        try {
            
            PreparedStatement insertar= conexion.prepareStatement("insert into empresa_variables values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            insertar.setInt(1, idEmpresa);
            insertar.setFloat(2, precioini);
            insertar.setFloat(3, incprecio);
            insertar.setFloat(4,venini);
            insertar.setFloat(5,incven);
            insertar.setFloat(6,cosmano);
            insertar.setFloat(7,incmano);
            insertar.setFloat(8,cosadm);
            insertar.setFloat(9,incadm);
            insertar.setFloat(10,cosven);
            insertar.setFloat(11,inccosven);
            insertar.setFloat(12,pormes);
            insertar.setFloat(13,pormes1);
            insertar.setFloat(14,pormes2);
            insertar.setFloat(15, efeini);
            insertar.setFloat(16, cobini);
            insertar.setFloat(17, rep);
            insertar.setFloat(18,depini);
            insertar.setFloat(19,decper);
            insertar.setFloat(20,pasini);
            insertar.setFloat(21,capini);
            insertar.setFloat(22,utilac);
            
            dev=insertar.executeUpdate();
            if(dev==1)
                System.out.println("Se inserto correctamente");
            else
                System.out.println("Se tuvo un problema al actualizar");
        } catch (SQLException ex) {
            System.out.println("Error :"+ex.getMessage());
        }
        return dev;
    } 
    
    public void datosTabla(int id, DefaultTableModel  tabla,String ntabla){
        try {
            int numerocolumnas,cont=0;
            
            Statement state=  conexion.createStatement();
            String query= "select * from " + ntabla + " where idEmpresa= " + id + " ;";
            ResultSet res= state.executeQuery(query);
            numerocolumnas= res.getMetaData().getColumnCount();
            Object[] contenedor= new Object[numerocolumnas];
            
            while(res.next()){
                for(cont=0;cont<numerocolumnas;cont++){
                    contenedor[cont]=res.getObject(cont+1);
                }
            
            tabla.addRow(contenedor);
            }
        } catch (SQLException ex) {
            System.out.println("Error :" +ex.getMessage());
        }
    
    }
    
    
    
}
