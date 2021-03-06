(defproject randomgif "0.1.0-SNAPSHOT"
  :description "RandomGIF: A Clojure library designed to fetch random GIFs."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.6.3"]
                 [compojure "1.6.0"]
                 [hiccup "1.0.5"]
                 [clj-http "3.7.0"]
                 [org.clojure/data.json "0.2.6"]]
  :main randomgif.core
  :profiles {:dev
             {:main randomgif.core/-dev-main}})
