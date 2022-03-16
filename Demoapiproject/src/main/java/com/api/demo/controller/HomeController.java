package com.api.demo.controller;

//import java.util.List;

//import java.io.Exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.service.UserService;
//import com.squareup.okhttp.MediaType;
import com.api.demo.model.ExternalTokens;

@RestController
@RequestMapping("/token")
public class HomeController {

	@Autowired
	UserService userService;

	@PostMapping("/jira")
	public void JiraTokenSetup(@RequestBody ExternalTokens user) {
		userService.saveUser(user);
	}

	@PostMapping("/git")
	public void GitHubTokenSetup(@RequestBody ExternalTokens user) {
		userService.saveUser(user);
	}

	@PostMapping("/gitlab")
	public void GitlabTokenSetup(@RequestBody ExternalTokens user) {
		userService.saveUser(user);
	}

	@PostMapping("/bitbucket")
	public void BitBucketTokenSetup(@RequestBody ExternalTokens user) {
		userService.saveUser(user);
	}

	@RequestMapping("/gitapi")
	public String getGitHubApi() throws Exception {
		return userService.doGetGitApi();
	}

	@RequestMapping("/jiraapi")
	public String getJiraApi() throws Exception {
		return userService.doGetJiraApi();
	}
	
	// Get all project in borad
	
	@RequestMapping("/allprojectinborad")
	public String getAllProject() throws Exception {

		return userService.doGetAllProject();
	}

	// Get one project in board
	@RequestMapping("/project")
	public String getProject() throws Exception {

		return userService.doGetProject();
	}
	
	
	// Get all sprint from project
	@RequestMapping("/allsprintinproject")
	public String getAllSprint() throws Exception {

		return userService.doGetAllSprint();
	}

	// Get one sprint from project
	@RequestMapping("/Onesprintinproject")
	public String getOneSprintInProject() throws Exception {

		return userService.doGetOneSprintFromProject();
	}

	
	// Get one sprint from sprints
	@RequestMapping("/onesprintInSprints")
	public String getSprintInSprints() throws Exception {

		return userService.doGetOneSprintInSprints();
	}

	// Get one issue from sprint
	@RequestMapping("/oneIssueInSprint")
	public String getIssueInSprint() throws Exception {

		return userService.doGetOneIssueInSprint();
	}

	// Get one issue from sprint Under Project
	@RequestMapping("/oneissueInSprintInproject")
	public String getOneIssueInSprintInProject() throws Exception {

		return userService.doGetOneIssueInSprintfromProject();
	}
	
	// Get all issue from sprint in one project
	@RequestMapping("/allissueInSprintInproject")
	public String getAllIssueInSprintInProject() throws Exception {

		return userService.doGetAllIssueInSprintfromProject();
	}

	/*
	 * @RequestMapping("gitapi") public List<String> getgithubApi(){ return
	 * githubservice.githubApi(); }
	 * 
	 * @RequestMapping("jiraapi") public List<String> getjiraApi(){ return
	 * githubservice.jiraApi(); }
	 */
}
