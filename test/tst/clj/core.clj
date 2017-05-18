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
  (is= 5 (+ 2 3))

  (let [iiinc-txt    "(fn fn-iiinc [x] (+ 3 x))"
        fn-iiinc-str (eval (read-string iiinc-txt))]
    (is= 5 (fn-iiinc-str 2)))

  (let [iiinc-ast    '(fn fn-iiinc [x] (+ 3 x))
        fn-iiinc-ast (eval iiinc-ast)]
    (is= 5 (fn-iiinc-ast 2)))
)



