(ns exercism_clj.anagram
  (:require [clojure.string :as str :refer [lower-case]]))

(def remap-str (comp sort str/lower-case))

(defn equal-as? [map-fn a b]
  (= (map-fn a) (map-fn b)))

(defn anagram? [w an]
  (and (equal-as? remap-str w an)
       ((complement equal-as?) str/lower-case w an)))

(defn anagrams-for [w l]
 (filter #(anagram? w %) l))

