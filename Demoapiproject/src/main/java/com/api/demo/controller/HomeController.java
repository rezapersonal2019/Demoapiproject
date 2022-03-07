package com.api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.service.UserService;
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

	
	/*
	 * @RequestMapping("gitapi") public List<String> getgithubApi(){ return
	 * githubservice.githubApi(); }
	 * 
	 * @RequestMapping("jiraapi") public List<String> getjiraApi(){ return
	 * githubservice.jiraApi(); }
	 */
}
