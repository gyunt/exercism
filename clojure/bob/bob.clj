(ns bob (:require [clojure.string :as str]))

(defn- all-caps? [x]
  (and 
    (= (str/upper-case x) x)
    (not (= (str/lower-case x) x))))

(defn- question? [x]
  (= (last x) \?))

(defn response-for [x]
  (cond
    (str/blank? x) "Fine. Be that way!"
    (all-caps? x) "Woah, chill out!"
    (question? x) "Sure."
    :else "Whatever."))
