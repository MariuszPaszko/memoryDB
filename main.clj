(def memory-db (atom {}))
(defn read-db [] @memory-db)
(defn write-db [new-db] (reset! memory-db new-db))
(defn add-table [table-name]
  (let [db (read-db)]
    (write-db 
      (assoc db table-name {:name [] :indexes {}}))))
 (defn drop-table [table-name]
  (let [db (read-db)]
    (write-db (dissoc db table-name))))
  