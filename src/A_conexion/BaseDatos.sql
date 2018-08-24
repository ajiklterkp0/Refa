CREATE DATABASE IF NOT EXISTS refaccionaria;
USE refaccionaria;

/*******************************************************************************/
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellido_p` varchar(50) NOT NULL,
  `apellido_m` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `numero` varchar(20) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `tipousuario` varchar(50) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

INSERT INTO `usuarios` (`idusuario`,`usuario`,`password`,`tipousuario`) VALUES 
 (1,'Administrador','Moto','Repuestos','Valle de Bravo, Centro','Sin Definir','Administrador','root','ADMINISTRADOR'),
 (1002,'Jonathan','Valdez','Martinez','San Martin Obispo,Manzana 4','7224568218','JonaVM','1234','ADMINISTRADOR');
/*******************************************************************************/

DROP TABLE IF EXISTS `compras`;
CREATE TABLE `compras` (
  `idcompra` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` text NOT NULL,
  `fechacompra` varchar(50) NOT NULL,
  `idproveedor` varchar(50) NOT NULL,
  `total` double (10,2) NOT NULL,
  `pdf` blob NOT NULL,
  PRIMARY KEY (`idcompra`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

INSERT INTO `compras` (`idcompra`,`descripcion`,`fechacompra`,`idproveedor`,`total`,`pdf`) VALUES 
 (100,'ACCESORIOS, METALICOS MARCA SORINAS, EL DIA','15/03/2018','Refaccionaria sol',1000.98,"hola"),
 (101,'BANDAS ELASTICAS','15/03/2018','Refaccionaria sol',100,"hola"),
 (102,'AROS METALICOS','15/03/2018','Refaccionaria sol',123,"hola");
/*******************************************************************************/

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE `categorias` (
  `idcategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

INSERT INTO `categorias` (`idcategoria`,`nombre`) VALUES 
 (1,'Plasticos');
/*******************************************************************************/

DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE `proveedores` (
  `idproveedor` int(11) NOT NULL AUTO_INCREMENT,
  `rfc` varchar(30) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` text NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`idproveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

INSERT INTO `proveedores` (`idproveedor`,`rfc`,`nombre`,`direccion`,`telefono`,`email`) VALUES 
(1,'SRR730510K44','Refaccionaria sol','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com'),
(2,'Sin RFC','Auto Todo','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com'),
(3,'Sin RFC','Entrepeneur','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com'),
(4,'Sin RFC','OCAN','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com'),
(5,'Sin RFC','Quiminet','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com'),
(6,'Sin RFC','Mexico-Red','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com'),
(7,'Sin RFC','Refacciones Mendoza','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com'),
(8,'AST730510K44','Refacciones 100','Toluca de Lerdo, Estado de México','7224568218','refaccionaria_34rdf@gmail.com');

/*******************************************************************************/
DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos` (
  `idproducto` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(30) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text NOT NULL,
  `idcategoria` varchar(20) NOT NULL,
  `idproveedor` varchar(20) NOT NULL,
  `precio_compra` double(10,2) NOT NULL,
  `precio_venta` double(10,2) NOT NULL,
  `stock_min` varchar(50) NOT NULL,
  `stock_max` varchar(50) NOT NULL,
  `stock_actual` varchar(50) NOT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

INSERT INTO `productos` (`idproducto`,`codigo`,`nombre`,`descripcion`,`idcategoria`,`idproveedor`,`precio_compra`,`precio_venta`,`stock_min`,`stock_max`,`stock_actual`) VALUES 
(1,'758104100422','Balatas','Complemento disco simple','COMPLEMENTO','SOL REFCCIONES',560.00,720.60,10,20,20),
(2,'75007614','Bujias','Alumnio','COMPLEMENTO','SOL REFACCIONES',64.90,80.90,50,100,47),
(3,'75007614','LLanta','hule','COMPLEMENTO','SOL REFACCIONES',64.90,80.90,50,100,0);
/*******************************************************************************/

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE `ventas` (
  `idventa` int(11) NOT NULL,
  `codigo` varchar(30) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` double(10,2) NOT NULL,
  `fecha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

 INSERT INTO `ventas` (`idventa`,`codigo`,`cantidad`,`total`,`fecha`) VALUES 
 (1,'758104100422',2,1441.2,'19/03/2017'),
 (1,'75007614',1,89.90,'19/03/2017');


DROP TABLE IF EXISTS `gastos`;
CREATE TABLE `gastos` (
  `idgasto` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` text NOT NULL,
  `gastado` double(10,2) NOT NULL,
  `fecha_gasto` varchar(50) NOT NULL,
  PRIMARY KEY (`idgasto`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

