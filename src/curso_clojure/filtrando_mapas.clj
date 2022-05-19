(ns curso-clojure.filtrando-mapas)


(def pedido {:mochila  {:quantidade 2 :preco 80}
             :camisa   {:quantidade 5 :preco 40}
             :chaveiro {:quantidade 1}})

"(defn gratuito?
  [item]
  (<= (get item :preco 0) 0))

(println (filter gratuio? (vals pedido)))"

"(defn gratuito?
  [[chave item]]
  (<= (get item :preco 0) 0))

(println
  (filter gratuito? pedido))"

(defn gratuito?
  [item]
  (<= (get item :preco 0) 0))

;destruct e funcao anonima
(println (filter (fn [[_ item]] (gratuito? item)) pedido))

(def filtrando-itens-gratuitos #(gratuito? (second %)))
(println (filter filtrando-itens-gratuitos pedido))

(def pago? (comp not gratuito?))

(println (pago? (vals pedido)))
