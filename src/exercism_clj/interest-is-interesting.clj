(ns exercism-clj.interest-is-interesting)

(defn interest-rate [balance]
  (condp > balance
    0M      -3.213
    1000M    0.5
    5000M    1.621
    (when (>= balance 5000M) 2.475)))

(defn annual-balance-update [balance]
  (-> (bigdec (Math/abs (interest-rate balance)))
      (* balance 1/100)
      (+ balance)))

(defn amount-to-donate [balance tax-free-percentage]
 (if (> balance 0)
  (-> (* 2M tax-free-percentage)
      (* balance 1/100)
      (int))
  0))




