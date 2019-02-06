(defproject rails-session-clojure "0.2.0"
  :description "Integration with Ruby on Rails encoded and signed session cookies"
  :url "https://github.com/mkwiatkowski/rails-session-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[base64-clj "0.1.1"]
                 [cheshire "5.8.1"]
                 [crypto-equality "1.0.0"]
                 [crypto-random "1.2.0"]
                 [org.clojure/clojure "1.10.0"]
                 [pandect "0.6.1"]
                 [org.bouncycastle/bcprov-jdk15on "1.60"]]
  :plugins [[codox "0.8.10"]]
  :codox {:src-dir-uri "https://github.com/mkwiatkowski/rails-session-clojure/blob/master/"
          :src-linenum-anchor-prefix "L"
          :output-dir "."})
