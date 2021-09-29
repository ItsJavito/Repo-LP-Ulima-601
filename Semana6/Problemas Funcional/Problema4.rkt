#lang racket 

(define lista_numeros '(1 2 3 4 5 6))

(define (Reverse-List lista) 
    (if (not (eq? lista '())) 
    (append (Reverse-List (cdr lista)) (list (car lista)))
    '())
)

(Reverse-List lista_numeros)