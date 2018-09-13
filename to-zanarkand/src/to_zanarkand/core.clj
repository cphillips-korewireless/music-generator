(ns to-zanarkand.core
  (:require [edna.core :as edna]))

(def music
  ; a work in progress start of To Zanarkand 
  [:midi-acoustic-grand-piano {:octave 4
                               :tempo 90}
   
   1/4 #{:e :b :-e} :e :g :b
   1/4 #{:d :+e} :+f#
   1/4 #{:g :c} :c
   1/4 #{:-d :+d :a} :d :f# :a 
   1/4 #{:c :+d} :e
   1/4 #{:f# :+b} :b
   1/4 #{:+b :c} :g
   1/4 #{:+d :+b} :c])

(defonce state (atom nil))

(defn -main []
  (swap! state edna/stop!)
  (reset! state (edna/play! music)))

; for quick development, run this project with `boot run`,
; turn on the instaREPL, and uncomment this line:

;(-main)

(defmacro build-for-cljs []
  (edna/edna->data-uri music))

