(ns curso-clojure.mapas-aninhados)

(def pedido {:mochila {:quantidade 2 :preco 80}
             :camisa  {:quantidade 5 :preco 40}})

(println (pedido :mochila))
(println (get pedido :mochila))

;threading
(println pedido)
(println (-> pedido
             :mochila
             :quantidade))
(-> pedido
    :mochila
    :quantidade
    println)