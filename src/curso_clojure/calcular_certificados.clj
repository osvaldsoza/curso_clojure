(ns curso-clojure.calcular-certificados)

(def clientes [
               {:nome         "Guilherme"
                :certificados ["Clojure" "Java" "Machine Learning"]}
               {:nome         "Paulo"
                :certificados ["Java" "Ciência da Computação"]}
               {:nome         "Daniela"
                :certificados ["Arquitetura" "Gastronomia"]}])

(defn total-certificados-cliente
  [clientes]
  (->> clientes
       (map :certificados)
       (map count)
       (reduce +)
       (println "total de certificados:")))

(total-certificados-cliente clientes)
