(ns curso-clojure.destruct)

(def pedido {:mochila {:quantidade 2 :preco 80}
             :camisa  {:quantidade 5 :preco 40}})

"(defn preco-dos-produtos
  [[_ valor]]
  (* (:quantidade valor) (:preco valor)))"

(defn preco-total-do-produto
  [produto]
  (* (:quantidade produto) (:preco produto)))

"(def preco-produtos-calculado (map preco-dos-produtos pedido))
(println (reduce + preco-produtos-calculado))"

;threading last ->>
(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-do-produto)
       (reduce +)))

(println "Total do produto:" (total-do-pedido pedido))