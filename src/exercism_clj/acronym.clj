(ns exercism_clj.acronym
  (:require [clojure.string :as str]))

(defn acronym [phrase]
  (->> (str/split phrase  #"\W|[a-z](?=[A-Z])")
       (map (comp str/upper-case str first))
       str/join))


