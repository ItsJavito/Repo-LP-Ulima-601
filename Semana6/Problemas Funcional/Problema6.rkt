#lang racket 

(define lista_numeros '(1 2 3 4 5 6 7 8))

(define (cdr-tail lista Nlist)
    (if (empty? (cdr lista))
    Nlist
    (cdr-tail (cdr lista) (append Nlist (list (car lista))))))

(cdr-tail lista_numeros '())