(defproject nenapu "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [incanter "1.5.5"]
                 [iota "1.1.2"]
		[org.clojure/data.csv "0.1.3"]
                 ;[cc.artifice/clj-ml "0.3.5.1"]
                 [cc.artifice/clj-ml "0.6.0"]
                 [nz.ac.waikato.cms.weka/rotationForest "1.0.3" :exclusions [nz.ac.waikato.cms.weka/weka-dev]]
                 ;[incanter-gorilla "0.1.1"]]
                 [incanter-gorilla "0.1.0"]]
  :jvm-opts ["-Xmx12g"] 
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.4"]]
)
