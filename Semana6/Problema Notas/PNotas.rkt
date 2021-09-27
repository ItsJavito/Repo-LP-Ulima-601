#lang racket

(require csv-reading)
( define lista_alumnos(cdr (csv->list
 (make-csv-reader
 (open-input-file "./notas.csv")
 '((separator-chars #\|)
 (strip-leading-whitespace? . #t)
 (strip-trailing-whitespace? . #t))))))

;funcion que me permita sacar el promedio por alumno
; (3 * EP1 + 3 * EP2 + 4 * EF) / 10

(define (nota->numero alumno)
  (list (list-ref alumno 0)
        (string->number (list-ref alumno 1))
        (string->number (list-ref alumno 2))
        (string->number (list-ref alumno 3))))

(define lista_alumnos_num (map nota->numero lista_alumnos))

lista_alumnos_num


