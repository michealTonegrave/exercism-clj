(ns exercism_clj.etl
  (:require [clojure.string :as str]))

(defn transform [source]
  (into {}
        (for [[score letters] source
              l letters]
          [(str/lower-case l) score])))




  
