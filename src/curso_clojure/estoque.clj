(ns curso-clojure.estoque)

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(def precos [30 700 1000])

;funcao sem nome / anonima
(fn [valor-bruto] (> valor-bruto 100))

(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-desconto (/ 10 100)
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

;funcoes anonimas
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))

;funcao com um argumento
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> % 100) 1000))

(println (map valor-descontado precos))


