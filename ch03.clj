(defn random-ints "Returns a lazy seq of random integers in the range [0, limit)." [limit] (lazy-seq (println "realizing random number") (cons (rand-int limit) (random-ints limit))))

(take 10 (random-ints 50))

(def rands (take 10 (random-ints 50)))

(first rands)

(nth rands 3)

(count rands)