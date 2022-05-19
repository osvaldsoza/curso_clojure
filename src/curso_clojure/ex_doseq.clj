(ns curso-clojure.ex-doseq)


(def nums ["ere", "rere" "rerer"])
(defn ex-doseq
  [numbers]
 (dotimes [n (count numbers)]
   (println (nth (numbers n) 0))))

(defn ex-recur []
  (loop [i 0]
    (when (< i 5)
      (println i)
      (recur (inc i)))))
(ex-recur)