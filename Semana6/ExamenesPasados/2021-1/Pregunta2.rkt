#lang racket

(define lista_numeros '(1 2 3 4 5 6 7 8 9))

(define (elim-tail pos lista nLista) 
    (if (= pos 0)
    (append nLista (cdr lista))
    (elim-tail (- pos 1) (cdr lista) (append nLista (list (car lista))))))

(define (eliminar pos lista) 
    (if (or (>= pos (length lista)) (< pos 0))
    '()
    (elim-tail pos lista '())))

(eliminar 6 lista_numeros)