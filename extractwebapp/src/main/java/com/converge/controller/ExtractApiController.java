package com.converge.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.mongoresponse.ClipResponse;
import com.google.gson.Gson;

/**
 * Class that allows ajax calls
 * this will primarily be used to calls such as 
 * likes, clip counts, etc
 * @author Brackston Mayhall
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
public class ExtractApiController {

	MongoManager mongoManager;
	private Gson gson = new Gson();
		
	@RequestMapping(value = "/clips/{type}", method = RequestMethod.GET)
	public List<ClipResponse> getFeedClips(@PathVariable String type,
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "count", required = false) String count) {
		
		List<ClipResponse> clips = new ArrayList<ClipResponse>();
		
		mongoManager = MongoManager.getInstance();
		
		clips = mongoManager.getFeedClips(type, count, id);
		
		return clips;
	}
	
	@RequestMapping(value = "/clip/{id}", method = RequestMethod.GET)
	public ClipResponse getSingleClip(@PathVariable String id) {		
		mongoManager = MongoManager.getInstance();
		
		ClipResponse clip = mongoManager.getSingleClipById(id);
		Date now = new Date();
		String expireDate = clip.getExpireDate();
		if(expireDate != null) {
			long expireDateInt = Long.valueOf(expireDate);	
			if(now.getTime() >= expireDateInt) {
				if(clip.getType().equals("ms")) {
				
					String uri = ControllerUtil.recacheMsClip(clip, gson, mongoManager);
					if(uri == null) {
						// handle error here
					}
					clip.setVideoLink(uri);
				} else {
					// need to handle error
				}
			}			
		}

		return clip;
	}
	
	// @JsonView(View.Summary.class)
	@RequestMapping(path="/clip/like", method=RequestMethod.POST)
	public void likeSingleClip() {
		System.out.println("break");
	}
}

