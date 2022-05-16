(ns curso-clojure.uper-case)

(defn converter-upper-case
      "Converte uma string em maiusculo"
      [str]
      (.toUpperCase str))

(println
  (converter-upper-case "osvaldo"))