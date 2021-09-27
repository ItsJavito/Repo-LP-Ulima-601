#lang racket
(define lista_numeros '(1 2 5 7 9))
;car cdr
; long
(length lista_numeros)
;(if (eq? lista '()))
(empty? lista_numeros)

;Implementar una funcion que nos devuelva una elemento de una posicion i

(define (obtener_elemento lista i)
  (if(= i 0)
     (car lista)
     (obtener_elemento (cdr lista) (- i 1))
   )
  )

(define (getPos lista pos posL)
  (if(= pos posL)
     (car lista)
     (getPos (cdr lista) pos (+ posL 1))
   )
)

;funicon crear lista
(define lista_numeros_pares (list 2 4 5 8))

;funcion append

(append lista_numeros lista_numeros_pares)

;implementar una funcion que permita agregar un elemento a una lista

(define (agregar lista elem)
  (append (list elem) lista)
 )

(agregar lista_numeros 2)