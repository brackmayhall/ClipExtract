// SERVICES
extractApp.service('clipService', function($http, $q ) {
  var clipService = {
    getTrendingClips: function() {
      // $http returns a promise, which has a then function, which also returns a promise
      var promise = $http.get('http://localhost:8080/ExtractWebApp/clips/all?count=50').then(function (response) {
        // The then function here is an opportunity to modify the response
        console.log(response);
        // The return value gets picked up by the then in the controller.
        return response.data;
      });
      // Return the promise to the controller
      return promise;
    },
    getReleatedClips: function(id) {
      // $http returns a promise, which has a then function, which also returns a promise
      var promise = $http.get('http://localhost:8080/ExtractWebApp/clips/all').then(function (response) {
        // The then function here is an opportunity to modify the response
        console.log(response);
        // The return value gets picked up by the then in the controller.
        return response.data;
      });
      // Return the promise to the controller
      return promise;
    },
    getSingleClipById: function(id) {
      // $http returns a promise, which has a then function, which also returns a promise
      var promise = $http.get('http://localhost:8080/ExtractWebApp/clip/'+id).then(function (response) {
        // The then function here is an opportunity to modify the response
        console.log(response);
        // The return value gets picked up by the then in the controller.
        return response.data;
      });
      // Return the promise to the controller
      return promise;
    }
  };
  return clipService;

});


extractApp.service('loggedInUserService', function($http, $q ) {
	  var likeService = {
	    likeClip: function() {
	      var likeData = {clipid: 123, userId:123456879};
	      var promise = $http.post("http://localhost:8080/ExtractWebApp/clip/like", likeData).success(function(data, status) {
	            $scope.hello = data;
	        });
	      return promise;
	    },
	    addComment: function() {
		      var likeData = {clipid: 123, userId:123456879};
		      var promise = $http.post("http://localhost:8080/ExtractWebApp/comment", likeData).success(function(data, status) {
		            $scope.hello = data;
		        });
		      return promise;
		    }
	  };
	  return likeService;

	});


// SERVICES
extractApp.service('commentService', function(){
  this.comments = [
  {
    "user_id": "123456789",
    "avatar_thumb": "static/images/photo.jpg",
    "time": "5:41PM",
    "comment_text": "blahhhh",
    "user_name": "Matt"
  },
  {
    "user_id": "123456789",
    "avatar_thumb": "static/images/photo2.jpg",
    "time": "5:42PM",
    "comment_text": "How artistic!",
    "user_name": "John"
  },
  {
    "user_id": "123456789",
    "avatar_thumb": "static/images/photo3.jpg",
    "time": "5:43PM",
    "comment": "wowza",
    "user_name": "Tim"
  },
  {
    "user_id": "123456789",
    "avatar_thumb": "static/images/photo4.jpg",
    "time": "5:44PM",
    "comment_text": "well shucks",
    "user_name": "Bobby"
  },
  {
    "user_id": "123456789",
    "avatar_thumb": "static/images/photo5.jpg",
    "time": "5:45PM",
    "comment_text": "dooooooood",
    "user_name": "Steven"
  },
  {
    "user_id": "123456789",
    "avatar_thumb": "static/images/photo6.jpg",
    "time": "5:46PM",
    "comment_text": "you suck",
    "user_name": "Luke"
  }
];

	this.getComments = function() {
		return this.comments;
	}

});

/******************************************************************
******************************************************************
******************************************************************
SEARCH CONTROLLER CONTROLLER
******************************************************************
******************************************************************
*******************************************************************/
extractApp.controller('SearchController', function ($scope) {
  $scope.clips = [];
});


/******************************************************************
******************************************************************
******************************************************************
SINGLE CLIP CONTROLLER
******************************************************************
******************************************************************
*******************************************************************/
extractApp.controller('SingleClipController', function ($scope, clipService, commentService, $sce, $timeout, loggedInUserService) {

	/******************/
	$scope.currentComment = "this is the current comment!";	
	$scope.currentClip;
	/*
	clipService.getReleatedClips().then(function(relatedClips) {
		$scope.relatedClips = relatedClips;
	});
	*/
	
	$scope.comments = commentService.getComments();

    var controller = this;
    controller.state = null;
    controller.API = null;
    controller.currentVideo = 0;

    controller.onPlayerReady = function(API) {
        controller.API = API;
		var id = getParameterByName('id'); // "lorem"
		clipService.getSingleClipById(id).then(function(d) {
			$scope.singleClip = d;

			var videoLink;
			if(d.type === 'ps') {
				videoLink = d.video_variants[832000];
			} else if (d.type === 'pc') {
				videoLink = d.video_link;
			} else if (d.type === 'ms') {
				videoLink = d.video_link;
			}

			controller.videos.push({
							sources: [
							{src: $sce.trustAsResourceUrl(videoLink),
							 type: "video/mp4",
							 poster: $sce.trustAsResourceUrl(d.thumb_link)}
							]
						});

			controller.setVideo(0);
		});
    };

	controller.onCompleteVideo = function() {
		controller.isCompleted = true;

		controller.currentVideo++;

		if (controller.currentVideo >= controller.videos.length) controller.currentVideo = 0;

		controller.setVideo(controller.currentVideo);
	};

	controller.videos = [];

	controller.config = {
		preload: "none",
		autoHide: false,
		autoHideTime: 3000,
		autoPlay: false,
		sources: null,
		theme: "static/bower_components/videogular-themes-default/videogular.css",
		plugins: {
			poster: "" // images/8-bit-loading.jpg
		}
	};

    controller.setVideo = function(index) {
        controller.API.stop();
        controller.currentVideo = index;
        controller.config.sources = controller.videos[index].sources;
        controller.config.plugins.poster = controller.videos[index].sources[0].poster;
        $timeout(controller.API.play.bind(controller.API), 100);
    };
    
    /***************click events******************/
    $scope.likeClip = function() {
    	loggedInUserService.likeClip();
        alert('liking clip');
    }
    
    $scope.addComment = function() {
    	loggedInUserService.addComment();
        alert('adding comment');
    }
    
    $scope.promptLogin = function() {
        alert('prompting login');
    }
    
});


/******************************************************************
******************************************************************
******************************************************************
TRENDING CLIPS CONTROLLER
******************************************************************
******************************************************************
*******************************************************************/
extractApp.controller('TrendingController', function ($scope, clipService, $sce) {
	// gets the trending clips
  clipService.getTrendingClips().then(function(d) {
    $scope.trendingClips = d;
  });
});


function getParameterByName(name, url) {
    if (!url) url = window.location.href;
    name = name.replace(/[\[\]]/g, "\\$&");
    var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
        results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, " "));
}
















