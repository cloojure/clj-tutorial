(ns tst.clj.core
  (:use clj.core
        clojure.test
        tupelo.test)
  (:require
    [clojure.string :as str]
    [tupelo.core :as t]
    [tupelo.string :as ts]
  ))
(t/refer-tupelo)
(t/print-versions)

(dotest
  (is= 5 (+ 2 3)))



