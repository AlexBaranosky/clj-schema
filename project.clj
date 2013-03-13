(defproject org.clojars.runa/clj-schema "0.8.6"
  :min-lein-version "2.0.0"
  :description "Map schema definitions and validation library."
  :url "https://github.com/runa-dev/clj-schema"
  :mailing-list {:name "Clj-schema Google Group"
                 :subscribe "https://groups.google.com/forum/?fromgroups#!forum/clj-schema"}
  :license {:name "MIT License"
            :url "http://mit-license.org/"}
  :profiles {:user {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :dev {:dependencies [[jonase/kibit "0.0.3"]
                                  [slamhound "1.3.0"]
                                  [org.clojure/tools.trace "0.7.3"]]
                   :plugins [[codox "0.6.4"]
                             [jonase/eastwood "0.0.2"]]}
             :1.3.0 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4.0 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5.0 {:dependencies [[org.clojure/clojure "1.5.0-RC4"]]}}
  :aliases {"run-tests" ["with-profile" "1.3.0:1.4.0:1.5.0" "test"]
            "slamhound" ["run" "-m" "slam.hound"]}
  :codox {:src-dir-uri "https://github.com/runa-dev/clj-schema/blob/master"
          :src-linenum-anchor-prefix "L"
          :exclude [clj-schema.internal.utils]})
