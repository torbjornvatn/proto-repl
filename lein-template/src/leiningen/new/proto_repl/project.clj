(defproject {{ns-name}} "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 {{#include-prc}}
                 [proto-repl-charts "0.3.2"]
                 {{/include-prc}}
                 [proto-repl "0.3.1"]]
  :profiles {:dev {:source-paths ["dev" "src" "test"]
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
