(ns language.translate
  (:require
   [re-frame.core :refer [subscribe]]
   #_[language.enus :as en]
   [language.trtr :as tr]
   [language.plpl :as pl]
   [language.ruru :as ru]
   [language.ptbr :as pt]
   [language.eses :as eses]
   [language.esmx :as esmx]))
;Regex to find texts to translate -> \(>> (".*") \)

(defn >> [text]
  (if (= "$€" text)
    (:currency (:company @(subscribe [:settings])))
    (case @(subscribe [:language])
      "tr_TR" (get tr/lines text text)
      "pl_PL" (get pl/lines text text)
      "ru_RU" (get ru/lines text text)
      "pt_BR" (get pt/lines text text)
      "es_MX" (get esmx/lines text text)
      "es_ES" (get eses/lines text text)
    ;If language not found fallback to original » for context
      (first (clojure.string/split text #"»")))))

(defn get-def [block]
  ;(get en/blocks block [:div.error "I18N ERROR"]))
  [:div.error "I18N ERROR"])

(defn |>> [block]
  (case (:language (:company @(subscribe [:settings])))
    "tr_TR" (get tr/blocks block (get-def block))
    (get-def block)))
