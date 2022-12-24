(ns exercism-clj.log-levels
  (:require [clojure.string :as str]))


(defn log-map-info [log-message]
  (let [[log-level log-body] (->> (str/split log-message #":")
                                  (map #(re-find #"\w[\w ]+\w" %)))]
    {:level (str/lower-case log-level) :body log-body}))

(def message (comp :body log-map-info))
(def log-level (comp :level log-map-info))
(defn reformat-log [log-message]
  (format "%s (%s)" (message log-message) (log-level log-message)))



