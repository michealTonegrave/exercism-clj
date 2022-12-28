(ns exercism_clj.nth-prime)

(defn prime? [n]
  (or (= n 2)
  (not-any? #(zero? (mod n %)) (range 2 (inc (Math/sqrt n))))))

(defn nth-prime [n]
  (if (> n 0)
      (nth (filter prime? (iterate inc 2))(dec n))
      (throw (IllegalArgumentException. (str "Not a valid index" n)))))
