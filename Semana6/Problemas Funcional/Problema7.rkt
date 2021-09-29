#lang racket

(define (iota-solve a b) 
    (if (= a b)
    (list a)
    (append (list a) (iota (+ a 1) b))))

(define (iota a b) 
    (if (> a b) 
    (iota-solve b a)
    (iota-solve a b)))

(iota 1 5)
(iota 5 1)