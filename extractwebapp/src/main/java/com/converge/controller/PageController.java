package com.converge.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.mongoresponse.ClipResponse;
import com.google.gson.Gson;

/**
 * Controller class used to return server side rendered pages
 * @author Brackston Mayhall
 */
@Controller
@RequestMapping("/")
public class PageController {
 
	MongoManager mongoManager;
	private Gson gson = new Gson();
	

    /**
     * Returns the homepage
     * @param model the model to bind for server side rendering
     * @return returns the index page
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showHomepage(ModelMap model) {
    	mongoManager = MongoManager.getInstance();
    	List<ClipResponse> clips = mongoManager.getFeedClips("all", "50", null);
    	model.addAttribute("clips", clips);
        return "index";
    }
 
    /**
     * returns the watch page
     * @param model the model to bind for server side rendering
     * @param id the id of the clip to watch
     * @return the watch page
     */
    @RequestMapping(value = "/watch", method = RequestMethod.GET)
    public String showWatchPage(ModelMap model, @RequestParam(value = "id", required = true) String id) {
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
		
		model.addAttribute("clip", clip);

    	List<ClipResponse> clips = mongoManager.getFeedClips("all", "50", null);
    	model.addAttribute("clips", clips);
		
        return "watch";
    }
    

    /**
     * returns teh results page
     * @param model the model to bind for server side rendering
     * @return the results page
     */
    @RequestMapping(value = "/results", method = RequestMethod.GET)
    public String showResults(ModelMap model) {
        return "results";
    }
    
    /**
     * returns the login page
     * @return the login page
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
    
    /**
     * returns the register page
     * @param model  the model to bind for server side rendering
     * @return the register page
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegister(ModelMap model) {
        return "register";
    }
    
    //TODO: delete and fix these methods
    /*******************************
     *  THESE SHOULD BE DELETED!!!
     *  THESE ARE ONLY FOR TESTING SPRING SECURITY
     *******************************/
    @RequestMapping(value = {"/home" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "welcome";
    }
 
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "admin";
    }
     
    @RequestMapping(value = "/db", method = RequestMethod.GET)
    public String dbaPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "dba";
    }
 
    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "accessDenied";
    }
 
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }
 
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
   
}
