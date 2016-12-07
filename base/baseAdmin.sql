CREATE DATABASE  IF NOT EXISTS `dbranking` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `dbranking`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: dbranking
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ctgpuntodeequilibrio`
--

DROP TABLE IF EXISTS `ctgpuntodeequilibrio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ctgpuntodeequilibrio` (
  `idPuntoEquilibrio` int(11) NOT NULL,
  `tipoPuntoEquilibrio` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPuntoEquilibrio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctgpuntodeequilibrio`
--

LOCK TABLES `ctgpuntodeequilibrio` WRITE;
/*!40000 ALTER TABLE `ctgpuntodeequilibrio` DISABLE KEYS */;
/*!40000 ALTER TABLE `ctgpuntodeequilibrio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblarticulos`
--

DROP TABLE IF EXISTS `tblarticulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblarticulos` (
  `idArticulo` int(11) NOT NULL,
  `idEmpresa` int(11) DEFAULT NULL,
  `precioVenta` varchar(45) DEFAULT NULL,
  `costoVariable` varchar(45) DEFAULT NULL,
  `nombreProducto` varchar(45) DEFAULT NULL,
  `produccion` varchar(45) DEFAULT NULL,
  `depreciacion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idArticulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblarticulos`
--

LOCK TABLES `tblarticulos` WRITE;
/*!40000 ALTER TABLE `tblarticulos` DISABLE KEYS */;
INSERT INTO `tblarticulos` VALUES (1,3,'500','300','i7','50','200'),(2,3,'500','300','i10','50','300'),(3,1,'500','300','i10','50','400'),(4,7,'500','300','mustang','50','100'),(5,7,'500','300','cheyyene','50','100'),(6,1,'500','300','hibrido','30','100'),(7,1,'500','300','mecanico','20','100'),(8,4,'500','300','F1','100','100'),(9,8,'4.50','2.20','Caramelo Arcoiris','30','0'),(10,8,'3.80','1.10','Paleta Frutal','25','0'),(11,8,'8.40','4.20','Paletón de Chocolate','45','0');
/*!40000 ALTER TABLE `tblarticulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcostosempresa`
--

DROP TABLE IF EXISTS `tblcostosempresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblcostosempresa` (
  `idCostos` int(11) NOT NULL,
  `costosFijos` varchar(45) DEFAULT NULL,
  `utilidadDeseada` varchar(45) DEFAULT NULL,
  `fecha` varchar(45) DEFAULT NULL,
  `idEmpresa` int(11) DEFAULT NULL,
  `idStatus` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCostos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcostosempresa`
--

LOCK TABLES `tblcostosempresa` WRITE;
/*!40000 ALTER TABLE `tblcostosempresa` DISABLE KEYS */;
INSERT INTO `tblcostosempresa` VALUES (1,'1000','30','2016-10-31 17:45:52',3,1),(2,'1000','30','2016-10-31 17:45:57',3,2),(3,'55000','30','2016-10-31 20:05:54',1,1),(4,'586900','30','2016-10-31 20:20:02',7,1),(5,'100000','35','2016-11-01 17:15:18',4,1),(6,'75000','30','2016-11-01 21:51:48',8,1);
/*!40000 ALTER TABLE `tblcostosempresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblempresas`
--

DROP TABLE IF EXISTS `tblempresas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblempresas` (
  `idEmpresa` int(11) NOT NULL,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `descripcionEmpresa` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idEmpresa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblempresas`
--

LOCK TABLES `tblempresas` WRITE;
/*!40000 ALTER TABLE `tblempresas` DISABLE KEYS */;
INSERT INTO `tblempresas` VALUES (1,'BMW','Empresa dedicada a construir autos de lujo'),(2,'Volkswagen','Empresa que hace el bocho'),(3,'Audi','Coches finos'),(4,'Ferrari','mas coches'),(5,'Tesla','coches del futuro'),(6,'Kia','coches coreanos'),(7,'Ford','coches gringos'),(8,'Ford1','coches gringos2'),(9,'chevrolet','la de los chevy');
/*!40000 ALTER TABLE `tblempresas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpuntoequilibrio`
--

DROP TABLE IF EXISTS `tblpuntoequilibrio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblpuntoequilibrio` (
  `idPuntoEqu` int(11) NOT NULL,
  `idEmpresa` int(11) DEFAULT NULL,
  `puntoDeEquilibrio` varchar(45) DEFAULT NULL,
  `idPuntoEquilibrio` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPuntoEqu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpuntoequilibrio`
--

LOCK TABLES `tblpuntoequilibrio` WRITE;
/*!40000 ALTER TABLE `tblpuntoequilibrio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpuntoequilibrio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblstatusid`
--

DROP TABLE IF EXISTS `tblstatusid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblstatusid` (
  `idStatus` int(11) NOT NULL,
  `tipoStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idStatus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblstatusid`
--

LOCK TABLES `tblstatusid` WRITE;
/*!40000 ALTER TABLE `tblstatusid` DISABLE KEYS */;
INSERT INTO `tblstatusid` VALUES (1,'activo'),(2,'inactivo'),(3,'en espera');
/*!40000 ALTER TABLE `tblstatusid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblutilidades`
--

DROP TABLE IF EXISTS `tblutilidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblutilidades` (
  `idUtilidad` int(11) NOT NULL,
  `idEmpresa` int(11) DEFAULT NULL,
  `idStatus` int(11) DEFAULT NULL,
  `utilidadDeseada` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`idUtilidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblutilidades`
--

LOCK TABLES `tblutilidades` WRITE;
/*!40000 ALTER TABLE `tblutilidades` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblutilidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'dbranking'
--
/*!50003 DROP PROCEDURE IF EXISTS `spAltaProductos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `spAltaProductos`(empresa nvarchar(50),nombre nvarchar(50),precio nvarchar(50),costo nvarchar(50),produc nvarchar(45),depre nvarchar(50))
BEGIN

declare existe int;
declare existeEm int;
declare idEmp int;
declare mensaje nvarchar(60);
declare nid int;


set existeEm = (select count(nombreEmpresa) from tblempresas where nombreEmpresa = empresa);

if existeEm != 0
then
	set idEmp = (select (idEmpresa) from tblempresas where nombreEmpresa = empresa);
	set existe = (select count(nombreProducto) from tblarticulos 
		where (nombreProducto = nombre and idEmpresa = idEmp));
        
	if existe = 0
    then
		set nid = (select count(ifnull(idArticulo,0))+1 from tblarticulos);
		insert into tblarticulos(idArticulo,idEmpresa,precioVenta,costoVariable,nombreProducto,produccion,depreciacion)
			values(nid,idEmp,precio,costo,nombre,produc,depre);
    
		set mensaje = "producto registrado exitosamente";
    else
		set mensaje = "producto ya registrado";
    end if;
    select mensaje as resultado;
else
	set mensaje = "empresa no encontrada, producto no registrado";
end if;

select mensaje as resultado;    

 
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `spAltaTipoPuntosEquilibrio` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `spAltaTipoPuntosEquilibrio`(PE nvarchar(50))
BEGIN

	declare existe int;
    declare nid int;
    declare mensaje nvarchar(60);
    
    
    set existe = (select count(tipoPuntoEquilibrio) from ctgpuntodeequilibrio where tipoPuntoEquilibrio = PE);

	if existe = 0 
    then
		set nid = (select count(ifnull(idPuntoEquilibrio,0))+1 from ctgpuntodeequilibrio);
        insert into ctgpuntodeequilibrio(idPuntoEquilibrio,tipoPuntoEquilibrio) values(nid,PE);
        set mensaje = "Tipo de punto de equilibrio registrado correctamente";
    else
		set mensaje = "Tipo de punto de equilibrio ya registrado";
    end if;
    
    select mensaje as resultado;
	

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `spAltaUtilidades` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `spAltaUtilidades`(empresa nvarchar(50),estatus nvarchar(50),utilidad nvarchar(50),fecha nvarchar(50))
BEGIN

declare existe int;
declare mensaje nvarchar(50);
declare nid int;

declare idEmp int;

set idEmp = (select idEmpresa from tblempresas where nombreEmpresa = empresa);

select idEmp as resultado;

 
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `spDatosEmpresa` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `spDatosEmpresa`()
BEGIN
	select * from tblempresas;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `spDetalleProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `spDetalleProducto`(empresa nvarchar(50),producto nvarchar(50))
BEGIN

declare existe int;
declare mensaje nvarchar(50);
declare idEmp int;
declare idStat int;

set idStat = (select idStatus from tblstatusid where tipoStatus = "activo");

set idEmp = (select idEmpresa from tblempresas where nombreEmpresa = empresa);

if idEmp is not null
then
	
    select *,(select costosFijos from tblcostosempresa where (idEmpresa = idEmp and idStatus = idStat)) as costosFijos,
    (select utilidadDeseada from tblcostosempresa where (idEmpresa = idEmp and idStatus = idStat)) as utilidad
    from tblarticulos join(tblempresas) using(idEmpresa) where (tblarticulos.idEmpresa = idEmp and nombreProducto = producto);

else
	set mensaje = "empresa no encontrada";
    select mensaje as resultado;
end if;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `spProductos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `spProductos`(empresa nvarchar(50))
BEGIN

	declare existe int;
    declare mensaje nvarchar(50);
    declare idEmp int;
    declare idStat int;
    
	set idStat = (select idStatus from tblstatusid where tipostatus = "activo");
    set existe = (select count(nombreEmpresa) from tblempresas where nombreEmpresa = empresa);
    
    if existe != 0
    then
		set idEmp = (select idEmpresa from tblempresas where nombreEmpresa = empresa);
        
		select nombreProducto,precioVenta,costoVariable, produccion,
        (select costosFijos from tblcostosempresa where (idEmpresa = idEmp and idStatus = idStat)) as CostoFijo,
        (select utilidadDeseada from tblcostosempresa where (idEmpresa = idEmp and idStatus = idStat)) as utilidad
        ,mensaje as resultado
        from tblarticulos where (idEmpresa = idEmp);
        
        
    else
		set mensaje = "empresa no encontrada";
        select mensaje as resultado;
    end if;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `spRegistraEmpresa` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `spRegistraEmpresa`(nombreEmp nvarchar(50),descripcion nvarchar(200))
BEGIN

declare existe int;
declare mensaje nvarchar(50);
declare nid int;

set existe = (select count(nombreEmpresa) from tblempresas where nombreEmpresa = nombreEmp );

if existe = 0
then
	set nid = (select ifnull(count(idEmpresa),0)+1 from tblempresas);
    insert into tblempresas(idEmpresa,nombreEmpresa,descripcionEmpresa) values (nid,nombreEmp,descripcion);
	set mensaje = "empresa registrada correctamente";
else
	set mensaje = "Nombre de la empresa ya registrado";
end if;

	select mensaje as resultado;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-03 21:43:28


#####################################################Modiicaciones daniel

describe tblcostosempresa;
describe tblempresas;

drop table empresa_balance;
drop table empresa_egresos;
drop table empresa_presupuesto;
drop table empresa_variables;
drop table empresa_ingresos;

select * from tblempresas;

select * from empresa_ingresos;
select * from empresa_egresos;
select * from empresa_presupuesto;
select * from empresa_balance;

insert into empresa_ingresos values(?,?,?,?,?,?,?,?,?);

create table empresa_ingresos(
idEmpresa int(11) not null,
idPeriodo int(2) not null,
preciovenuniad float not null,
ventaunidades float not null,
ventaefectivo float not null,
cobrodelmes float not null,
cobromespas float,
cobrodosmespas float,
totalperiodo float not null,
primary key (idEmpresa, idPeriodo),
foreign key (idEmpresa) references tblempresas (idEmpresa)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

create table Empresa_Balance(
idEmpresa int(11) not null,
idPeriodo int(2) not null,
efectivo  float not null,
cuentas_cobrar float not null,
activocirtotal float not null,
equipodereparto float not null,
depreciasionac float not null,
totactivosfijos float not null,
totalactivos float not null,
Pasivos float ,
capitalsocial float not null,
utilidadacu float not null,
capitaltotal float not null,
Pasmascap float not null,
primary key (idEmpresa,idPeriodo),
foreign key (idEmpresa) references tblempresas (idEmpresa)
ON DELETE CASCADE ON UPDATE CASCADE,
foreign key (idEmpresa,idPeriodo) references  empresa_ingresos (idEmpresa,idPeriodo)
ON DELETE CASCADE ON UPDATE CASCADE 
)ENGINE=InnoDB; 

select * from tblempresas;
use dbranking;

create table empresa_egresos(
idEmpresa int(11) not null,
idPeriodo int(2) not null,
costomanymatuni float not null,
costadminuni float not null,
costoventasuni float not null,
costomanototal float not null,
iva float not null,
gastosadmin float not null,
gastosventas float not null,
préstamo float not null default 0.0 ,
gastosfin float not null default 0.0 ,
impuestos float not null default 0.0,
total float not null,
primary key (idEmpresa,idPeriodo),
foreign key (idEmpresa) references tblempresas (idEmpresa)
ON DELETE CASCADE ON UPDATE CASCADE,
foreign key (idEmpresa,idPeriodo) references  empresa_ingresos (idEmpresa,idPeriodo)
ON DELETE CASCADE ON UPDATE CASCADE 
)ENGINE=InnoDB;

create table empresa_presupuesto(
idEmpresa int (11) not null,
idPeriodo int (2) not null,
toting float not null,
totegr float not null,
flujoneto float not null,
saldoini float not null default 0.0,
saldofinal float not null,
financiamiento float not null default 0.0,
primary key (idEmpresa,idPeriodo),
foreign key (idEmpresa) references tblempresas (idEmpresa)
ON DELETE CASCADE ON UPDATE CASCADE,
foreign key (idEmpresa,idPeriodo) references  empresa_ingresos (idEmpresa,idPeriodo)
ON DELETE CASCADE ON UPDATE CASCADE 
)ENGINE=InnoDB;

create table empresa_variables(
	idEmpresa int(11) not null,
    precioini float not null,
    porincprecio float not null default 0.0,
    ventasini  int not null,
    porincrventas int not null default 0.0,
    costomanouni float not null,
    porinccostom float not null default 0.0,
    costoadminuni float not null,
    porinccostoadmin float not null default 0.0,
    costovenuni float not null,
    porinccostoven float not null default 0.0,
    porcobromes int(2) not null,
    porcobrosegmes int(2) not null default 0.0,
    porcobrotermes int(2) not null default 0.0,
    efectivoini float not null,
    cuentascobrarini float not null,
    equiporeparto float not null,
    depreciacionini float not null,
    depreciacionperiodo float not null,
    PasivoTotal float not null,
    CapitalSocial float not null,
    Utilidadacumulada float not null,
    primary key (idEmpresa),
    foreign key (idEmpresa) references tblempresas (idEmpresa)
)ENGINE=InnoDB;


describe empresa_ingresos;
describe empresa_egresos;
describe empresa_presupuesto;
describe empresa_balance;
describe empresa_variables;