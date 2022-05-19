(ns curso-clojure.reduce)

(def precos [30 700 1000])

(defn get-reduce
  [v-precos]
  (println "get-reduce" (reduce + v-precos)))

(get-reduce precos)

(defn soma-itens [valor-1 valor-2]
  (+ valor-1 valor-2))

(println "fn soma-itens" (reduce soma-itens precos))
