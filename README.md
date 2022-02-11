# Component-Based-Authentication-Service

Implementation of a component-based service using java's EJB component model. The project has two separate modules, one
for the EJB interface and the other for using the EJB from a RESTful service.

# Steps for Project Execution

Step 1: Ensure support for maven(java SDK 1.8), wildfly(v26.0.1.Final).

Step 2: Install maven dependencies using intellij IDEA in root project, this is install the dependencies in the sub
modules. In case of other IDE or terminal, user has to manually install dependencies for each sub module.
 
Step 3: Configure wildfly and add the exploded version of the rest module (war-exploded).

Step 4: Running the server the browser will show the results in the root url.
 
# Demonstration of Reusability

Authentication is a common feature for almost any software system. In modern times token based authentication is used.
The EJB component in the project can be reused to handle token management. The EJB can generate token irrespective of
the type of data as long as the required parameter is given properly.

# Resources Used

1. Chapter 16, Software Engineering 10th Edition by Ian Sommerville
2. [https://courses.bekwam.net/public_tutorials/bkcourse_wildfly_restful_devenv.html#wildfly_runtime](https://courses.bekwam.net/public_tutorials/bkcourse_wildfly_restful_devenv.html#wildfly_runtime)
3. [https://courses.bekwam.net/public_tutorials/bkcourse_wildfly_ejb_devenv.html](https://courses.bekwam.net/public_tutorials/bkcourse_wildfly_ejb_devenv.html)