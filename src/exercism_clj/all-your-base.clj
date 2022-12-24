(ns exercism_clj.all-your-base)

;todo - modificare 

(defn- base-seq [base] (iterate #(* % base) 1))

(defn- convertion-valid? [from digits to]
  (and (> from 1)
       (> to 1)
       (not (apply (some-fn #(>= % from) neg?) digits))))

(defn- base-10 [from digits]
   (map * (reverse (take (count digits) (base-seq from))) digits))

(defn- to-base [b d]
  (cond
  (empty? d) ()
  (every? zero? d) '(0)
  :else (->> (reduce + d)
             (iterate #(quot % b))
             (take-while #(> % 0))
             (map #(rem % b))
             reverse)))

(defn convert [from digits to]
  (when (convertion-valid? from digits to)
    (to-base to (base-10 from digits))))

