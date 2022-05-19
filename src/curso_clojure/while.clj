(ns curso-clojure.while)

(defn cont-while [n]
      (def x (atom 1))
  (while (< @x n)
    (do
      ; (if (= 0 (mod @x 2)))
      (println @x)
      (swap! x inc))))

(cont-while 10)
