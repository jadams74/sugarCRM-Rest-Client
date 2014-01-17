#Java SugarClient
This is a java based RESTful client for consuming SugarCRM legacy REST services.
Posting to sugar's legacy REST Api (Sugar version 6.5.16 at the time of writing this). 6.5.16 is the REST api version
that comes out of the can in the community edition. Posting here to 6.5.16 is weird, they are multi-part form POSTS and are a bit on the tricky side.

Non-community SugarCRM versions need to be handled with different code. My understanding is that newer versions do a better job following REST.

This is a modification of the code posted here: http://www.providentcrm.com/news/being-restful-with-sugarcrm-api-and-java/
Said post used deprecated code.

## Usage
clone, then chop and hack the SugarClient to your heart,s desire. Should be enough code to get you rolling.

## Dependencies
mvn pom file includes all these:

* org.apache.httpcomponents.httpmime (4.3.1)
* com.sun.jersey.jersey-client (1.18)
* com.sun.jersey.jersey-core(1.18)
* com.sun.jersey.contribs.jersey-multipart(1.18)
* org.codehaus.jackson.jackson-mapper.asl(1.9.13)
* org.codehaus.jackson.jackson-core-asl(1.9.13)

