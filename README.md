# progtech
# progTech-main a kezdeti stádium 
# Wumpusz.zip a végleges újragondolt beadandó
Ez alapján próbáltam elkészíteni
------------------------------------------------------
Wumpus világ
• Környezet: 4x4-es rács (szobák)
• A kezdőállapotban az ágens az (1,1)-en áll
• Pontosan egy szobában wumpus
• Pontosan egy szobában arany
• Minden szobában 20%
valószínűséggel csapda (de a játék
kezdete után fix)
• Az (1,1)-ben se wumpus, se verem
Szabályok
• Ha csapdába vagy wumpusba
botlunk, vesztettünk: game over
• Beavatkozások:
– Jobbra
– Balra
– Előre egy szoba
– Nyíl kilő (egy nyíl van, vagy fal vagy
wumpus állítja meg)
– Arany felvesz.
Érzékelők
• szag (ha wumpus van a szobában vagy
a szomszédban)
• szellő (csapda van a szomszédban)
• arany
• ütés (ha falba ütközünk)
• sikoly (wumpus elpusztult)
• Kiértékelés: -1 pont: minden akció, -10:
nyíl, 1000: arany.
Tények és szabályok
• Tények: a szenzorok által érzékelt információ
• Szabályok: a háttértudás (minden
amit tudunk és nem közvetlen
megfigyelésből jön).
• Tények+szabályok alapján
következtetéssel megkapjuk az
aktuális állapot legjobb leírását
• Érzékelés hibátlan + nincs kivétel a
szabályok alól
