(ns even-fibonacci-numbers.core
  (:gen-class))

;; Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
;; By starting with 1 and 2, the first 10 terms will be:

;; 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

;; By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

(def LIMIT 4000000)

(defn fibonacci [limit]
  (loop [a 1, b 1, acc [1]]
    (if (> (last acc) limit)
      (drop-last acc)
      (recur b (+ a b) (conj acc b))
    )
  )
)

(defn -main
  "Sum even Fibonacci numbers below limit of 4_000_000"
  [& args]
  (println
    (->>
      (fibonacci LIMIT)
      (filter even?)
      (reduce +)
    )
  )
)
