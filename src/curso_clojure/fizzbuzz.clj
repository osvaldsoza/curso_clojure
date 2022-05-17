(ns curso-clojure.fizzbuzz)

(defn fizzbuzz
  [number]
  (cond
    (= 0 (mod number 15)) "fizzbuzz"
    (= 0 (mod number 3)) "fizz"
    (= 0 (mod number 5)) "buzz"
    :else number))


(println (fizzbuzz 8))
(println (fizzbuzz 3))
(println (fizzbuzz 5))
(println (fizzbuzz 15))