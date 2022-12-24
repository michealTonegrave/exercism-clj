(ns exercism.armstrong-number.clj)

(defn armstrong? [n]
  (->> (str n)
       (map (comp read-string str))
       (map #(reduce * (repeat (count (str n)) %)))
       (reduce +)
       (= n)))












      
