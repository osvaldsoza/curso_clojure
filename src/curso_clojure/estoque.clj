(ns curso-clojure.estoque)

(defn valor-descontado
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-desconto (/ 10 100)
          desconto      (* valor-bruto taxa-desconto)]
      (println "Calculando desconto" desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))

(println
  (valor-descontado 100))

