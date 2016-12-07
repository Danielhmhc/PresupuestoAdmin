
package presupuestoefectivo;

import base.Conexionyfunciones;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class VentanaRegistroEmp extends JFrame implements ActionListener {
    
    private JLabel lblempresa,lbldesempresa,lblprecioini,lblporincprecio,lblventasini,lblporventas,lblcosmanouni;
    private JLabel lblporinccostom,lblcostoadmin,lblporinccostoadmin,lblcostovenuni,lblporinccostoven,lblporcobromes,lblporcobrosegmes,lblporcobrotermes;
    private JLabel lblefectivo,lblcuentascob,lblequiporep,lbldepreciacionini,lbldepper,lblpasivototal,lblcapitalsocial,lblutilidadacu;
    private JPanel panelcampos;
    private JTextField campo1,campo2,campo3,campo4,campo5,campo6,campo7,campo8,campo9,campo10,campo11,campo12,campo13,campo14,campo15,campo16,campo17,campo18,campo19,campo20,campo21,campo22,campo23;
    private JButton btnvalidar,btnprocesar;
    private JLabel idasignado;
    
    public VentanaRegistroEmp(){
        //Inicializamos las etiquetas
        lblempresa = new JLabel("Nombre Empresa :");
        lbldesempresa = new JLabel("Descripcion Empresa :");
        lblprecioini = new JLabel("Precio inicial producto :");
        lblporincprecio = new JLabel("<html>Incremento % de <br> precio (periodo) </html>:");
        lblventasini = new JLabel("<html>Ventas en unidades </br> al primer periodo:</html>");
        lblporventas = new JLabel("<html>Incremento porcentual en </br> unidades vendidas (periodo)</html>");
        
        lblcosmanouni = new JLabel("<html>Costo mano de obra </br> (por unidad):</html>");
        lblporinccostom = new JLabel("<html>Incremento porcentual de </br> mano de obra (periodo):</html>");
        lblcostoadmin = new JLabel("<html>Costo de administracion </br> (por unidad): </html>");
        lblporinccostoadmin = new JLabel("<html>Incremento porcentual de </br administracion (periodo):</html>");
        lblcostovenuni = new JLabel("<html>Costo de ventas </br> (por unidad):</html> ");
        lblporinccostoven = new JLabel("<html>Incremento porcentual de </br> ventas (periodo):</html>");
        
        lblporcobromes = new JLabel("<html>Porcentaje cobro al</br> periodo actual:</html>");
        lblporcobrosegmes = new JLabel("<html>Porcentaje cobro al </br> siguiente perido:</html>");
        lblporcobrotermes= new JLabel("<html>Porcentaje cobro dentro </br> de dos periodos:</html>");
        
        lblefectivo = new JLabel("<html> Cuenta efectivo</html>");
        lblcuentascob= new JLabel("<html>Cuentas por cobrar</html>");
        lblequiporep= new JLabel("Cuenta equipo reparto");
        lbldepreciacionini= new JLabel("Depreciacion acumulada en equipo");
        lbldepper = new JLabel("Cantidad depreciada por periodo");
        lblpasivototal= new JLabel("Pasivo total");
        lblcapitalsocial= new JLabel("Capital Social");
        lblutilidadacu= new JLabel("<html>Utilidad acumulada <br>(para perdida poner negativo)</html>");
        
        idasignado=new JLabel();
        
        panelcampos= new JPanel(new GridLayout(8,4));
        
        panelcampos.add(lblempresa);
        campo1= new JTextField("El chavo");
        panelcampos.add(campo1);
        
        panelcampos.add(lbldesempresa);
        campo2= new JTextField("Vendemos tortas");
        panelcampos.add(campo2);
        
        panelcampos.add(lblprecioini);
        campo3= new JTextField("10");
        panelcampos.add(campo3);
        
        panelcampos.add(lblporincprecio);
        campo4= new JTextField();
        panelcampos.add(campo4);
        
        panelcampos.add(lblventasini);
        campo5= new JTextField("50000");
        panelcampos.add(campo5);
        
        panelcampos.add(lblporventas);
        campo6= new JTextField();
        panelcampos.add(campo6);
        
        panelcampos.add(lblcosmanouni);
        campo7= new JTextField("3");
        panelcampos.add(campo7);
        
        panelcampos.add(lblporinccostom);
        campo8= new JTextField();
        panelcampos.add(campo8);
        
        panelcampos.add(lblcostoadmin);
        campo9= new JTextField("3");
        panelcampos.add(campo9);
        
        panelcampos.add(lblporinccostoadmin);
        campo10= new JTextField();
        panelcampos.add(campo10);
        
        panelcampos.add(lblcostovenuni);
        campo11= new JTextField("2");
        panelcampos.add(campo11);
        
        panelcampos.add(lblporinccostoven);
        campo12= new JTextField();
        panelcampos.add(campo12);
        
        panelcampos.add(lblporcobromes);
        campo13= new JTextField("40");
        panelcampos.add(campo13);
        
        panelcampos.add(lblporcobrosegmes);
        campo14= new JTextField("60");
        panelcampos.add(campo14);
        
        panelcampos.add(lblporcobrotermes);
        campo15= new JTextField();
        panelcampos.add(campo15);
        
        panelcampos.add(lblefectivo);
        campo16= new JTextField("90000");
        panelcampos.add(campo16);
        
        panelcampos.add(lblcuentascob);
        campo17= new JTextField("360000");
        panelcampos.add(campo17);
        
        panelcampos.add(lblequiporep);
        campo18= new JTextField("100000");
        panelcampos.add(campo18);
        
        panelcampos.add(lbldepreciacionini);
        campo19= new JTextField("0");
        panelcampos.add(campo19);
        
        panelcampos.add(lbldepper);
        campo20= new JTextField("1500");
        panelcampos.add(campo20);
        
        panelcampos.add(lblpasivototal);
        campo21= new JTextField("50000");
        panelcampos.add(campo21);
        
        panelcampos.add(lblcapitalsocial);
        campo22= new JTextField("500000");
        panelcampos.add(campo22);
        
        panelcampos.add(lblutilidadacu);
        campo23= new JTextField("0");
        panelcampos.add(campo23);
        
        
        btnvalidar= new JButton("Procesar datos");
        btnvalidar.addActionListener(this);
       // btnprocesar= new JButton("Procesar datos");
       // btnprocesar.addActionListener(this);
        panelcampos.add(btnvalidar);
        panelcampos.add(idasignado);
        //panelcampos.add(btnprocesar);
        
        
        add(panelcampos,BorderLayout.CENTER);
        setSize(700,600);
        setVisible(true);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnvalidar){
            
            String nomEmpresa,desEmpresa;
            float incprecio,incventas,inccostom,inccostoadmin,inccostoven,cobromes,cobromes1,cobromes2;
            double precioini,precioperiodo = 0,ventasunidini,ventasuniper = 0,ventaefectivo,costomanouni,costomanouniper = 0,costomanoper,costoadminuni,costoadminuniper = 0,costoadminper,costoventauni,costoventauniper = 0,costoventaper;
            double efectivoini,efectivoper = 0,cuentascobrar,cuentascobrarper = 0,equiporep,depreciacionini,depreciacioncons,depreciacionper = 0,pasivoini,pasivop = 0,capini,utilini,utilper = 0,cobromesper,cobromes1per,cobromes2per,toting,totegr,iva,gastosfinp,impuestosp = 0,flujoneto,saldoinicaja;
            double cobmes2[] = { 0.0, 0.0, 0.0 ,0.0};
            double c1mes,c2mes;
            double financiamiento = 0;
            double activocir=0;
            double activosfijos=0;
            double totalactivos=0;
            double pasivomascapital=0;
            if(campo1.getText().length()==0 || campo2.getText().length()==0|| campo3.getText().length()==0 || campo5.getText().length()==0||campo7.getText().length()==0 || campo9.getText().length()==0|| campo11.getText().length()==0 || campo13.getText().length()==0 || campo16.getText().length()==0 || campo17.getText().length()==0 || campo18.getText().length()==0 || campo19.getText().length()==0 || campo20.getText().length()==0 || campo21.getText().length()==0 || campo22.getText().length()==0 || campo23.getText().length()==0){
                setTitle("Uno de los campos necesarios esta vacio ");
            }
            else{
                nomEmpresa= campo1.getText();
                desEmpresa=campo2.getText();
                precioini=Float.parseFloat(campo3.getText());
                ventasunidini= Float.parseFloat(campo5.getText());
                costomanouni= Float.parseFloat(campo7.getText());
                costoadminuni=Float.parseFloat(campo9.getText());
                costoventauni=Float.parseFloat(campo11.getText());
                efectivoini=Float.parseFloat(campo16.getText());
                cuentascobrar=Float.parseFloat(campo17.getText());
                equiporep=Float.parseFloat(campo18.getText());
                depreciacionini=Float.parseFloat(campo19.getText());
                depreciacioncons=Float.parseFloat(campo20.getText());
                pasivoini=Float.parseFloat(campo21.getText());
                capini=Float.parseFloat(campo22.getText());
                utilini=Float.parseFloat(campo23.getText());
                
                if(campo4.getText().length()==0)
                    incprecio= 0.0f;
                else
                    incprecio= (Float.parseFloat(campo4.getText())/100);
                if(campo6.getText().length()==0)
                    incventas=0.0f;
                else
                    incventas= (Float.parseFloat(campo6.getText())/100);
                if(campo8.getText().length()==0)
                    inccostom= 0.0f;
                else
                    inccostom=(Float.parseFloat(campo8.getText())/100);
                if(campo10.getText().length()==0)
                    inccostoadmin=0.0f;
                else
                    inccostoadmin=(Float.parseFloat(campo10.getText())/100);
                if(campo12.getText().length()==0)
                    inccostoven=0.0f;
                else
                    inccostoven=(Float.parseFloat(campo12.getText())/100);
                
                cobromes=(Float.parseFloat(campo13.getText()))/100;
                
                if(campo14.getText().length()==0)
                    cobromes1=0.0f;
                else
                    cobromes1=(Float.parseFloat(campo14.getText())/100);
                
                if(campo15.getText().length()==0)
                    cobromes2=0.0f;
                else
                    cobromes2=(Float.parseFloat(campo15.getText())/100);
                
                
                if((cobromes+cobromes1+cobromes2)!= 1)
                    setTitle("Porcentajes erroneos en los cobros de los meses");
                
                else{
                    //Procesar informacion
                    int id=10,ver=5,cont;
                    
                    //Insertar en tabla empresa
                    
                    System.out.println("Los datos son validos");
                    Conexionyfunciones obj= new Conexionyfunciones();
                    obj.conectar();
                    id=obj.obtenerUltimoID();
                    
                    System.out.printf("Id recuperado:"+id);
                    id++;
                    ver=obj.insertarEmpresa(id, nomEmpresa, desEmpresa);
                    idasignado.setText("<html>La empresa se <br> registro con <br> el id " + id + "</html>");
           
                    System.out.println("Empresa registrada correctamente"); 
                    
                    //Procesado de informacion de cada tabla
                    
                    //Insertar variables inicio
                     // NO NECESARIO AHORA
                    
                    for(cont=0;cont<6;cont++){
                        
                        if(cont==0){
                           
                            //Datos para tabla ingresos
                            precioperiodo=precioini;
                            ventasuniper=ventasunidini;
                            ventaefectivo=precioperiodo*ventasuniper;
                           
                            ventaefectivo=redondearDecimales(ventaefectivo,3);
                            cobromesper= ventaefectivo*cobromes;
                            System.out.println("cobro mes sin rend con ventas y % " + cobromesper + " "+cobromes + " "+ ventaefectivo);
                            cobromesper= redondearDecimales(cobromesper,2);
                            cobromes1per=cuentascobrar;
                            cobromes2per=0;
                            cobmes2[cont]=ventaefectivo*cobromes2;
                            toting=cobromesper+cobromes1per+cobromes2per;
                            
                            System.out.println("Datos ingresos empresa "+id+" periodo "+(cont+1)+" precio "+precioperiodo+" unidadesvend "+ventasuniper+" ventaefectivo " + ventaefectivo+ " cobrodelmes "+cobromesper+" cobro sig mes " + cobromes1per + "cobro seg mes" + cobromes2per + "Total ing"+toting);
                            //Datos para tabla egresos
                            costomanouniper=costomanouni;
                            costoadminuniper=costoadminuni;
                            costoventauniper=costoventauni;
                            costomanoper=costomanouniper*ventasuniper;
                            costomanoper=redondearDecimales(costomanoper,3);
                            iva=(float) (ventaefectivo - (ventaefectivo/1.16));
                            iva=redondearDecimales(iva,3);
                            costoadminper=costoadminuniper*ventasuniper;
                            costoadminper=redondearDecimales(costoadminper,3);
                            costoventaper=costoventauniper*ventasuniper;
                            costoventaper=redondearDecimales(costoventaper,2);
                            pasivop=pasivoini;
                            gastosfinp=(float) (pasivop*0.02);
                            impuestosp=0;
                            totegr=costomanoper+iva+costoadminper+costoventaper+pasivop+gastosfinp+impuestosp;
                            
                            System.out.println("Datos para egresos: "+id + "periodo " + (cont+1) +"costounidad mano " + costomanouniper+ " costo admin uni " + costoadminuniper+" costo ventas uni "+ costoventauniper + " costo mano total " + costomanoper + "iva " + iva+  " gasto total admin " + costoadminper + " gasto total ven " + costoventaper + "prestamo " + pasivop + " gastos fin" + gastosfinp + " impuestos" + impuestosp + "Total egresos" + totegr );
                            
                            //Flujo neto
                       
                            flujoneto=toting-totegr;
                            saldoinicaja=efectivoini;
                            efectivoper=saldoinicaja+flujoneto;
                            efectivoper=redondearDecimales(efectivoper,2);
                            if(efectivoper<0){
                                pasivop= efectivoper*-1;
                                financiamiento=pasivop;
                                efectivoper=0;
                            }
                            else{
                                pasivop=0;
                                financiamiento=0;
                            }
                            
                            System.out.println("Datos del flujo neto" + id + " periodo" + (cont+1) +" total ing" + toting +" total egr " + totegr + "  flujo neto " + flujoneto + " saldi ini" + saldoinicaja + " saldofinal " +efectivoper +" financamiento " + financiamiento );
                            //Variables de finanzas (estado  resultados como balance)
                            double ventasnetas=ventaefectivo - iva;
                            double utilidadBruta=ventasnetas-costomanoper;
                            double utilidadenOp=utilidadBruta -gastosfinp -costoadminper - costoventaper - depreciacioncons;
                            double utilidadejercicio=utilidadenOp-impuestosp;
                            utilidadejercicio=redondearDecimales(utilidadejercicio,3);
                            
                            //balance
                            
                            c1mes=(ventaefectivo*cobromes1);
                            c1mes=redondearDecimales(c1mes,1);
                            c2mes=(ventaefectivo*cobromes2);
                            c2mes=redondearDecimales(c2mes,1);
                            cuentascobrarper= c1mes + c2mes;
                            activocir=efectivoper+cuentascobrarper;
                            depreciacionper=depreciacionini + depreciacioncons;
                            activosfijos=equiporep-depreciacionper;
                            totalactivos=activocir+activosfijos;
                            utilper = utilini + utilidadejercicio;
                            pasivomascapital=pasivop+capini+utilper;
                            pasivomascapital=redondearDecimales(pasivomascapital,2);
                            totalactivos=redondearDecimales(totalactivos,3);
                            
                            
                           System.out.println("Dato del balance: id " + id + " Periodo " +  (cont+1) + " efectivo " + efectivoper + " cuentas_cobrar" + cuentascobrarper+ " activocirtotal " + activocir + " equipo de reparto" + equiporep + " depreciacionacu " + depreciacionper + " total activos fijos " + activosfijos + "Total activos:" + totalactivos + " Pasivos " + pasivop + "capital social " + capini + "utilidad acumulada " + utilper + "Comprobacion pasivo mas cap" + pasivomascapital );
                        }
                        
                        else{
                              //Datos para tabla ingresos
                            precioperiodo= precioperiodo * (1 + incprecio);
                            precioperiodo=redondearDecimales(precioperiodo,7);
                            ventasuniper= ventasuniper * (1 + incventas);
                            ventasuniper=redondearDecimales(ventasuniper,7);
                            ventaefectivo=precioperiodo*ventasuniper;
                            ventaefectivo=redondearDecimales(ventaefectivo,3);
                            cobromesper= ventaefectivo*cobromes;
                            cobromesper=redondearDecimales(cobromesper,1);
                             System.out.println("cobro mes sin rend con ventas y % " + cobromesper + " "+cobromes + " "+ ventaefectivo);
                            
                            if(cobromes2==0)
                                cobromes1per=cuentascobrarper;
                            else
                                cobromes1per=cuentascobrarper*cobromes1;
                            
                            cobromes1per=redondearDecimales(cobromes1per,2);
                            if(cont<4){
                                cobmes2[cont]=ventaefectivo*cobromes2;
                                cobmes2[cont]=redondearDecimales(cobmes2[cont],3);
                            }
     
                            if(cont<2)
                                cobromes2per=0;
                            else
                                cobromes2per= cobmes2[cont-2];
                            toting=cobromesper+cobromes1per+cobromes2per;
                            toting=redondearDecimales(toting,3);
                            
                            System.out.println("Datos ingresos empresa "+id+" periodo "+(cont+1)+" precio "+precioperiodo+" unidadesvend "+ventasuniper+" ventaefectivo " + ventaefectivo+ " cobrodelmes "+cobromesper+" cobro sig mes " + cobromes1per + "cobro seg mes" + cobromes2per + "Total ing"+toting);
                           
                            //Datos para tabla egresos
                            costomanouniper=costomanouniper * (1+ inccostom);
                            costomanouniper=redondearDecimales(costomanouniper,8);
                            costoadminuniper=costoadminuniper * (1 + inccostoadmin);
                            costoadminuniper=redondearDecimales(costoadminuniper,8);
                            costoventauniper=costoventauniper * (1 + inccostoven);
                            costoventauniper=redondearDecimales(costoventauniper,8);
                            costomanoper=costomanouniper*ventasuniper;
                            costomanoper=redondearDecimales(costomanoper,3);
                            iva=(float) (ventaefectivo - (ventaefectivo/1.16));
                            iva=redondearDecimales(iva,3);
                            costoadminper=costoadminuniper*ventasuniper;
                            costoadminper=redondearDecimales(costoadminper,3);
                            costoventaper=costoventauniper*ventasuniper;
                            costoventaper=redondearDecimales(costoventaper,2);
                            pasivop=pasivop;
                            gastosfinp=(float) (pasivop*0.02);
                            gastosfinp=redondearDecimales(gastosfinp,3);
                            
                             //Variables de resultados, (necesario para impuesto)
                            double ventasnetas=ventaefectivo - iva;
                            double utilidadBruta=ventasnetas-costomanoper;
                            utilidadBruta=redondearDecimales(utilidadBruta,2);
                            double utilidadenOp=utilidadBruta -gastosfinp -costoadminper - costoventaper - depreciacioncons;
                            utilidadenOp=redondearDecimales(utilidadenOp,2);
                            System.out.println("Utilidades: Bruta" + utilidadBruta+ " en Oeracion" + utilidadenOp );
                            
                            if(cont<2)
                                 impuestosp=0;
                            else{
                                if(utilidadenOp>1 && utilidadenOp<=1000)
                                    impuestosp= (utilidadenOp*0.05);
                                if(utilidadenOp>1000 && utilidadenOp<=5000)
                                    impuestosp=(utilidadenOp*0.1);
                                if(utilidadenOp>5000 && utilidadenOp<=10000)
                                    impuestosp=(utilidadenOp*0.15);
                                if(utilidadenOp>10000 && utilidadenOp<=50000)
                                    impuestosp=(utilidadenOp*0.2);
                                if(utilidadenOp>50000 )
                                    impuestosp= (utilidadenOp*0.25);
                            }
                            
                            impuestosp=redondearDecimales(impuestosp,3);
                            double utilidadejercicio=utilidadenOp-impuestosp;
                            totegr=costomanoper+iva+costoadminper+costoventaper+pasivop+gastosfinp+impuestosp;
                            totegr=redondearDecimales(totegr,3);
                            System.out.println("Datos para egresos: "+id + "periodo " + (cont+1) +"costounidad mano " + costomanouniper+ " costo admin uni " + costoadminuniper+" costo ventas uni "+ costoventauniper + " costo mano total " + costomanoper + "iva " + iva+  " gasto total admin " + costoadminper + " gasto total ven " + costoventaper + "prestamo " + pasivop + " gastos fin" + gastosfinp + " impuestos" + impuestosp + "Total egresos" + totegr );
                            
                             //Flujo neto
                            
                            flujoneto=toting-totegr;
                            saldoinicaja=efectivoper;
                            efectivoper=saldoinicaja+flujoneto;
                            efectivoper=redondearDecimales(efectivoper,2);
                            if(efectivoper<0){
                                pasivop= efectivoper*-1;
                                financiamiento=pasivop;
                                efectivoper=0;
                            }
                            else{
                                pasivop=0;
                                financiamiento=0;
                            }
                            
                            System.out.println("Datos del flujo neto" + id + " periodo" + (cont+1) +" total ing" + toting +" total egr " + totegr + "  flujo neto " + flujoneto + " saldi ini" + saldoinicaja + " saldofinal " +efectivoper +" financamiento " + financiamiento );
                            //balance
                            
                            
                            c1mes=(ventaefectivo*cobromes1);
                            c1mes=redondearDecimales(c1mes,3);
                            c2mes=(ventaefectivo*cobromes2);
                            c2mes=redondearDecimales(c2mes,3);
                            cuentascobrarper= c1mes + c2mes;
                            cuentascobrarper=redondearDecimales(cuentascobrarper,2);
                            activocir=efectivoper+cuentascobrarper;
                            activocir=redondearDecimales(activocir,2);
                            depreciacionper=depreciacionper + depreciacioncons;
                            activosfijos=equiporep-depreciacionper;
                            totalactivos=activocir+activosfijos;
                            totalactivos=redondearDecimales(totalactivos,1);
                            utilper = utilper + utilidadejercicio;
                            utilper=redondearDecimales(utilper,2);
                            pasivomascapital=pasivop+capini+utilper;
                            pasivomascapital=redondearDecimales(pasivomascapital,2);
                            
                           System.out.println("Dato del balance: id " + id + " Periodo " +  (cont+1) + " efectivo " + efectivoper + " cuentas_cobrar" + cuentascobrarper+ " activocirtotal " + activocir + " equipo de reparto" + equiporep + " depreciacionacu " + depreciacionper + " total activos fijos " + activosfijos + "Total activos:" + totalactivos + " Pasivos " + pasivop + "capital social " + capini + "utilidad acumulada " + utilper + "Comprobacion pasivo mas cap" + pasivomascapital );
                        
                        
                        }
                        
                        //Insertar ingresos
                        
                   
                        ver=obj.insertarIngresos(id, cont+1, (float)precioperiodo,(float) ventasuniper, (float)ventaefectivo,(float) cobromesper,(float) cobromes1per,(float) cobromes2per,(float) toting);
                        
                        if(ver==1)
                            System.out.println(); 
                        
                        //Insertar egresos
                        
                        ver=obj.insertarEgresos(id, cont+1, (float)costomanouniper,(float) costoadminuniper, (float)costoventauniper,(float) costomanoper,(float) iva,(float)costoadminper ,(float) costoventaper,(float)pasivop,(float)gastosfinp,(float)impuestosp,(float)totegr );
                        
                        if(ver==1)
                            System.out.println();
                       
                        
                        //Insertar presupuesto
                        
           
                        ver=obj.insertarFlujo(id, cont+1, (float)toting,(float) totegr, (float)flujoneto,(float) saldoinicaja,(float) efectivoper,(float)financiamiento );
                        
                        if(ver==1)
                            System.out.println(); 
                        
                        //Insertar Balance
                        
         
                        ver=obj.insertarBalance(id, cont+1, (float)efectivoper,(float) cuentascobrarper, (float)activocir,(float) equiporep,(float) depreciacionper,(float)activosfijos,(float)totalactivos,(float)pasivop,(float)capini,(float)utilper,(float)(capini+utilper),(float)pasivomascapital);
                        
                        if(ver==1)
                            System.out.println(); 
                    
                    }
                    
                    
                    
                    
                      
                    
                }
            }
        }
    }
    
     public static double redondearDecimales(double numero, int digitos) {
       double resultado;
        resultado = numero * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado/Math.pow(10, digitos);
        return resultado;
    }
    
}
