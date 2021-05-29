(ns language.ruru)

(def lines
  {;settings
   "General Settings" "Настройки"
   "Brand Name" "Название бренда" ; same as "Your company" below
   "Your company / brand name" "Ваша компания / торговая марка"
   "Company invoice name" "Название счета-фактуры компании"
   "Tax Authority" "налоговый орган" ;  country-specific governmental entity which imposes taxes
   "Tax Number" "налоговый номер" ; this is company's Tax Identification Number which will be displayed in the invoice.
   "Invoice Address" "Адрес выставления счета"
   "E-mail" "е-мейл"
   "City" "Воеводство" ; region
   "Town" "Город" ; city/town/village
   "Company Location" "Штаб-квартира"
   "Phones" "Телефоны"
   "Order Status" "Статус заказа"
   "Open" "Открой это" ; as in: "Open this box to see inside."
   "Kapalı" "Закрой его" ; as in: "Close this box."
   "Customer Phones" "Телефоны клиентов"
   "Hidden" "Скрывать" ; 
   "Visible" "Показывать"
   "Sendind SMS" "Отправка SMS"
   "IVR Type" "Тип IVR"
   "Not available" "Недоступен"
   "Repeating order" "Повторяющийся заказ"
   "Product amount" "Количество продуктов"
   "Language" "Язык"
   "Other Settings" "Дополнительные настройки"
   "User Accounts" "Учетные записи пользователей"
   "Delivery Zones" "Регионы доставки" ; these zones are listed below, make sure you use the same word for "zone"
   "Brand Settings" "Настройки компании"
   "API Settings" "Настройки API"
   "Telsam Settings" "Настройки телсама" ; this is for Turkish version - just leave 'Telsam'
   "SMS Contents" "Содержание SMS"
   ;settings.cljs/delivery areas
   "Zone Name" "Nazwa rejonu" ; delivery zones
   "All Subscribers" "Wszyscy abonenci"
   "Red Zone" "Czerwony Rejon"
   "Blue Zone" "Niebieski Rejon"
   "Yellow Zone" "Żółty Rejon"
   "Zone" "Rejon"
   "Add" "Dodaj"
   ;"Delete" "Sil"
   "All accounts without assigned delivery area will be automatically assigned to the first one." "Konta, którym nie przypisano rejonu dostawy, zostaną przypisane do pierwszego rejonu."

   ;Right Column
   "Workload" "Нагрузка"
   "Today's orders" "Сегодняшние заказы"
   "Scheduled" "Ожидающий" ; "Waiting Orders" - this is a list of fresh orders waiting to be completed
   "Overdue" "С задержкой" ; "Overdue Orders" - these are orders which are taking longer than normal to complete
   "Completed" "Доставленный" ; "Completed orders"
   "User: " "Пользователь: "

   ;Navbar
   ;"User: " "Kullanıcı: "
   "Restart the app" "Перезапустите приложение"
   "Secure log-out" "Безопасный выход"
   "Operation" "Действие" ; ?
   "New Account" "Новый аккаунт"
   "Account" "учетная запись"
   "Accounts" "учетные записи"
   "All Accounts" "все"
   "Inventory" "Товары" ; all bottles, equipment, etc.
   "Storages" "Журналы" ; this is a place where a shop keeps their bottles & equipment, like a shop or a car
   "Products" "Продукты"
   "Carriers" "Поставщики" ; the people who deliver waters
   "Invoice" "Выставленный счет"
   "Accountancy" "Бухгалтерия"
   "Make a payment" "Пожертвовать сумму" ; e.g. when a shop owner gives cash to the delivery man
   "Get a payment" "Получите сумму"
   "Reports" "Отчеты" ; these are financial reports from Accountancy

   ;smartbox
   "Search" "Поиск"
   "New Order" "Новый порядок"

   ;order
   "Unassigned" "Не назначен"
   "Debit" "Отрицательный баланс" ; The left-hand side of an account or accounting ledger 
   "Credit" "Положительный баланс" ; The right-hand side of an account or accounting ledger 
   "Filters" "Фильтры"
   "My orders" "мои заказы"
   "Unassigned orders" "Неназначенные заказы"
   "Hide delivered" "Скрыть доставленные заказы"
   "Show delviered" "Показать выполненные заказы"
   "Details" "Подробности"
   ;"Products" "Ürünler"
   "Carrier" "Поставщик"
   ;...
   ;"Account" "Abone"
   "Schedule order" "Zaplanuj dostawę"
   "Now" "Teraz"
   "Order note" "Komentarz do zamówienia" ; a note in which you can comment on this delivery
   "Addition/Discount" "Dodatkowa opłata/Rabat"
   "Total: " "Suma: "
   "Save" "Zapisz"
   "Close" "Zamknij"

   ;employee status
   "delivering" "realizuje dostawę"
   "on-duty" "dostępny"
   "break" "na przerwie"
   "offline" "offline"

   ;Accounts
   "Please provide a name" "Podaj imię i nazwisko" ; this message shows when someone forgets to enter name (name + surname)
   "Wrong location format" "Błąd w adresie"
   "Please provide a phone number" "Podaj numer telefonu"
   "Phone number must be 10 digits" "Numer telefonu musi mieć 10 cyfr" ; we will change this later for other countries
   "Account Name" "Nazwa konta"
   "Tax ID" "Identyfikator podatkowy"
   ;"Tax Authority" "Vergi Dairesi"
   ;"Invoice Address" "Fatura Adresi"
   "Account ID" "Identyfikator konta"
   "It will be assigned automatically" "Zostanie przypisany automatycznie."
   "IMPORTANT: Please don't use this area without consulting us." "UWAGA: Proszę nie korzystać z tej funkcji bez konsultacji z nami."
   "If you leave empty a number will be assigned"  "Jeśli to pole pozostanie puste, zostanie przypisany numer."
   "Name & Surname or Business Name" "Imię i nazwisko lub nazwa firmy"
   "Note (Displays next to the name)" "Komentarz (wyświetli sie obok nazwiska)"
   "Receipt or Invoice" "Rachunek/Faktura"
   "Receipt" "Rachunek"
   ;"Invoice" "Fatura"
   "IVR Orders" "Zamówienia telefoniczne" ; IVR is a telephone ordering system - you can call this area "Telephone Orders"
   "If this is closed, the user cannot place order via IVR." "Kiedy to pole jest zamknięte, funkcja zamówień telefonicznych jest niedostępna."
   ;"Open" "Açık"
   "Closed" "Zamknięte"
   "Delivery Area" "Rejon dostaw"
   "Neighbourhood" "Osiedle"
   "Street Name" "Ulica"
   "Building" "Budynek"
   "Address Details" "Szczegóły adresu"
   "Sales Promotions" "Promocje sprzedaży"
   "Apply" "Przyznaj" ; as in: "Apply this discount"
   "Don't Apply" "Nie przyznawaj"
   "Special Discounts" "Specjalne zniżki"
   "Delivery Location" "Adres dostawy"
   ;"Phones" "Telefonlar"
   "Lent Equipment" "Pożyczony sprzęt"
   "Notes" "Komentarz" ; comments to the account
   "Archived" "Zarchiwizowane"
   "Yes" "Tak"
   "No" "Nie"
   "Invoice Information" "Informacje o fakturze"
   "Bank Account" "Konto bankowe"
   "The record has been archived!" "Ten zapis trafił do archiwum!"
   "Successfully saved!" "Zapisano!"
   "Save another record" "Zapisz kolejny zapis"
   ;"Save" "Kaydet"
   ;"New Account" "Yeni Hesap"
   ;"Account:" "Hesap"

   ; ---customertable.cljs
   "Paid back to the customer" "Zwrócone klientowi"
   "Customer paid towards debt" "Klient spłacił część kredytu"
   "Debtors" "Dłużnicy"
   "Creditors" "Wierzyciele"
   ;"Lent Equipment" "Emanet Alanlar"
   "Active Accounts" "Aktywne konta"
   "Archived Accounts" "Zarchiwizowane konta"
   ;"Account" "Abone"
   "Latest Order" "Ostatnie zamówienia"
   "Address" "Adres"
   ;"Notes" "Notlar"
   "Export" "Eksportuj"

  ;Employee.cljs
   "Plase enter a name" "Podaj imię i nazwisko" ; this is same as line 128
   "Minimum 3 characters" "Co najmniej 3 znaki"
   "Carrier Name & Surname" "Imię i nazwisko dostawcy"
   "Phone" "Telefon"
   "Color" "Kolor"
   "Status" "Status"
   "Assigned to Storage" "Przypisany magazyn/samochód" ; this can be a shop or a car
   "New Carrier" "Nowy dostawca"
   "Carrier:"  "Dostawca:"
   "Quick ledger record" "Szybki raport z księgi rachunkowej"

   ;Inventory.cljs
   "Item Name" "Nazwa produktu"
   ;"Details" "Detaylar"
   "Item Code" "Kod produktu"
   "Auto-assignment" "Automatyczne przypisanie"
   "If you leave it empty a number will be assigned" "Jeśli to pole pozostanie puste, zostanie przypisany numer"
   ;"Color" "Renk"
   "Track Returnables" "Śledź pożyczony sprzęt" ; returnables mean equipment (usually bottles) which the client must return later - you may have to use more words to describe it in your language
   "If you want to track returnables choose 'Yes'. Once it's chosen it can't be changed later!" "Jeśli chcesz śledzić sprzęt pożyczony klientom, wybierz 'Tak'. Uwaga - później nie można zmienić tej opcji."
   "Sellable Item" "Produkt na sprzedaż"
   "Nonsellable items can be tracked. Customers can't see them." "Przedmioty nieprzeznaczone do sprzedaży. Tak oznaczone przedmioty są niewidoczne dla klientów."
   "Price with VAT" "Cena z VAT"
   "VAT" "VAT"
   "Price without VAT" "Cena bez VAT"
   "Returnable" "Do zwrotu"
   "New Item" "Nowy przedmiot"
   "Item" "Przedmiot"

   ;Search 
   "Order History" "Historia zamówień"
   ;"Make a payment" "Ödeme yap"
   ;"Get a payment" "Ödeme al"
   "Edit" "Edytuj"
   ;Order history


   ;Order pop-up
   "Balance»customer" "Stan konta" ; the amount of debit/credit on an account
   "Scheduled Delivery" "Zamówienia oczekujące"
   "Notes»order" "Komentarz" ; comment on an order
   ;"Products" "Ürünler"
   "Service Fee" "Opłata za usługę"
   "Discount" "Zniżka"
   "Order ID" "Identyfikator zamówienia"
   ;"Carrier" "Plasiyer"
   ;"Unassigned" "Belirlenmedi"
   "This order is assigned to someone else." "To zamówienie jest przypisane do innego konta."

   "I have delivered the items" "Dostarczyłem/am zamówienie." ; these 3 "I have" buttons are declarations which the delivery person sends via the app to their boss
   "I have collected containers" "Odebrałem/am puste pojemniki."
   "I have collected the payment" "Odebrałem/am płatność"
   "Not enough products in the storage" "Za mało przedmiotów w magazynie"
   "Payer" "Płacący" ; the person who pays
   "Payee" "Odbiorca płatności" ; the recipient of the payment

   ;Next two lines will be recorded to storage history 
   "Order delivery" "Dostawa zamówienia"
   "Collected containers" "Odebrane pojemniki"

   "Payment Amount" "Kwota"
   "Items have been delivered" "Produkty zostały dostarczone"
   "Containers have been collected"    "Pojemniki zostały odebrane"
   "Payment has been collected" "Płatność została pobrana"

   "Cash Account" "Kasa" ; this is where cash-on-hand payments are recorded

   "Changed»order" "Zmienione"
   "Completed orders cannot be changed." "Nie można zmienić zrealizowanych dostaw."
   "Save Changes" "Zapisz zmiany"

   "Total" "Suma"
   "Total Price" "Łączna cena"

   ;phone & mixed.cljs
   "Call via IVR" "Zadzwoń przez IVR"
   "Call" "Zadzwoń"
   "Calling..." "Łączenie..."
   "Delete Record" "Usuń zapis"
   "Delete" "Usuń"
   "Cancel Deletion" "Anuluj usuwanie"
   "Wrong format" "Błędny format" ;;Update this line: "Ürünler hatalı girildi"

   ;Warehouse.cljs
   ;"Plase enter a name" "İsim girilmelidir"
   ;"Color" "Renk"
   ;"Notes" "Notlar"
   ;"Save" "Kaydet"
   ;"Notes" "Notlar"
   ;"Target Storage" "Hedef Depo"
   ;"Notes" "Notlar"
   ;"Save" "Kaydet"
   "Storage Name" "Nazwa magazynu"
   "Storage Type" "Typ magazynu"
   "Vehicle" "Pojazd"
   "Warehouse" "Skład"
   "Storage Manager" "Zarządca magazynu"
   "Source Storage" "Kaynak Depo"
   "Target Storage" "Hedef Depo" ; these options are used for moving items from one storage (e.g. car) to another
   "Source" "Miejsce początkowe" ; the initial place where something is kept
   "Target" "Miejsce docelowe" ; the place to which something is moved
   "Items" "Przedmioty"
   "Add New Storage" "Dodaj nowy magazyn"
   "Add Items" "Dodaj przedmioty"
   "Move Items" "Przenieś przedmioty"
   "Remove Items" "Usuń przedmioty"
   "Move items to another storage" "Przenieś przedmioty do innego magazynu"
   "Storage" "Magazyn"
   "Move" "Przenieś"

   ;Ledger.cljs
   ;"Source" "Kaynak"
   ;"Target" "Hedef"
   ;"Save" "Kaydet"
   "Saved" "Zapisano"
   "This area is mandatory" "To pole trzeba wypełnić" ; an area in the app where the user must write down some data
   "Please select" "Wybierz"
   "Enter the value" "Wpisz wartość"
   "Add a transaction" "Dodaj transakcję"
   "Transaction reference" "Opis transakcji" ; the description of a transaction
   "Transaction date" "Data transakcji"
   ;"Now" "Şimdi"
   "Value" "Wartość"
   "Date" "Data"
   ;"Account" "Hesap"
   "Start date" "Data początkowa"
   "End date" "Data końcowa"
   ;"Apply" "Uygula"
   "Transaction" "Transakcja"
   "Transaction Filter" "Filtruj transakcje"
   "Past 5 weeks" "Ostatnie 5 tygodni"
   "Filtered transactions" "Filtreli sonuçlar"
   "New Transaction" "Nowa transakcja"


   ;users.cljs
   ;"Carrier" "Plasiyer"
   "Username" "Nazwa użytkownika"
   "Password" "Hasło"
   "Manager" "Manager"
   "Name" "Imię"
   "User" "Użytkownik"
   "Permissions" "Dostęp" ; permissions to access certain information in the app
   "Add a new account" "Dodaj nowe konto"

   ;Time.cljs
   "January" "Styczeń"
   "February" "Luty"
   "March" "Marzec"
   "April" "Kwiecień"
   "May " "Maj"
   "June" "Czerwiec"
   "July" "Lipiec"
   "August" "Sierpień"
   "September" "Wrzesień"
   "October" "Październik"
   "November" "Listopad"
   "December" "Grudzień"

   "Jan" "01." ; if your language has abbreviations for month names, use them.
   "Feb" "02."
   "Mar" "03."
   "Apr" "04."
   "May" "05."
   "Jun" "06."
   "Jul" "07."
   "Agu" "08."
   "Sep" "09."
   "Oct" "10."
   "Nov" "11."
   "Dec" "12."

   "Monday" "Poniedziałek"
   "Tuesday" "Wtorek"
   "Wednesday" "Środa"
   "Thursday" "Czwartek"
   "Friday" "Piątek"
   "Saturday" "Sobota"
   "Sunday" "Niedziela"

   "minutes" "minuty"
   "hours" "godziny"
   "days" "dni"
   "months" "miesiące"
   "ago" "wcześniej" ; for scrolling the callendar backwards or forwards
   "later" "później"})

; END OF THE FILE
; Ignore everthing after this point

(def blocks
  {:settings-top
   [:<>
    [:h4 "Önemli Not:"]
    [:p "Türkçe içerik" [:strong " datanız kaybolur."] " Dropbox ile bağlanın"]
    [:p "Şunu kullanıyoruz " [:a {:href "https://remotestorage.io/"} "remotestorage.io"] " protokolle bağlanın."]]})