<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="extractApp">
<head>

  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>EXTRACT.GG</title>
  <link rel="stylesheet" type="text/css" href="static/semantic/semantic.min.css">

  <style type="text/css">

    .hidden.menu {
      display: none;
    }

    .masthead.segment {
      min-height: 390px;
      padding: 1em 0em;
    }
    .masthead .logo.item img {
      margin-right: 1em;
    }
    .masthead .ui.menu .ui.button {
      margin-left: 0.5em;
    }
    .masthead h1.ui.header {
      margin-top: 0.3em;
      margin-bottom: 0em;
      font-size: 4em;
      font-weight: normal;
    }
    .masthead h2 {
      font-size: 1.7em;
      font-weight: normal;
    }

    .ui.vertical.stripe {
      padding: 8em 0em;
    }
    .ui.vertical.stripe h3 {
      font-size: 2em;
    }
    .ui.vertical.stripe .button + h3,
    .ui.vertical.stripe p + h3 {
      margin-top: 3em;
    }
    .ui.vertical.stripe .floated.image {
      clear: both;
    }
    .ui.vertical.stripe p {
      font-size: 1.33em;
    }
    .ui.vertical.stripe .horizontal.divider {
      margin: 3em 0em;
    }

    .quote.stripe.segment {
      padding: 0em;
    }
    .quote.stripe.segment .grid .column {
      padding-top: 5em;
      padding-bottom: 5em;
    }

    .footer.segment {
      padding: 5em 0em;
    }

    .secondary.pointing.menu .toc.item {
      display: none;
    }

    @media only screen and (max-width: 700px) {
      .ui.fixed.menu {
        display: none !important;
      }
      .secondary.pointing.menu .item,
      .secondary.pointing.menu .menu {
        display: none;
      }
      .secondary.pointing.menu .toc.item {
        display: block;
      }
      .masthead.segment {
        min-height: 350px;
      }
      .masthead h1.ui.header {
        font-size: 2em;
        margin-top: 1.5em;
      }
      .masthead h2 {
        margin-top: 0.5em;
        font-size: 1.5em;
      }
    }

    .ui.input {
        width: 100%;
    }

    .ui.primary.button {
        margin-top: 20px;
    }

  </style>

  <script src="static/lib/jquery.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular-sanitize.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular-route.js"></script>

  
  <script src="static/bower_components/videogular/videogular.js"></script>
  <script src="static/bower_components/videogular-controls/vg-controls.js"></script>
  <script src="static/bower_components/videogular-overlay-play/vg-overlay-play.js"></script>
  <script src="static/bower_components/videogular-poster/vg-poster.js"></script>
  <script src="static/bower_components/videogular-buffering/vg-buffering.js"></script>

  
  <script src="static/ang/js/app.js"></script>
  <script src="static/ang/js/controllers.js"></script>
  <script src="static/semantic/semantic.min.js"></script>
  <script src="static/ang/js/search.js"></script>

  <script>
  $(document)
    .ready(function() {

      $('.ui.search')
        .search({
          apiSettings: {
            url: '//api.github.com/search/repositories?q={query}'
          },
          fields: {
            results : 'items',
            title   : 'name',
            url     : 'html_url'
          },
          minCharacters : 3
        })
      ;

      // fix menu when passed
      $('.masthead')
        .visibility({
          once: false,
          onBottomPassed: function() {
            $('.fixed.menu').transition('fade in');
          },
          onBottomPassedReverse: function() {
            $('.fixed.menu').transition('fade out');
          }
        })
      ;

      // create sidebar and attach to menu open
      $('.ui.sidebar')
        .sidebar('attach events', '.toc.item')
      ;

    })
  ;

  </script>

</head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<body ng-controller="TrendingController">

<div class="ui top fixed hidden menu">

    <div class="left menu">
      <div class="item">
        <img src="static/images/extract-logo.png">
      </div>
      <div class="item">
      <!--
        <div class="ui icon input">
          <input type="text" placeholder="Search...">
          <i class="search icon"></i>
        </div>
        -->
      <div class="ui fluid category search">
        <div class="ui icon input">
          <input class="prompt" type="text" placeholder="Search clips...">
          <i class="search icon"></i>
        </div>
        <div class="results"></div>
      </div>
      </div>
    </div>


    <div class="right menu">
		<sec:authorize access="!isAuthenticated()">
	      <div class="item">
	        <a href="login" class="ui button">Log in</a>
	      </div>
	      <div class="item">
	        <a href="register" class="ui primary button">Sign up</a>
	      </div>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
			<div class="item">
				<a href="logout" class="ui button">Log out</a>
			</div>
		</sec:authorize>
    </div>

</div>


<!-- Sidebar Menu -->
<div class="ui vertical inverted sidebar menu">
	<sec:authorize access="!isAuthenticated()">
	  <a href="login" class="item">Log in</a>
	  <a href="register" class="item">Sign up</a>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
	   <a href="logout" class="item">Log out</a>
	</sec:authorize>
</div>


<!-- Page Contents -->
<div class="pusher">

  <div class="ui inverted vertical masthead center aligned segment">

    <div class="ui container">
      <div class="ui large secondary inverted pointing menu">
        <a class="toc item">
          <i class="sidebar icon"></i>
        </a>
        <div class="right item">
			<sec:authorize access="!isAuthenticated()">
	          <a href="login" class="ui inverted button">Log in</a>
	          <a href="register" class="ui inverted button">Sign up</a>
			</sec:authorize>
			<sec:authorize access="isAuthenticated()">
			   <a href="logout" class="ui inverted button">Log out</a>
			</sec:authorize>
        </div>
      </div>
    </div>

    <div class="ui text container">
      <h1 class="ui inverted header">
        E X T R A C T . G G
      </h1>
      <h2>Dig into the gaming world.</h2>

      <div class="ui fluid category search">
        <div class="ui icon input">
          <input class="prompt" type="text" placeholder="Search clips...">
          <i class="search icon"></i>
        </div>
        <div class="results"></div>
      </div>

      <div class="ui primary button">Search clips <i class="right arrow icon"></i></div>
    </div>

  </div>

<div class="ui container">

  <br>

  <h4 class="ui header">
  <i class="line chart icon"></i>
  <div class="content">
      Trending Clips
  </div>
  </h4>

  <div class="ui divider"></div>
  <div class="ui container">
    <div class="ui four stackable cards">    
	   	<c:if test="${not empty clips}">
			<c:forEach var="clip" items="${clips}">
				<!-- <li>${clip.videoLink}</li> -->
		        <div class="ui card">
		          <a class="image" href="watch?id=${clip.id.getOid()}">
		            <img src="${clip.thumbLink}">
		          </a>
		          <div class="content">
		            <a  href="watch?id=${clip.id.getOid()}">${clip.tagline}</a>
		            <div class="meta">
		              <p>${clip.gameNamePretty}</p>
		            </div>
		          </div>
		        </div>
			</c:forEach>
		</c:if>
    </div>
  </div>
</div>

  <div class="ui inverted vertical footer segment">
    <div class="ui container">
      <div class="ui stackable inverted divided equal height stackable grid">
        <div class="three wide column">
          <h4 class="ui inverted header">About</h4>
          <div class="ui inverted link list">
            <a href="#" class="item">Contact Us</a>
          </div>
        </div>
        <div class="three wide column">
          <h4 class="ui inverted header">Services</h4>
          <div class="ui inverted link list">
            <a href="#" class="item">Banana Pre-Order</a>
            <a href="#" class="item">DNA FAQ</a>
            <a href="#" class="item">How To Access</a>
            <a href="#" class="item">Favorite X-Men</a>
          </div>
        </div>
        <div class="seven wide column">
          <h4 class="ui inverted header">Footer Header</h4>
          <p>show something interesting here	</p>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>