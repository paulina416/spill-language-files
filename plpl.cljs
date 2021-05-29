(ns language.plpl)
;When you see "»" charachter in the source ignore text after "»"
;the character "»" indicates the context of the text.
;so "Balance»customer" means just "Balance" 
;
;Anorher important character is semicolumn ";"
;When you see semicolon everything after it will
;be invisible to the software.
;semicolons are just for comments.
;Nothing needs to be translated after a semicolon.

(def lines
  {;settings
   "General Settings" "Ustawienia"
   "Brand Name" "Nazwa firmy" ; same as "Your company" below
   "Your company / brand name" "Nazwa firmy / nazwa handlowa"
   "Company invoice name" "Nazwa firmy na fakturze"
   "Tax Authority" "Organ podatkowy" ;  country-specific governmental entity which imposes taxes
   "Tax Number" "Identyfikator podatkowy" ; this is company's Tax Identification Number which will be displayed in the invoice.
   "Invoice Address" "Adres na fakturze"
   "E-mail" "Email"
   "City" "Województwo" ; region
   "Town" "Miejscowość" ; city/town/village
   "Company Location" "Siedziba firmy"
   "Phones" "Telefony"
   "Order Status" "Status zamówienia"
   "Open" "Otwórz" ; as in: "Open this box to see inside."
   "Kapalı" "Zamknij" ; as in: "Close this box."
   "Customer Phones" "Telefony klientów"
   "Hidden" "Ukryj" ; 
   "Visible" "Pokaż"
   "Sendind SMS" "Wysyłanie SMS"
   "IVR Type" "Typ IVR"
   "Not available" "Niedostępne"
   "Repeating order" "Powtarzające się zamówienie"
   "Product amount" "Ilość produktów"
   "Language" "Język"
   "Other Settings" "Ustawienia dodatkowe"
   "User Accounts" "Konta użytkowników"
   "Delivery Zones" "Rejony dostaw" ; these zones are listed below, make sure you use the same word for "zone"
   "Brand Settings" "Ustawienia firmy"
   "API Settings" "Ustawienia API"
   "Telsam Settings" "Ustawienia Telsam" ; this is for Turkish version - just leave 'Telsam'
   "SMS Contents" "Treść SMS"
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
   "Workload" "Nakład pracy"
   "Today's orders" "Dzisiejsze zamówienia"
   "Scheduled" "Oczekujące" ; "Waiting Orders" - this is a list of fresh orders waiting to be completed
   "Overdue" "Opóźnione" ; "Overdue Orders" - these are orders which are taking longer than normal to complete
   "Completed" "Dostarczone" ; "Completed orders"
   "User: " "Użytkownik: "

   ;Navbar
   ;"User: " "Kullanıcı: "
   "Restart the app" "Restartuj aplikację"
   "Secure log-out" "Bezpieczne wylogowanie"
   "Operation" "Działanie" ; ?
   "New Account" "Nowe konto"
   "Account" "Konto"
   "Accounts" "Konta"
   "All Accounts" "Wszystkie konta"
   "Inventory" "Towary" ; all bottles, equipment, etc.
   "Storages" "Magazyny" ; this is a place where a shop keeps their bottles & equipment, like a shop or a car
   "Products" "Produkty"
   "Carriers" "Dostawcy" ; the people who deliver waters
   "Invoice" "Faktura"
   "Accountancy" "Księgowość"
   "Make a payment" "Przekaż kwotę" ; e.g. when a shop owner gives cash to the delivery man
   "Get a payment" "Pobież kwotę"
   "Reports" "Raporty" ; these are financial reports from Accountancy

   ;smartbox
   "Search" "Szukaj"
   "New Order" "Nowe zamówienie"

   ;order
   "Unassigned" "Nieprzypisane"
   "Debit" "Saldo ujemne" ; The left-hand side of an account or accounting ledger 
   "Credit" "Saldo dodatnie" ; The right-hand side of an account or accounting ledger 
   "Filters" "Filtry"
   "My orders" "Moje zamówienia"
   "Unassigned orders" "Nieprzypisane zamówienia"
   "Hide delivered" "Ukryj dostarczone zamówienia"
   "Show delviered" "Pokaż dostarczone zamówienia"
   "Details" "Szczegóły"
   ;"Products" "Ürünler"
   "Carrier" "Dostawca"
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

(def new-lines
  {;29 Apr 2021
   "Currency" "Waluta"

   ;settings
   "General Settings" "Ustawienia"
   "Brand Name" "Nazwa firmy" ; same as "Your company" below
   "Your company / brand name" "Nazwa firmy / nazwa handlowa"
   "Legal Company Name" "Nazwa firmy na fakturze" ;!FIXME
   "Tax Authority" "Organ podatkowy" ;  country-specific governmental entity which imposes taxes
   "Tax Number" "NIP" ; this is company's Tax Identification Number which will be displayed in the invoice.
   "Invoice Address" "Adres na fakturze"
   "Email" "Email" ;!FIXME
   "Region" "Województwo" ; region ;!FIXME
   "City" "Miejscowość" ; city/town/village ;!FIXME
   "Company Location" "Siedziba firmy"
   "Phones" "Telefony"
   "Delivering" "Status zamówienia" ;!FIXME
   "Open" "Otwórz" ; as in: "Open this box to see inside."
   "Close" "Zamknij" ; as in: "Close this box." ;!FIXME
   "Customer Phones" "Telefony klientów"
   "Hidden" "Ukryj" ; 
   "Visible" "Pokaż"
   "Sending SMS" "Wysyłanie SMS" ;!FIXME
   "IVR Type" "Typ IVR"
   "Not available" "Niedostępne"
   "Repeating order" "Powtarzające się zamówienie"
   "Product amount" "Ilość produktów"
   "Language" "Język"
   "Other Settings" "Ustawienia dodatkowe"
   "User Accounts" "Konta użytkowników"
   "Delivery Zones" "Rejony dostaw" ; these zones are listed below, make sure you use the same word for "zone"
   "Brand Settings" "Ustawienia firmy"
   "API Settings" "Ustawienia interfejsu"
   "Telsam Settings" "Ustawienia Telsam" ; this is for Turkish version - just leave 'Telsam'
   "SMS Contents" "Treść SMS"
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
   "Workload" "Realizacja zamówień"
   "Today's orders" "Dzisiejsze zamówienia"
   "Scheduled" "Oczekujące" ; "Waiting Orders" - this is a list of fresh orders waiting to be completed
   "Overdue" "Opóźnione" ; "Overdue Orders" - these are orders which are taking longer than normal to complete
   "Completed" "Dostarczone" ; "Completed orders"
   "User: " "Użytkownik: "

   ;Navbar
   ;"User: " "Kullanıcı: "
   "Restart the app" "Restartuj aplikację"
   "Secure log-out" "Bezpieczne wylogowanie"
   "Main" "Ekran główny" ; main screen with incoming orders ;!FIXME
   "New Account" "Nowe konto"
   "Account" "Konto"
   "Accounts" "Konta"
   "All Accounts" "Wszystkie konta"
   "Inventory" "Towary" ; all bottles, equipment, etc.
   "Storages" "Magazyny" ; this is a place where a shop keeps their bottles & equipment, like a shop or a car
   "Products" "Produkty"
   "Carriers" "Dostawcy" ; the people who deliver waters
   "Invoice" "Faktura"
   "Accountancy" "Księgowość"
   "Make a payment" "Przekaż kwotę" ; e.g. when a shop owner gives cash to the delivery man
   "Get a payment" "Pobież kwotę"
   "Reports" "Raporty" ; these are financial reports from Accountancy

   ;smartbox
   "Search" "Szukaj"
   "New Order" "Nowe zamówienie"

   ;order
   "Unassigned" "Nieprzypisane"
   "Debit" "Saldo ujemne" ; The left-hand side of an account or accounting ledger 
   "Credit" "Saldo dodatnie" ; The right-hand side of an account or accounting ledger 
   "Filters" "Filtry"
   "My orders" "Moje zamówienia"
   "Unassigned orders" "Nieprzypisane zamówienia"
   "Hide delivered" "Ukryj dostarczone"
   "Show delivered" "Pokaż dostarczone" ;!FIXME
   "Details" "Szczegóły"
   ;"Products" "Ürünler"
   "Carrier" "Dostawca"
   ;...
   ;"Account" "Abone"
   "Schedule delivery" "Zaplanuj dostawę" ;!FIXME
   "Now" "Teraz"
   "Comment" "Komentarz do zamówienia" ; a note in which you can comment on this delivery ;!FIXME
   "Addition/Discount" "Dodatkowa opłata/Rabat"
   "Total: " "Suma: "
   "Save" "Zapisz"
   ;"Close" "Zamknij"

   ;employee status
   "delivering" "realizuje dostawę"
   "on-duty" "dostępny"
   "break" "na przerwie"
   "offline" "offline"

   ;Accounts
   "Please provide a name" "Podaj imię i nazwisko" ; this message shows when someone forgets to enter name (name + surname)
   "Wrong location format" "Błąd w adresie"
   "Please provide a phone number" "Podaj numer telefonu"
   "Phone number must be 10 digits" "Numer telefonu powinien zawierać 10 cyfr" ; we will change this later for other countries
   "Account Name" "Nazwa konta"
   "Tax ID" "Identyfikator podatkowy"
   ;"Tax Authority" "Vergi Dairesi"
   ;"Invoice Address" "Fatura Adresi"
   "Account ID" "Identyfikator konta"
   "It will be assigned automatically" "Zostanie przypisany automatycznie."
   "IMPORTANT: Please don't use this area without consulting us." "UWAGA: Proszę nie korzystać z tej funkcji bez konsultacji z nami."
   "If you leave this field empty, a number will be assigned"  "Jeśli to pole pozostanie puste, zostanie przypisany numer." ;!FIXME
   "Name & Surname or Business Name" "Imię i nazwisko lub nazwa firmy"
   "Note (displayed next to the name)" "Komentarz (wyświetli się obok nazwiska)" ;!FIXME
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
   "Rented Equipment" "Pożyczony sprzęt" ;!FIXME
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
   "Name & surname" "Imię i nazwisko" ;!FIXME
   "Phone" "Telefon"
   "Color" "Kolor"
   "Status" "Status"
   "Assigned Storage" "Przypisany magazyn/samochód" ; this can be a shop or a car ;!FIXME
   "New Carrier" "Nowy dostawca"
   "Carrier:"  "Dostawca:"
   "Quick ledger record" "Krótki raport z księgi rachunkowej"

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
   "Source Storage" " "
   "Target Storage" " " ; these options are used for moving items from one storage (e.g. car) to another
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
   "Transactions Filter" "Filtruj transakcje" ;!FIXME
   "Past 5 weeks" "Ostatnie 5 tygodni"
   "Filtered Transactions" "Filtreli sonuçlar" ;!FIXME
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
   "Aug" "08." ;!FIXME
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