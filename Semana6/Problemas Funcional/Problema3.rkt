#lang racket
; Funcion para obtener un valor de una lista 

(define lista_numeros '(1 2 3 4 5 6))

(define (getPos lista pos) 
    (if (= pos 0)
    (car lista)
    (getPos (cdr lista) (- pos 1))))

(getPos lista_numeros 0)