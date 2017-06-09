(load-plugins)

(let [index (index)]
  (streams
    (default :ttl 60

      (myexample.test/all index)
      )))
