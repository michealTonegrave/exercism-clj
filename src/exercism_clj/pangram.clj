(ns exercism_clj.pangram
  (:use [clojure.string :only [lower-case]]))

(def alphabet (set (map char (range 97 123))))

(defn pangram? [s]
  (every? (set (lower-case s)) alphabet))
