(ns multiples-of-3-or-5.core
  (:gen-class))

;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn -main
  "Sum all multiples of 3 or 5 below a limit of 1000"
  [& args]
  (println 
    (->>
      (range 1000)
      (filter #(or (= 0 (mod % 3)) (= 0 (mod % 5))))
      (reduce +)
    )
  )
)
