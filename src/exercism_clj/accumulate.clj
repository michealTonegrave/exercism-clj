(ns exercism_clj.accumulate)

(defn accumulate [fun s]
  (for [x s] (fun x)))

