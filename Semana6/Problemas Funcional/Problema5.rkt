#lang racket 

(define lista_numeros '(1 2 3 4 5 6 7 8))

(define (getLast lista)
    (if (empty? (cdr lista)) 
    (car lista)
    (getLast (cdr lista))))

(getLast lista_numeros)