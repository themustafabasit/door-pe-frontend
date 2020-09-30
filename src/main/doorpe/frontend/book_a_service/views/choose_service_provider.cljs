(ns doorpe.frontend.book-a-service.views.choose-service-provider
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs-http.client :as http]
            [accountant.core :as accountant]
            [doorpe.frontend.db :as db]
            ["@material-ui/core" :refer [Grid Container Typography Card CardContent TextField Button MenuItem
                                         Select FormControl  Grid Card CardContent CardAction]]))

(defn choose-service-provider
  []
  [:> Button {:on-click #(swap! db/app-db update-in [:book-a-service] assoc :service-provider-id "alkjdflkjadl")}
   "service provider"])