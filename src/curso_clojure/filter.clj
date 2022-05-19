(ns curso-clojure.filter)

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(def precos [30 700 1000])


(defn valor-descontado
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-desconto (/ 10 100)
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "precos" precos)

(def result-filter (filter aplica-desconto? precos))

(println (map valor-descontado result-filter ))
