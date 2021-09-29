#lang racket

;Funcion recursive-tail para hacer una potencia
(define (power-tail a b temp) 
    (if (= b 0)
    temp
    (power-tail a (- b 1) (* temp a))))

(define (power a b) (power-tail a b 1))

(power 2 3)