#lang racket

(define (fact-tail num ans) 
    (if (= num 1)
    ans
    (fact-tail (- num 1) (* ans num))))

(define (fact num) (fact-tail num 1))

(define (LNC-tail num fac ans) 
    (if (= num 0)
    ans
    (LNC-tail (quotient num 10) (+ fac 1) (+ (* (modulo num 10) (fact fac)) ans))))

(define (LNC num) (LNC-tail num 1 0))

(LNC 719)