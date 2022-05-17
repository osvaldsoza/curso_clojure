(ns curso-clojure.palindromo)

(defn verifica-palindromo
      [word]
      (let [reverse-word (reverse word)
            join-reverse-word (clojure.string/join "" reverse-word)]
        (if (= 0 (compare word join-reverse-word))
          (println word "é palindromo")
          (println word "nao é palindromo"))))

(verifica-palindromo "ovo")
(verifica-palindromo "garrafa")
(verifica-palindromo "aibofobia")
(verifica-palindromo "goiaba")
(verifica-palindromo "anilina")
(verifica-palindromo "reviver")
(verifica-palindromo "reviveR")