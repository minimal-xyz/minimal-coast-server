
(ns app.main
  (:require [coast.core :as coast]))

(defn home [request]
  (coast/ok "Hello World"))

(def app (-> (coast/get "/" home)
             (coast/match-routes)))


(defn -main []
  (coast/start-server app {:port 3000})
  (println "listening on 3000..."))