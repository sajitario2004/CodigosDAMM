DROP DATABASE DIA310125;

CREATE DATABASE DIA310125;

USE DIA310125;

-- profe he hecho las 2 en la misma pagina para ayudarme de la funcion es_primo en siguiente primo

DELIMITER $$
CREATE FUNCTION es_primo(num INT)
RETURNS BOOLEAN 
DETERMINISTIC
BEGIN
    DECLARE cont1 INT DEFAULT 2;  
    DECLARE cont2 INT DEFAULT 0;  
    DECLARE resultado BOOLEAN DEFAULT TRUE; 

    IF num < 2 THEN
        SET resultado = FALSE;
        RETURN resultado;
    END IF;

    WHILE cont1 < num DO  
        IF num % cont1 = 0 THEN 
            SET cont2 = cont2 + 1; 
        END IF;
        
        SET cont1 = cont1 + 1;
    END WHILE;

    IF cont2 > 0 THEN 
        SET resultado = FALSE;
    END IF;

    RETURN resultado; 
END $$ 
DELIMITER ;


SELECT es_primo(7); 

SELECT es_primo(10); 

DELIMITER $$
CREATE FUNCTION siguiente_primo (num1 INT)
RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE comprob BOOLEAN DEFAULT TRUE;
    
    WHILE comprob DO
    
		SET num1 = num1 + 1;
        
        IF es_primo(num1) THEN
			SET comprob = TRUE;
        END IF;
        
    END WHILE ;
    
    RETURN num1;
END $$
DELIMITER ;

-- SELECT siguiente_primo(10);
