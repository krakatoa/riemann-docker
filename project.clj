(defproject myexample "0.1.0-SNAPSHOT"
  :description "Example Riemann plugin"
  :dependencies [ [org.clojure/clojure "1.8.0"] ]

  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles { :dev {:dependencies [  [org.clojure/clojure "1.8.0"]
                                    [riemann "0.2.13" :exclusions [org.jsoup/jsoup com.fasterxml.jackson.core/jackson-core]]] }}

  :local-repo "vendor"
  :eval-in-leiningen true)
