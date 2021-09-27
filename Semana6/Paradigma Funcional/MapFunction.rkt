#lang racket

(define lista_numeros
 (list (list 1 3 5 7 9)
 (list 2 4 6 8 10)))

(define (promedio numeros) (promedio_tail numeros 0 0))

(define (promedio_tail numero suma cont)
  (if (empty? numero)
      (/ suma cont)
      (promedio_tail (cdr numero) (+ suma (car numero)) (+ cont 1))))

;Implementar una función que me saque el promedio total
(define (promedio_total lista)
  (promedio (map promedio lista))
 )

(promedio_total lista_numeros)