(ns clojure-twitter-in-common.test.core
  (:use [clojure-twitter-in-common.core] :reload)
  (:use [clojure.test])
  (:use [midje.sweet])
  (:use [clojure.contrib.logging]))

(with-test
       (def carin-followers  (twitter/followers-of-name "carinmeier"))
       (def carin-cinijs-followers-in-common (followers-in-common "carinmeier" "cincijs"))
       
       (fact (< 0 (.size carin-followers)) => true)
       (fact (< 0 (.size carin-cinijs-followers-in-common)) => true)
       (fact (get-screen-name-from-id "205291621") => "cincijs"))


