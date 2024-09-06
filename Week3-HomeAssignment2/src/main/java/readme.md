### a. What does the assertArrayEquals method do?
assertArrayEquals on JUnitissa käytettävä metodi, joka tarkistaa kahden taulukon yhtäsuuruuden. Se vertaa kahta taulukkoa elementti elementiltä ja varmistaa, että molemmat taulukot ovat yhtä pitkiä ja että molemmissa on taulukoissa on yhtä suuret elementit.
### b. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
Jos taulukot a1 ja a2 eivät ole yhtäsuuret, testi epäonnistuu ja JUnit näyttää virheilmoituksen "Should be equal", sekä tiedon siitä, missä kohtaa taulukot eroavat.
### c. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
assertArrayEquals vertailee monimutkaisia taulukoita elementti elementiltä. Taulukot ovat yhtä suuret, jos niiden alitaulukot ovat identtisiä ja samalla järjestyksellä. Jos taulukot eroavat, testi epäonnistuu ja näyttää virheilmoituksen "Should be equal".