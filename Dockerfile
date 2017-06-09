FROM clojure:lein-2.7.1
MAINTAINER Fernando Alonso <fedario@gmail.com>

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY project.clj .
COPY vendor /usr/src/app/vendor/
RUN lein deps

COPY src /usr/src/app/src
COPY resources /usr/src/app/resources

CMD mv "$(lein uberjar | sed -n 's/^Created \(.*standalone\.jar\)/\1/p')" /usr/lib/riemann/example-plugin.jar
