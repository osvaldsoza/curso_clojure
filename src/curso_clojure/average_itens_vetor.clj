(ns curso-clojure.average-itens-vetor)

(defn average-itens-vetor
  [numbers]
  (let [sum_itens (apply + numbers)
        count_numbers (count numbers)]
    (println "Sum itens[numbers]:" sum_itens)
    (println "Count:" count_numbers)
    (println "Average:"
             (float (/ sum_itens count_numbers)))))


(average-itens-vetor [3 4 5 6 7 8])
