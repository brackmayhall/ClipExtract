### Disclaimer - The following code is still in a prototype phase###
## To **install** this webapp on **Vagrant VM** please see the [**extractconfig repo**](https://bitbucket.org/bmayhall/extractconfig/overview) ##
# EXTRACT.GG #
* EXTRACT.GG is a website that will display newly created video clips from Playstation, Pc, and Xbox
* [**SEE A SHORT CLIP OF THE PROTOTYPE HERE**](https://www.youtube.com/watch?v=HB0roFv9KOM)

### What is this repository for? ###
* the datamining portion of the website
* Reaches out to unofficial apis from Forge.gg, Microsoft, well as the standard Twitter api to datamine newly created video clips.
* Uses rolling standard deviation, rolling mean, zScore, and custom time ranking algorithm to rank newly found clips based on time and popularity
* stores newly found clips in mongodb

### Technologies ###
* java8
* mongodb
* gson
* java executor services for thread-safe manipulation

### TODO ###
- buy a windows tablet/notebook and set up miner to "push" to endpoint in tomcat for Microsoft ingestion
- break out the window execution service into separate module
- further implement ranking algorithm
- check polling intervals
- ensure shutdown works properly