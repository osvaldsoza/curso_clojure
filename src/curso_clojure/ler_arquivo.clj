(ns curso-clojure.ler-arquivo)

(defn read-arq []
      (let [ linha (slurp "/Users/osvaldoferreira/Documents/teste.txt")
            foo (conj linha)]
        (println foo)))


(read-arq)
