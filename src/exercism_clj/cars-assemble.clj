(ns exercism_clj.cars-assemble)

(def cars-per-hours 221)
(defn production-rate [speed]
  (let [rate (cond
               (= speed 0) 0.0
               (< speed 5) 1.0
               (< speed 9) 0.9
               (= speed 9) 0.8
               (= speed 10) 0.77)]
    (* cars-per-hours speed rate)))

(defn working-items [speed]
  (int (quot (production-rate speed) 60)))
(working-items 8)


               
               
    
