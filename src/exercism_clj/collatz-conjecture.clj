(ns exercism_clj.collatz-conjecture)

(defn collatz-step [n]
  (if (even? n) (quot n 2)(inc (* n 3))))

(defn collatz [n]
  (if (< n 1)
    (throw (Exception. "invalid input"))
    (count (take-while #(> % 1) (iterate collatz-step n)))))
