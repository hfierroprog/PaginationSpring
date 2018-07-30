/*Agregar Categorias*/
INSERT INTO categoria(id,nombre) values(1,'Electro Hogar');
INSERT INTO categoria(id,nombre) values(2,'Tecnología');
INSERT INTO categoria(id,nombre) values(3,'Celulares');
INSERT INTO categoria(id,nombre) values(4,'Dormitorio');
INSERT INTO categoria(id,nombre) values(5,'Muebles');
INSERT INTO categoria(id,nombre) values(6,'Hogar');

/*Agregar Productos*/
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(1,'FRIGOBAR LIBERO',99990,5,1);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(2,'LAVADORA LG WD9WB6',329990,10,1);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(3,'CLÓSET CASA IDEAL BOLOGNIA',74990,59,5);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(4,'LED SAMSUNG UN40J5200A',219990,24,2);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(5,'SMARTPHONE LG K10 2017',99990,60,3);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(6,'CAMA AMERICANA CELTA APOLO',109990,25,4);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(7,'SARTÉN ILKO KRIPTONITE',21990,180,6);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(8,'NOTEBOOK HP 14-CF0003LA',349990,15,2);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(9,'CAL.CAMA 2PL SCALDASON COMFORT MAT.',38490,95,4);
INSERT INTO producto(id,nombre,precio,stock,categoria_id) VALUES(10,'JUEGO DE COMEDOR CASA IDEAL AREGON / 4 SILLAS',69990,76,5);


