(ns starfleets.core
  (:import (javax.swing JFrame JLabel))
  (:gen-class))

(defn -main []
  (doto (JFrame.)
    (.add (JLabel. "Starfleets"))
    (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
    (.setSize 150 40)
    (.show)))
