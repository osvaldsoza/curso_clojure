(ns curso-clojure.aula4)

(def precos [30 700 1000])

(println (precos 0))
(println (get precos 2))
(println (get precos 22 0)) ;valor padrao
