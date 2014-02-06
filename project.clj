(defproject org.clojars.guilespi/clj-maxmind-geoip "0.1.0"
  :description "A thin wrapper around Maxmind's GeoIP Java API."
  :url "http://github.com/philc/clj-maxmind-geoip"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ; We compile-in the Maxmind Java APIs. "lein javac" to compile them.
  :java-source-paths ["vendor/maxmind_geoip_api_java/source"]
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]
                   :plugins [[lein-midje "2.0.4"]]}})
