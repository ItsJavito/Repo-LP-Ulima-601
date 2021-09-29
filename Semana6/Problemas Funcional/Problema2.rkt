#lang racket 

;Funcion recursiva para hacer factorial
(define (fact-tail a temp) 
    (if (= a 1)
    temp
    (fact-tail (- a 1) (* temp a))))

(define (fact a) (fact-tail a 1))

(define (Binomial-Coef n k) 
    (if (or (< n 0) (< n k)) 
    0
    (/ (fact n) (* (fact (- n k)) (fact k)))))

(Binomial-Coef 10 2)