(ns exercism_clj.reverse-string
  (:require [clojure.string :as str :refer [reverse]]))


(def reverse-string (partial str/reverse))

(reverse-string "ciao")
