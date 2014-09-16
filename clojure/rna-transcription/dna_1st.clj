(ns dna)


(defn- hi [x]
  (cond 
    (= x \G)
      \C
    (= x \C)
      \G
    (= x \T)
      \A
    (= x \A)
      \U
    :else
      (assert false)
    )
  )

(defn to-rna [x]
  (apply str 
         (for [i x]
           (hi i)))
  )
