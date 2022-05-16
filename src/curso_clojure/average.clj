(ns curso-clojure.average)

(defn show-average
      [n1 n2 n3]
  (let [p1 2
        p2 3
        p3 4
        total-peso (+ p1 p2 p3)
        total-notas (+ (* n1 p1) (* n2 p2) (* n3 p3))
        average (/ total-notas total-peso)
        frm_average (format "%.2f" average)]
    (println "Total peso" total-peso)
    (println "Total notas" total-notas)
    (/ total-notas total-peso)
    (println "Média:" frm_average)
    (if (> average 7.0)
      (println "Aprovado com media:" frm_average)
      (println "Reporvado com media:" frm_average))))

(show-average 6.7 6.5 8.0)

