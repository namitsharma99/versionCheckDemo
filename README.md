# versionCheckDemo
a small sample code to share the shortcuts that can be used in day to day coding, wherever versions are involved

It contains 3 scenarios - 

Part 1 - Generalize the version numbers to a standard format - a.b.c
Part 2 - Get the main digit representing the version number 
Part 3 - Comparing the versions, under the format a.b.c 

When the code is run, the output illustrates the working and the steps become clearer.
Try it out!

 >> Part 1 - Generalize the version numbers to a standard format - a.b.c
incoming >> 1.1
outgoing >> 1.1.0
---------------
incoming >> 1.1.1
outgoing >> 1.1.1
---------------
incoming >> 1
outgoing >> 1.0.0
---------------
 >> Part 2 - Get the main digit representing the version number 
Incoming >> 1.0.1
Success! outgoing >> 1
---------------
Incoming >> 54.1
Success! outgoing >> 54
---------------
Incoming >> 100
Success! outgoing >> 100
---------------
Incoming >> 100.c.c
error!
---------------
Incoming >> 100.cc.&@!#$$
error!
---------------
 >> Part 3 - Comparing the versions, under the format a.b.c 
Min Version - 2.5.5
You provided - 2.3
Version Rejected!
---------------
Min Version - 2.5.5
You provided - 2.7.9
Version Accepted!
---------------
