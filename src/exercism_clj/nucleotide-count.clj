(ns exercism_clj.nucleotide-count)

(def strand-map {\A 0 \T 0 \C 0 \G 0})

(defn nucleotide-counts [strand]
  (conj strand-map (frequencies strand)))

(defn count-of-nucleotide-in-strand [n s]
  (if-not (strand-map n)
    (throw (Exception. (str "Not a valid nucleotide: " n)))
    ((nucleotide-counts s) n)))
