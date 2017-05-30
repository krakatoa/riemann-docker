(let [index (index)]
  (streams
    (default :ttl 60
      (where (service "test")
        #(info %))
      )))
