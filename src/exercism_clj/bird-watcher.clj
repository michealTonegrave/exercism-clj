(ns exercism-clj.bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(def today (partial last))
(defn inc-bird [birds]
  (conj (vec (drop-last birds))
        (inc (today birds))))

(defn day-without-birds? [birds]
  (some? (some #{0} birds)))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(defn busy-days [birds]
  (->> birds 
     (filter #(>= % 5))
     (count)))

(def odd-week? (partial = [1 0 1 0 1 0 1]))




