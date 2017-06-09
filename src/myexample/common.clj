(ns myexample.common
  (:require [riemann.streams  :refer [call-rescue]]))

(defn stream-builder
  [& children]
  (fn [e]
    (call-rescue e children)))

