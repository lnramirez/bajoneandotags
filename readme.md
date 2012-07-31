bajoneandotags
==========

bajoneandotags is a simple tag to encode urls on UTF-8

***

How do I use it?
----------------

    <c:set var="subject">
        <bajoneando:htmlencode value="${blogEntry.subject}"/>
    </c:set>
    <h1><a href="<c:url value="/blog/${blogEntry.id}/${subject}" />">${blogEntry.subject}</a></h1>


***

How do I build it?
-------------------------

1. `$ git clone git://github.com/lnramirez/bajoneandotags.git`
2. `$ cd bajoneandotags`
3. `$ gradle install`

