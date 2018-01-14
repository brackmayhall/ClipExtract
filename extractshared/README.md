### Disclaimer - The following code is still in a prototype phase###
## To **install** this webapp on **Vagrant VM** please see the [**extractconfig repo**](https://bitbucket.org/bmayhall/extractconfig/overview) ##
# EXTRACT.GG #
* EXTRACT.GG is a website that will display newly created video clips from Playstation, Pc, and Xbox
* [**SEE A SHORT CLIP OF THE PROTOTYPE HERE**](https://www.youtube.com/watch?v=HB0roFv9KOM)

### What is this repository for? ###
* the shared codebase between the mining repo and the webapp repo
* handles utility functions and serialization/deserialization of models
* contains microsoft headless login code
* contains ranking algorithms (zscore, rolling standard deviations, rolling mean, etc)

### TODO ###
- finish commenting
- resolve the Microsoft login refresh issue after "x" time

### Technologies ###
* java7
* mongodb
* gson