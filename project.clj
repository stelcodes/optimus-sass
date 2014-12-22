(defproject optimus-sass "0.0.2"
  :description "Sass/SCSS asset loader for Optimus"
  :url "http://github.com/DomKM/optimus-sass"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.jruby/jruby-complete "1.7.11"]
                 [optimus "0.15.1"]]
  :resource-paths ["deps"]
  :global-vars {*warn-on-reflection* true})
