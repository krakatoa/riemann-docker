(ns myexample.test
  (:require [riemann.core     :refer :all]
            [riemann.index    :refer  [index]]
            [riemann.streams  :refer  :all]
            [clojure.tools.logging  :refer [info]]
            myexample.common
            riemann.common
            riemann.config)
  (:use riemann.streams))

(defn sub-metrics
  [index]

  (where (service "test")
    #(info "test-003" %)
    #(info %) index)
  )

(defn all
  [index]

  (myexample.common/stream-builder
    ;base metrics
    (sub-metrics              index)
  ))
