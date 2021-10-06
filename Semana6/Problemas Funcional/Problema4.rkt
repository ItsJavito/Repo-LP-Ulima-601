#lang racket 

(define lista_numeros '(1 2 3 4 5 6))

(define (revertir-recursivo lista) 
    (if (not (eq? lista '())) 
    (append (revertir-recursivo (cdr lista)) (list (car lista)))
    '())
)

(define (revertir-tail lista nLista)
    (if (empty? lista)
    nLista
    (revertir-tail (cdr lista) (append (list (car lista) ) nLista))))

(define (revertir lista) (revertir-tail lista '()))

(Reverse-List lista_numeros)
(revertir lista_numeros)