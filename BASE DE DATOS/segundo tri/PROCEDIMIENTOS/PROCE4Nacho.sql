
DELIMITER // 
CREATE FUNCTION sumar_numeros (
numero1 INT,
numero2 INT
)
RETURNS INT 
BEGIN

RETURN numero1 + numero2; 
END // 
DELIMITER //