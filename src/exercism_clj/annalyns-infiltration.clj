(ns exercism_clj.annalyns-infiltration)


(def can-fast-attack? (partial not))
(defn can-spy? [& preds]
  (< (count (filter (partial not)  preds)) 3))
(defn can-signal-prisoner? [& preds]
  (= [false true] preds))
(defn can-free-prisoner? [knight-awake?
                          archer-awake? 
                          prisoner-awake? 
                          dog-awake?]
  (and (not archer-awake?)
       (or dog-awake? (and prisoner-awake? 
                           (not knight-awake?)))))

