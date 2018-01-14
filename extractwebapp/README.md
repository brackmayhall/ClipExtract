### Disclaimer - The following code is still in a prototype phase###
## To **install** this webapp on **Vagrant VM** please see the [**extractconfig repo**](https://bitbucket.org/bmayhall/extractconfig/overview) ##
# EXTRACT.GG #
* EXTRACT.GG is a website that will display newly created video clips from Playstation, Pc, and Xbox
* [**SEE A SHORT CLIP OF THE PROTOTYPE HERE**](https://www.youtube.com/watch?v=HB0roFv9KOM)

### What is this repository for? ###
* handles the display and retrieval of ranked clips
* allows users to login through spring security
* angular modules handle simple front-end based transactions through angular services

### Technologies ###
* java8
* mongodb
* tomcat8
* gson
* spring mvc / security
* jstl (serverside rendering of spring models)
* angular (javascript framework)
* semantic-ui (css framework)

### TODO ###
- web api does not properly work on vagrant
- connect the search bar with apache SOLR
- further implement api for ajax calls
- connect commenting angular service with backend
- tweak responsive CSS (NEVER ENDING!)