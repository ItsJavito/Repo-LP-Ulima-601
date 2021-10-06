(require csv-reading)
( define lista_alumnos(cdr (csv->list
 (make-csv-reader
 (open-input-file "./notas.csv")
 '((separator-chars #\|)
 (strip-leading-whitespace? . #t)
 (strip-trailing-whitespace? . #t))))))