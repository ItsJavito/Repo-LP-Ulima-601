#lang racket
(define lista_numeros '(1 7 3 4 5))
(define (suma_total lista)
  (if(eq? lista '())
     0
     (+ (car lista)(suma_total (cdr lista)))
     )
  )
;devolver el tamano de una lista
(define (longitud lista)
  (if(eq? lista '())
     0
     (+ 1 (longitud (cdr lista)))
     )
  )
;optimizar la funcion suma-total
(define (suma-total-tail lista suma)
  (if (eq? lista '())
      suma
      (suma-total-tail (cdr lista) (+ suma (car lista) ))
      )
  )

;funcion longitud optimizada
(define (longitud-tail lista sum)
  (if(eq? lista '())
     sum
     (longitud-tail (cdr lista) (+ sum 1))
     )
  )
; Funcion que permite calcular el promedio de una lista de numeros
(define (prom-tail lista sum cont)
  (if (eq? lista '())
      (/ sum cont)
      (prom-tail (cdr lista) (+ sum (car lista)) (+ cont 1))
      )
  )
(define main (display (prom-tail lista_numeros 0 0)))