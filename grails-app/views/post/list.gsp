<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>My Posts</title>
  </head>
  <body>
    <h1>My Posts</h1>

    <p>
      <g:link controller="post" action="edit">
        Create a new post
      </g:link>
    </p>

    <p>
      <g:link controller="comment" action="edit">
        Creat a new comment
      </g:link>
    </p>

    <g:each in="${posts}" var="post">
      <div>
          <h2>${post.title}</h2>
          <p>${post.teaser}</p>
          <p>Last Updated: ${post.lastUpdated}</p>
      </div>
      <g:link controller="post" action="view" id="${post.id}">
        View this post
      </g:link>
    </g:each>
  </body>
</html>