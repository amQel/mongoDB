# mongoDB

## Autor : Aleksander Zdybel


### Zbudowanie projektu : 
##### git clone https://github.com/amQel/mongoDB.git
##### cd mongoDB/
##### mvn clean compile
##### import.sh
##### mvn exec:java -Dexec.mainClass="com.mkyong.core.IndexWorldCities"
### Uruchomienie projektu :

#### Insert : 
mvn exec:java -Dexec.mainClass="com.mkyong.core.Insert"

#### Search : 
mvn exec:java -Dexec.mainClass="com.mkyong.core.SearchByParams" -Dexec.args="PARAM_NAME PARAM_PROPERTY_WITH_PARAM_SEARCH_VALUE"
#### Search example:
mvn exec:java -Dexec.mainClass="com.mkyong.core.SearchByParams" -Dexec.args="City =Gdansk Latitude <55"

#### Reset :

mvn exec:java -Dexec.mainClass="com.mkyong.core.Reset"
