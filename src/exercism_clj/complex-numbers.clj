(ns exercism_clj.complex-numbers)

(defn real [[r i]] r)

(defn imaginary [[r i]] i)

(defn abs [[r i]]
  (double (Math/sqrt (+ (* r r) (* i i)))))

(defn conjugate [[r i]] [r (- i)])

(defn add [[a b] [c d]]
  [(+ a c) (+ b d)])

(defn sub [[a b] [c d]]
  [(- a c) (- b d)])

(defn mul [[a b] [c d]]
 [(- (* a c) (* b d)) (+ (* b c) (* a d))])

(defn div [[a b] [c d]]
  [(/ (double (+ (* a c) (* b d))) (+ (* c c) (* d d)))
   (/ (double (- (* b c) (* a d))) (+ (* c c) (* d d)))])





