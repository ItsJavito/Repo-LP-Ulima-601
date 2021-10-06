#lang racket

(define grafo (list (list 1 2 4)
                    (list 2 5)
                    (list 3 5 6)
                    (list 4 2)
                    (list 5 4)
                    (list 6 6)))

;funcion es adyacente que recibe un grafo y dos vertices, saber si los vertices son adyacentes
; es decir, tienen una arista

;ver buscar elemento en una lista
(define (buscar lista-vertice v)
  (if (empty? lista-vertice)
      #f ; retornar false
      (if(= (car lista-vertice) v)
         #t ; retornar true
         (buscar (cdr lista-vertice) v))))

;funcion es-adyacente
(define (es-adyacente grafo v1 v2)
  (if (empty? grafo)
      #f 
      (if (= v1 (car (car grafo)))
          (buscar (car grafo) v2)
          (es-adyacente(cdr grafo) v1 v2))))