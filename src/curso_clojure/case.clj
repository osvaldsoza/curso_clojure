(ns curso-clojure.case)

(defn stm-case [arg]
  (let [n arg]
    (case n
      5 (println "is 5")
      10 (println "is 10")
      (println "is neither 5 not 10"))))

(stm-case 5)
