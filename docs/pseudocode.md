```
FUNCTION squareRoot(number):

    IF number is less than 0 THEN
        THROW InvalidOperationException
        DISPLAY "Cannot sqrt a negative number"
    END IF

    result = Math.sqrt(number)
    RETURN result

END FUNCTION