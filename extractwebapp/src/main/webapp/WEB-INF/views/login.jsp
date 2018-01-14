<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>Login Example - Semantic</title>
  <link rel="stylesheet" type="text/css" href="static/semantic/semantic.min.css">

  <script src="static/lib/jquery.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular-sanitize.js"></script>
  <script src="static/semantic/semantic.min.js"></script>

  <style type="text/css">
   /* 2185d0 */
    body {
      background-color: #ffffff;
    }
    body > .grid {
      height: 100%;
    }
    .image {
      margin-top: -100px;
    }
    .column {
      max-width: 450px;
    }
  </style>
  <script>
  $(document)
    .ready(function() {
      $('.ui.form')
        .form({
          fields: {
            email: {
              identifier  : 'email',
              rules: [
                {
                  type   : 'empty',
                  prompt : 'Please enter your e-mail'
                },
                {
                  type   : 'email',
                  prompt : 'Please enter a valid e-mail'
                }
              ]
            },
            password: {
              identifier  : 'password',
              rules: [
                {
                  type   : 'empty',
                  prompt : 'Please enter your password'
                },
                {
                  type   : 'length[6]',
                  prompt : 'Your password must be at least 6 characters'
                }
              ]
            }
          }
        })
      ;
    })
  ;
  </script>
</head>
<body>

<div class="ui middle aligned center aligned grid">
  <div class="column">
    <h2 class="ui blue image header">
      <img src="static/images/extract-logo.png" class="image">
      <div class="content">
        Log-in to your account
      </div>
    </h2>
    <c:url var="loginUrl" value="/login" />
    <form class="ui large form" action="${loginUrl}" method="post">
      <c:if test="${param.error != null}">
          <div class="alert alert-danger">
              <p>Invalid username and password.</p>
          </div>
      </c:if>
      <c:if test="${param.logout != null}">
          <div class="alert alert-success">
              <p>You have been logged out successfully.</p>
          </div>
      </c:if>
    
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input type="text" id="username" name="ssoId" placeholder="E-mail address" required>
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="lock icon"></i>
            <input type="password" id="password" name="password" placeholder="Password">
            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
          </div>
        </div>
		<div class="form-actions">
		<input type="submit" class="ui fluid large primary submit button" value="Login">
		</div>
      </div>

      <div class="ui error message"></div>

    </form>

    <div class="ui message">
      New to us? <a href="register">Sign Up</a>
    </div>
  </div>
</div>

</body>

</html>
