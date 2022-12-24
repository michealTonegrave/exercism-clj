(ns exercism_clj.bob
  (:require [clojure.string :as str ]))

(defn is-yelling? [s] 
  (and (some #(Character/isLetter %) s)
       (= (str/upper-case s) s)))

(defn question? [s] (= (last s) \?))

(defn response-for [s]
  (let [s (str/trim s)]
  (cond
    (and (question? s) (is-yelling? s)) "Calm down, I know what I'm doing!"
    (is-yelling? s) "Whoa, chill out!"
    (question? s) "Sure."
    (str/blank? s) "Fine. Be that way!"
    :else "Whatever.")))

