(ns exercism_clj.allergies)


(def allergies-map {1 :eggs
                    2 :peanuts
                    4 :shellfish
                    8 :strawberries
                   16 :tomatoes
                   32 :chocolate
                   64 :pollen
                  128 :cats})

(defn allergies [n]
  (map val (filter #(> (bit-and n (key %)) 0) allergies-map)))

(defn allergic-to? [n a]
  (some? (some (set a) (allergies n))))
  
    
