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
      <title>Homepage - Semantic</title>
      <link rel="stylesheet" type="text/css" href="static/semantic/semantic.min.css">
      <link rel="stylesheet" type="text/css" href="static/node_modules/video.js/dist/video-js.min.css">
      
      <style>
         @media only screen and (max-width: 767px) {
         }
         #main {
         	margin-top: 5em;
         }
         videogular, [videogular] {
	         padding-bottom: 50px;
	         height: auto !important
         }
         #main {
         	background: #f1f1f1;
         }
         
         #infoBox{
       	    padding-top: inherit;
         }

		/*Important: THIS IS SO LINK ITEMS ARE CLICKABLE AS DIVS*/
		.link-spanner{
		  position:absolute; 
		  width:100%;
		  height:100%;
		  top:0;
		  left: 0;
		  z-index: 1;
		
		  /* edit: fixes overlap error in IE7/8, 
		     make sure you have an empty gif 
		  background-image: url('empty.gif');*/
		} 

         
      </style>
      <script src="static/lib/jquery.min.js"></script>
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
         
           })
         ;
         
      </script>
   </head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
   <body ng-controller="SingleClipController as controller">
      <div class="ui fixed menu">
         <div class="left menu">
            <div class="item">
               <img src="static/images/extract-logo.png">
            </div>
            <div class="item">
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
               <a href="register" class="ui primary button">Sign Up</a>
            </div>
		</sec:authorize>
   		<sec:authorize access="isAuthenticated()">
            <div class="item">
               <a href="logout" class="ui button">Log out</a>
            </div>
		</sec:authorize>         
         </div>
      </div>
      <div id="main">
      <!-- 
      <div class="ui segment">
  <div class="ui left rail">
    <div class="ui segment">
      Left Rail Content
    </div>
  </div>
  <div class="ui right rail">
    <div class="ui segment">
      Right Rail Content
    </div>
  </div>
  <p></p>
  <p></p>
</div>
-->
		
         <div class="ui stackable grid">
             <div class="one wide computer only column">
               
            </div>
            <div class="nine wide column">
            

  <!-- 
     <video id="my-video" class="video-js" controls preload="auto" 
  poster="http://images-eds.xboxlive.com/image?url=dfiDK7JY.OOtUOcd3g3Q0.faxF848eDkPAR5U6Libsg47BVpBYmnDEmiuZAgZ16Dxh8tEAQwgGo_DEYIi51bURCSf9plUcvDaPZRwM72Fqn.dmMZULEGAmT9FgsjYneP6IE_xtLLi2idjvGaGyZsdh6E2zWT1H.DkVegOy0qpwSot4ygGs8FG7WV6bA0bbkO" data-setup="{}">
	  <source src="http://gameclipscontent-d3008.xboxlive.com/000900000493d25c-94252494-e4e8-4225-90b6-eda8cfc63708/GameClip-Original.MP4?sv=2014-02-14&sr=c&sig=4BxKpP3uAr9FLpYlgJJtv%2Bi%2FILAJ6k099EEG%2B5nDgSw%3D&st=2016-06-20T23%3A15%3A28Z&se=2016-06-21T00%3A20%3A28Z&sp=r&__gda__=1466468428_bbd631ad7b1d2bcf0501dd302dcff3e7" type="video/mp4">
    <p class="vjs-no-js">
      To view this video please enable JavaScript, and consider upgrading to a web browser that
      <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
    </p>
  </video>
 -->



            

               <videogular vg-player-ready="controller.onPlayerReady($API)" vg-complete="controller.onCompleteVideo()" vg-theme="controller.config.theme">
                  <vg-media vg-src="controller.config.sources"
                     vg-tracks="controller.config.tracks">
                  </vg-media>
                  <vg-controls>
                     <vg-play-pause-button></vg-play-pause-button>
                     <vg-time-display>{{ currentTime | date:'mm:ss':'+0000' }}</vg-time-display>
                     <vg-scrub-bar>
                        <vg-scrub-bar-current-time></vg-scrub-bar-current-time>
                     </vg-scrub-bar>
                     <vg-time-display>{{ timeLeft | date:'mm:ss':'+0000' }}</vg-time-display>
                     <vg-volume>
                        <vg-mute-button></vg-mute-button>
                        <vg-volume-bar></vg-volume-bar>
                     </vg-volume>
                     <vg-fullscreen-button></vg-fullscreen-button>
                  </vg-controls>
                  <vg-overlay-play></vg-overlay-play>
                  <vg-poster vg-url='controller.config.plugins.poster'></vg-poster>
               </videogular>


               <div id="infoBox" class="ui one column grid">
                  <div class="column">
                     <div class="ui fluid card">
                        <div class="content">
                           <div class="header">{{singleClip.tagline}}</div>
                           <div class="description">
                              <p>{{singleClip.game_name_pretty}}</p>
                           </div>
                        </div>
                        <div class="extra content">

                           <div class="ui mini statistic left floated">
							  <div class="value">
							    2,204
							  </div>
							  <div class="label">
							    Views
							  </div>
							</div>

                           <span class="right floated like">
                      		<sec:authorize access="!isAuthenticated()">
								<i class="like icon" ng-click="promptLogin()"></i>Like (not logged in)
							</sec:authorize>
                      		<sec:authorize access="isAuthenticated()">
								<i class="like icon" ng-click="likeClip()"></i>Like
							</sec:authorize>							
                           </span>
                                                                                                          

                           
                        </div>
                     </div>
                  </div>
               </div>           

               <div class="ui segment">
                  <div class="ui comments">
                     <h3 class="ui dividing header">Comments</h3>
                     <div class="comment" ng-repeat="comment in comments">
                        <a class="avatar">
                        <img ng-src="{{comment.avatar_thumb | trustUrl}}">
                        </a>
                        <div class="content">
                           <a class="author">{{comment.user_name}}</a>
                           <div class="metadata">
                              <span class="date">Today at {{comment.time}}</span>
                           </div>
                           <div class="text">
                              {{comment.comment_text}}
                           </div>
                           <div class="actions">
                              <a class="reply">Reply</a>
                           </div>
                        </div>
                     </div>
                     <form class="ui reply form">
                        <div class="field">
                           <textarea ng-model="currentComment"></textarea>
                        </div>
                        <sec:authorize access="!isAuthenticated()">
	                        <div class="ui blue labeled submit icon button" ng-click="promptLogin()">							
								<i class="icon edit"></i> Add Reply                           
	                        </div>
						</sec:authorize>                        
                        <sec:authorize access="isAuthenticated()">
	                        <div class="ui blue labeled submit icon button" ng-click="addComment()">							
								<i class="icon edit" ></i> Add Reply                           
	                        </div>
						</sec:authorize>						
                     </form>
                  </div>
               </div>
               
            </div>
            
            
            <!-- 
            
            						<sec:authorize access="!isAuthenticated()">
								<i class="icon edit" ng-click="promptLogin()"></i> Add Reply (not logged in)
							</sec:authorize>
             -->
            <div class="five wide column">
            	<div class="ui segment">
            	<!--
	   				<c:if test="${not empty clips}">
						<c:forEach var="clip" items="${clips}">
							${clip.id.getOid()}
							<div class="ui divider"></div>
						</c:forEach>
					</c:if>
					-->
					
					<div class="ui divided items">

	   				<c:if test="${not empty clips}">
						<c:forEach var="clip" items="${clips}">
						
						  <div class="item">
						    <div class="ui small image">
						    <a href="watch?id=${clip.id.getOid()}">
						      <img src="${clip.getThumbLink()}">
						      </a>
						    </div>
						    <div class="middle aligned content">
						      <a href="watch?id=${clip.id.getOid()}" class="header">${clip.getGameNamePretty()}</a>
						      <div class="meta">
						      <a href="watch?id=${clip.id.getOid()}">${clip.getTagline()}</a>

						      </div>
						    </div>
						  </div>
  
  
  
						</c:forEach>
					</c:if>


					</div>
					
            	</div>
            </div>
         </div>
         
      </div>
   </body>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular-sanitize.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular-route.js"></script>
	<!-- 
   <script src="static/node_modules/video.js/dist/video.min.js"></script>
	-->
    
   <script src="static/bower_components/videogular/videogular.js"></script>
   <script src="static/bower_components/videogular-controls/vg-controls.js"></script>
   <script src="static/bower_components/videogular-overlay-play/vg-overlay-play.js"></script>
   <script src="static/bower_components/videogular-poster/vg-poster.js"></script>
   <script src="static/bower_components/videogular-buffering/vg-buffering.js"></script>
   
   <script src="static/ang/js/app.js"></script>
   <script src="static/ang/js/controllers.js"></script>
   <script src="static/semantic/semantic.min.js"></script>
   <script src="static/ang/js/search.js"></script>
</html>