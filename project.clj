(defproject nenapu "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [incanter "1.5.5"]
                 [iota "1.1.2"]
                 [cc.artifice/clj-ml "0.3.5.1"]
                 [nz.ac.waikato.cms.weka/rotationForest "1.0.3" :exclusions [nz.ac.waikato.cms.weka/weka-dev]]
                 [incanter-gorilla "0.1.1"]]
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.4"]]
)
