(ns curso-clojure.replace)

(defn str-replace
  [s target result]
  (clojure.string/replace s target result))

(println (str-replace "abc" \a \2))
(println (str-replace "abc" "c" "3A3"))
(println (str-replace "abc" #"[a-z]" "#"))
(println (str-replace "abc" #"[a-z]" #(clojure.string/upper-case %1)))
