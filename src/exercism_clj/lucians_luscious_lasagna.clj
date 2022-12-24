(ns exercism_clj.lucians_luscious_lasagna)

(def expected-time 40)
(def remaining-time #(- expected-time %))
(def prep-time #(* 2 %))
(def total-time (fn [layers minutes]
                  (+  minutes
                     (prep-time layers))))




