#lang racket
(require csv-reading)
( define lista_alumnos(cdr (csv->list
 (make-csv-reader
 (open-input-file "./notas.csv")
 '((separator-chars #\|)
 (strip-leading-whitespace? . #t)
 (strip-trailing-whitespace? . #t))))))

;utilizando la funcion lambda

(define (calcular_promedios lista_alumnos)
  (map (lambda (alumno)
         (list (list-ref alumno 0)
               (exact->inexact (/ (+ (* 3 (list-ref alumno 1))
                                    (* 3 (list-ref alumno 2))
                                    (* 4 (list-ref alumno 3))) 10))))
         (map (lambda (alumno)
                (list (list-ref alumno 0)
                      (string->number (list-ref alumno 1))
                      (string->number (list-ref alumno 2))
                      (string->number (list-ref alumno 3)))) lista_alumnos)))

(define (ver_desaprobados lista_alumnos)
  (map (lambda (a) (list-ref a 0))
       (filter (lambda (alumno)
                 (< (list-ref alumno 1) 10.5))
               (calcular_promedios lista_alumnos))))

(ver_desaprobados lista_alumnos)

  
