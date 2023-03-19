(ns largest-palindrome-product.core
  (:gen-class)
  (:require [clojure.string :as lib-str]))

(defn is-palindrome? [n] 
  (= (str n) (lib-str/reverse (str n))))

(defn -main
  "I find the largest palindrome product of two three digit numbers"
  [& args]
  (println 
    (reduce max 
      (filter is-palindrome? 
        (for [i (range 100 1000) j (range 100 1000)]
          (* i j))))))
