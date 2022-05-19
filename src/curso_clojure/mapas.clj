(ns curso-clojure.mapas)

(def estoque {
              "Mochila" 10
              "Camisa" 5
              "Short" 7})
(println estoque)

(println "Quantidade de elementos em estoque:" (count estoque))
(println "Keys:" (keys estoque))
(println "Values:" (vals estoque))


(def estoque {
              :mochila 10
              :camisa 5
              })
(println estoque)

(def estoque (assoc estoque :short 7))
(println estoque)

(println (update estoque :short dec))
;lambda
(println (update estoque :short #(- % 3)))


