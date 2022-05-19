(ns curso-clojure.funcao-anonima)

;funcao sem nome / anonima
(fn [valor-bruto] (> valor-bruto 100))

(defn valor-descontado
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-desconto (/ 10 100)
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> % 100) 1000))


