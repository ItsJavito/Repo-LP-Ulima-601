#lang racket 

(define lista_numeros '(1 2 3 4 5 6 7 8))

(define (tail-cdr lista Nlist)
    (if (empty? (cdr lista))
    Nlist
    (tail-cdr (cdr lista) (append Nlist (list (car lista))))))

(tail-cdr lista_numeros '())