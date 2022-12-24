(ns exercism-clj.elyses_destructured_ench)

(defn first-card [[f]] f)

(defn second-card [[_ s]] s)

(defn discard-top-card [[f & r]] [f r])

(defn swap-top-two-cards [[f s & r]]
  (conj r f s))

(def face-card ["jack" "queen" "king"])

(defn insert-face-cards [[f & r]]
  (remove nil? (flatten [f face-card r])))












