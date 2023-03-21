(ns smallest-multiple.core)

;; 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

;; What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

;; THIS SOLUTION IS TERRIBLY INEFFICIENT. TAKES UPWARDS OF 30secs to run on decently modern hardware

(defn is-divisble-by [a b]
  (zero? (mod a b)))

(defn is-answer? [x]
  (every? #(is-divisble-by x %) (range 2 21)))

(defn -main
  "Smallest number that is evenly divisble by all numbers up to 20"
  []
  (println
    (loop [x 2]
      (if (is-answer? x)
        x
      (recur (inc x))))))
