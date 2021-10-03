#lang racket

(define (generarFila lista pos tam)
    (if (= tam 0) 
    lista
    (generarFila (append lista (list (if (= pos 0) 1 0))) (- pos 1) (- tam 1))))

(define (identidad-tail dim matriz pos)
    (if (= pos dim) 
    matriz
    (identidad-tail dim (append matriz (list (generarFila '() pos dim))) (+ pos 1))))

(define (identidad dim) (identidad-tail dim '() 0))

(identidad 5)