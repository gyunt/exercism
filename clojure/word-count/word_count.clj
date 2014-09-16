(ns word_count (:require [clojure.string :as str]))

(defn word-count [x]
  (frequencies (str/split (str/lower-case x) #"[^a-zA-Z0-9]+"))
  )
