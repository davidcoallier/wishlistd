(defproject wishlistd "0.1.0-SNAPSHOT"
  :description "Simple application using Clojure, Noir, ClojureScript, Jayq, 
                Fetch, Crate and Korma to handle easy creation of wishlists 
                in the browser."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [noir "1.3.0-beta2"]
                 [jayq "0.1.0-alpha3"]
                 [crate "0.1.0-alpha3"]
                 [fetch "0.1.0-alpha2"]
                 [korma "0.3.0-beta9"]
                 [postgresql "9.1-901.jdbc4"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]]
  :plugins [[lein-cljsbuild "0.1.2"]]
  :cljsbuild
    {:builds
     [{:source-path "src",
       :compiler
       {:output-dir "cljs/",
        :output-to "resources/public/cljs/cljs.js",
        :optimizations :simple,
        :pretty-print true}}]}
  :main wishlistd.server)
