(ns to-zanarkand.core
  (:require-macros [to-zanarkand.core :refer [build-for-cljs]]))

(defonce audio (js/document.createElement "audio"))
(set! (.-src audio) (build-for-cljs))
(set! (.-controls audio) true)
(js/document.body.appendChild audio)
(.play audio)

