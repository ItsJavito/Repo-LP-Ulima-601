#lang racket

(require csv-reading)

(define lista_data(csv->list
 (make-csv-reader
 (open-input-file "./data_contaminacion.csv")
 '((separator-chars #\,)
 (strip-leading-whitespace? . #t)
 (strip-trailing-whitespace? . #t)))))

(define (formatear registro)
  (list (list-ref registro 0)
        (list-ref registro 1)
        (if (eq? (list-ref registro 2) "<0.1")
            0.09
            (string->number (list-ref registro 2)))
        (string->number (list-ref registro 3))
        (string->number (list-ref registro 4))
        (if (eq? (list-ref registro 5) "<0.1")
            0.09
            (string->number (list-ref registro 5)))
        (string->number (list-ref registro 6))
        (string->number (list-ref registro 7))
        (if (eq? (list-ref registro 8) "<0.1")
            0.09
            (string->number (list-ref registro 8)))
        (string->number (list-ref registro 9))
        (string->number (list-ref registro 10))

        ))

(map formatear lista_data)

(define (promedios_muestras data)
  (map (lambda (reg)
              (list (list-ref reg 0)
                    (list-ref reg 1)
                    (/ (+ (list-ref reg 2) (list-ref reg 5) (list-ref reg 8))3)
                    (/ (+ (list-ref reg 3) (list-ref reg 6) (list-ref reg 9))3)
                    (/ (+ (list-ref reg 4) (list-ref reg 7) (list-ref reg 10))3)))
       (map formatear data)))

(promedios_muestras lista_data)

