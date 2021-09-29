#lang racket

(require csv-reading)
( define lista_alumnos(cdr (csv->list
 (make-csv-reader
 (open-input-file "./notas.csv")
 '((separator-chars #\|)
 (strip-leading-whitespace? . #t)
 (strip-trailing-whitespace? . #t))))))

;funcion que me permita sacar el promedio por alumnos
;((3 * EP1) + (3 * EP2) + (4 * EF))/10

(define (nota->numero alumno)
  (list (list-ref alumno 0)
         (string->number (list-ref alumno 1))
         (string->number (list-ref alumno 2))
         (string->number (list-ref alumno 3))))

;en lista_alumnos_num se encuentran los datos con su tipo de dato correcto

(define lista_alumnos_num (map nota->numero lista_alumnos))

(define (promedio_alumno alumno)
  (list (list-ref alumno 0)
        (exact->inexact(/ (+ (* 3 (list-ref alumno 1))
                             (* 3 (list-ref alumno 2))
                             (* 4 (list-ref alumno 3))) 10))))

;crear etiqeta, con la funcion funcion map para obtener todos los promedios
(define promedios_finales (map promedio_alumno lista_alumnos_num))

lista_alumnos_num


