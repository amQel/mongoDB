# mongoDB

## Autor : Aleksander Zdybel


### Budowanie projektu : 
##### git clone https://github.com/amQel/mongoDB.git
##### cd mongoDB/
##### mvn clean compile
##### ./import.sh
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

#### git sizer result :

mongoDB$ ./git-sizer --verbose

Processing blobs: 12                        

Processing trees: 17                        

Processing commits: 6                        

Matching commits to trees: 6                        

Processing annotated tags: 0                        

Processing references: 3                        

| Name                         | Value     | Level of concern               |

| ---------------------------- | --------- | ------------------------------ |

| Overall repository size      |           |                                |

| * Commits                    |           |                                |

|   * Count                    |     6     |                                |

|   * Total size               |  2.21 KiB |                                |

| * Trees                      |           |                                |

|   * Count                    |    17     |                                |

|   * Total size               |  1.45 KiB |                                |

|   * Total tree entries       |    42     |                                |

| * Blobs                      |           |                                |

|   * Count                    |    12     |                                |

|   * Total size               |  13.8 KiB |                                |

| * Annotated tags             |           |                                |

|   * Count                    |     0     |                                |

| * References                 |           |                                |

|   * Count                    |     3     |                                |

|                              |           |                                |

| Biggest objects              |           |                                |

| * Commits                    |           |                                |

|   * Maximum size         [1] |   685 B   |                                |

|   * Maximum parents      [2] |     1     |                                |

| * Trees                      |           |                                |

|   * Maximum entries      [3] |     6     |                                |

| * Blobs                      |           |                                |

|   * Maximum size         [4] |  3.77 KiB |                                |

|                              |           |                                |

| History structure            |           |                                |

| * Maximum history depth      |     6     |                                |

| * Maximum tag depth          |     0     |                                |

|                              |           |                                |

| Biggest checkouts            |           |                                |

| * Number of directories  [3] |    12     |                                |

| * Maximum path depth     [3] |     7     |                                |

| * Maximum path length    [3] |    51 B   |                                |

| * Number of files        [3] |    10     |                                |

| * Total size of files    [3] |  12.5 KiB |                                |

| * Number of symlinks         |     0     |                                |

| * Number of submodules       |     0     |                                |



[1]  e2dcdb47d751d6775e844c186261320341ac5164

[2]  5dba6e3aee97f317656c00f87bf2a51cf7daa973 (refs/heads/master)

[3]  6016fa5c51d45375d6e0010154697dde3666c82e (refs/heads/master^{tree})

[4]  0cca4f70407a2f939e3012c86f294181379ee344 (refs/heads/master:import_values.txt)
