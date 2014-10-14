(defproject factual/s3-journal "0.1.1-SNAPSHOT"
  :description "Reliable, high-throughput journalling to S3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]]}}
  :dependencies [[com.amazonaws/aws-java-sdk "1.9.0" :exclusions [commons-codec]]
                 [factual/durable-queue "0.1.2"]
                 [org.clojure/tools.logging "0.3.1"]
                 [byte-streams "0.2.0-alpha1"]
                 [byte-transforms "0.1.3"]]
  :jvm-opts ^:replace ["-server" "-Xmx8g"]
  :global-vars {*warn-on-reflection* true})
