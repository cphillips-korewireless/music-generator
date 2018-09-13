(ns ffvii-aerith.core
  (:require [edna.core :as edna]))

(def music 
  ; Intro
  [[:midi-electric-grand-piano 
      {:tempo 72}
      ; 0 
      [1/8 :f# :a
        1/2 :+d
        1/8 :+c :a
        1/2 :e
        1/8 :f# :a :+d :+c# :+e :+d :b :+c#
        1/2 :a 1/2 #{:c :e}]
      ; 1
      [1/8 #{:-d :-a :e :f#} :a
        1/2 #{:f# :+d}
        1/8 #{:-e :e :+c} :a
        1/2 #{:c :e}
        1/8 #{:-d :-a :e :f#} :a :+d :+c# :+e :+d :b :+c#
        1/2 #{:-e :c :a} 1/2 #{:c :e}]]
  ; Chorus as a set of instruments for harmony
  #{[:midi-electric-grand-piano
    {:tempo 72 :octave 5}
      ; 5
      [1/8 #{:-d :-a :e :f#} :a
        1/4 #{:f# :+d} :e :d
        {:tempo 140}
        1/8 #{:-2a :c :+c} :a
        1/4 #{:c :e} :-b :-a]
      ; 7
      [1/8 :d :e #{:-d :d :f# :+d} :-a :d :-a :f# :-a
        :d :-a :-d :-a :d
        1/4 #{:d :f#}
        1/8 #{:-d :d} #{:-c# :e} #{:-2b :f#} :-f# :d :-b
        1/4 :d
        1/8 #{:-f# :-a :d :f#} :g #{:-2a :a} :-f# :c# :-a
        1/4 #{:c# :f#}
        1/8 #{:-g :d :g :b} :+c# #{:-2b :+d} :-d
        #{:-b :g :b} :-g
        1/4 :-b #{:-g :e :g}
        1/16 #{:-d :f# :a} :b
        1/8 #{:-a :a} :e :-a
        1/4 :f#]
      ; 15
      [1/8 #{:-d :a} :f# #{:-2a :c#} :-f# :-a :c# #{:-2a :+c#}
        :-f# :-a :c# #{:-2a :b} :-f# :-a :f# #{:-2a :a} :-f#]
      ; 17
      [1/8 #{:-a :b} :a #{:-2b :d} :-d :-a :-b #{:-d :b} :-a
        :-b :d #{:-d :a} :-a :-b :d
        #{:g :-d} :-a]
      ; 19
      [1/8 #{:a :-b} :f# #{:-2a :c#} :-g# :-a :c# #{:-2a :+c#}
        :-g# :-a :c# #{:b :-2a} :-g# :-a :c#
        #{:-f# :a} :-g#]
      ; 21
      [1/8 #{:-a :b} :+c# #{:-g :+d} :d :g :a :b :+d
        1/4 #{:f# :b :+d}
        1/8 :-d :-g
        1/4 #{:-b :g :+d} #{:-g :a :+c#}]
      ; 23
      [1/4 #{:-g :g :b} #{:-d :d :f# :a}
        1/8 :-d :-a #{:e :f#} :-a #{:e :f#} :-a
        :-d :-g #{:b :+d} :-d #{:a :+c#} :-d
        #{:g :b} :-d #{:-a :+c#}]
      ; 25
      [1/8 :-d
        1/4 #{:-a :+c#}
        1/8 :-2a :+f# #{:-2a :+f#} :c#
        1/4 :f#
        1/8 :-2b :-d #{:a :+c#} :-d #{:g :b} :-d
        1/4 #{:-a :+c#}
        1/2 #{:-e :d :g :a} #{:-e :d :e} #{:-2a :-g :d :e}
        1/4 #{:-2a :-a :c#}
        1/8 #{:e :d}]
      ; 27
      [1/8 #{:f# :a} #{:-g :g :b} #{:f# :a} #{:e :g}
        1/4 #{:d :f#}
        1/8 :-d :-g :-b :d :g
        1/4 :b
        1/8 #{:-g :g :b} #{:f# :a} #{:d :f#}]
      ; 31
      [1/8 #{:e :g} #{:-d :f#} :-a :d :f#
        1/2 :+d
        1/4 :+d :+c# :b]
      ; 33
      [1/2 #{:-e :d :g :a} #{:-f# :-a :c# :e}
        1/16 :e :f#
        1/8 #{:-g :g} :f# :e
        1/2 :d]
      ; 35
      [1/8 :-g :+d :b :a :+f# :+c# :b :g
        #{:-d :-a :e :f#} :a
        1/2 #{:f# :+d}]
      ; 37
      [{:tempo 156}
        1/8 #{:-2a :c :+c} :a
        1/4 #{:c :e} :-b :-a]
      ; 38
      {:tempo 80}
      [1/8 :d :e
        1/4 #{:d :-2a#} :-g
        1/8 #{:f :-a#} :e
        :d :e #{:d :-2a#} :-d :-g [1/4 :-a] :-g
        :-a# :d #{:+d :f# :d :-d} :-a :d :f# :d]]

    [:midi-string-ensemble-1
      {:tempo 72 :octave 3}
      ; 5
      [1/8 #{:-d :-a :e :f#} :a
        1/4 #{:f# :+d} :e :d
        {:tempo 140}
        1/8 #{:-2a :c :+c} :a
        1/4 #{:c :e} :-b :-a]
      ; 7
      [1/8 :d :e #{:-d :d :f# :+d} :-a :d :-a :f# :-a
        :d :-a :-d :-a :d
        1/4 #{:d :f#}
        1/8 #{:-d :d} #{:-c# :e} #{:-2b :f#} :-f# :d :-b
        1/4 :d
        1/8 #{:-f# :-a :d :f#} :g #{:-2a :a} :-f# :c# :-a
        1/4 #{:c# :f#}
        1/8 #{:-g :d :g :b} :+c# #{:-2b :+d} :-d
        #{:-b :g :b} :-g
        1/4 :-b #{:-g :e :g}
        1/16 #{:-d :f# :a} :b
        1/8 #{:-a :a} :e :-a
        1/4 :f#]
      ; 15
      [1/8 #{:-d :a} :f# #{:-2a :c#} :-f# :-a :c# #{:-2a :+c#}
        :-f# :-a :c# #{:-2a :b} :-f# :-a :f# #{:-2a :a} :-f#]
      ; 17
      [1/8 #{:-a :b} :a #{:-2b :d} :-d :-a :-b #{:-d :b} :-a
        :-b :d #{:-d :a} :-a :-b :d
        #{:g :-d} :-a]
      ; 19
      [1/8 #{:a :-b} :f# #{:-2a :c#} :-g# :-a :c# #{:-2a :+c#}
        :-g# :-a :c# #{:b :-2a} :-g# :-a :c#
        #{:-f# :a} :-g#]
      ; 21
      [1/8 #{:-a :b} :+c# #{:-g :+d} :d :g :a :b :+d
        1/4 #{:f# :b :+d}
        1/8 :-d :-g
        1/4 #{:-b :g :+d} #{:-g :a :+c#}]
      ; 23
      [1/4 #{:-g :g :b} #{:-d :d :f# :a}
        1/8 :-d :-a #{:e :f#} :-a #{:e :f#} :-a
        :-d :-g #{:b :+d} :-d #{:a :+c#} :-d
        #{:g :b} :-d #{:-a :+c#}]
      ; 25
      [1/8 :-d
        1/4 #{:-a :+c#}
        1/8 :-2a :+f# #{:-2a :+f#} :c#
        1/4 :f#
        1/8 :-2b :-d #{:a :+c#} :-d #{:g :b} :-d
        1/4 #{:-a :+c#}
        1/2 #{:-e :d :g :a} #{:-e :d :e} #{:-2a :-g :d :e}
        1/4 #{:-2a :-a :c#}
        1/8 #{:e :d}]
      ; 27
      [1/8 #{:f# :a} #{:-g :g :b} #{:f# :a} #{:e :g}
        1/4 #{:d :f#}
        1/8 :-d :-g :-b :d :g
        1/4 :b
        1/8 #{:-g :g :b} #{:f# :a} #{:d :f#}]
      ; 31
      [1/8 #{:e :g} #{:-d :f#} :-a :d :f#
        1/2 :+d
        1/4 :+d :+c# :b]
      ; 33
      [1/2 #{:-e :d :g :a} #{:-f# :-a :c# :e}
        1/16 :e :f#
        1/8 #{:-g :g} :f# :e
        1/2 :d]
      ; 35
      [1/8 :-g :+d :b :a :+f# :+c# :b :g
        #{:-d :-a :e :f#} :a
        1/2 #{:f# :+d}]
      ; 37
      [{:tempo 156}
        1/8 #{:-2a :c :+c} :a
        1/4 #{:c :e} :-b :-a]
      ; 38
      {:tempo 80}
      [1/8 :d :e
        1/4 #{:d :-2a#} :-g
        1/8 #{:f :-a#} :e
        :d :e #{:d :-2a#} :-d :-g [1/4 :-a] :-g
        :-a# :d #{:+d :f# :d :-d} :-a :d :f# :d]]}
      ; Outro  
      ; 41
      [:midi-electric-grand-piano 
      {:tempo 80}
      [1/8 :d :-a :-d :-a :d :-a :f# :-a
        1/4 :d 1/2 :-a]
      ; 43
      [1/16 :+d :d :f# :+c# :d :f#
        1/8 :b 1/2 #{:a :g :d :-e}
        #{:e :c# :-a :-f#} 1/16 :e :f#
        1/4 #{:g :-g} 1/8 #{:+f :c#} #{:+e :+c}]
      ; 45
      {:tempo 72}
      [1/8 #{:+d :b} 1/2 #{:g :-b :-g} 1/4 #{:b :d :-a} :-2a]
      ; 46
      {:tempo 66}
      [1/4 #{:+d :f# :d :-d} 1/8 :-a 1 #{:f# :e :-a :-d}]]])

(defonce state (atom nil))

(defn -main []
  (swap! state edna/stop!)
  (reset! state (edna/play! music)))

; for quick development, run this project with `boot run`,
; turn on the instaREPL, and uncomment this line:

;(-main)