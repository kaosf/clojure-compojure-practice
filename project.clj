(defproject compojure-practice "0.1.0-SNAPSHOT"
  :description "Compojure Practice"
  :url "https://github.com/kaosf/clojure-compojure-practice"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler compojure-practice.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
