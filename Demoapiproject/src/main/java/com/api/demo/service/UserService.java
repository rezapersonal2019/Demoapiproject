package com.api.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.api.demo.model.ExternalTokens;
import com.api.demo.repository.TokenRepository;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

@Service
@Transactional

public class UserService {

	@Autowired
	private TokenRepository userRepository;

	public List<ExternalTokens> listjiratokenapi() {
		return userRepository.findAll();
	}

	public void saveUser(ExternalTokens jiratokenapi) {
		userRepository.save(jiratokenapi);
	}
    
	
	
	OkHttpClient client = new OkHttpClient();
    // code request code here
	
	/*
	 * private List<String> listgit;
	 * 
	 * public List<String> doGetRequest(String url) throws IOException {
	 * 
	 * Request request = new Request.Builder().url(url) .method("GET",
	 * null).addHeader("Authorization",
	 * "Basic cmV6YXBlcnNvbmFsMjAxOTpnaHBfM0k1c3pqTTRiNVp2YkJ3WjdnWnRFR2hjSUp1bWtWMTJCMUUz"
	 * ).build();
	 * 
	 * Response response = client.newCall(request).execute();
	 * 
	 * return listgit; }
	 */
	
	
	
	
	  public String doGetGitApi() throws IOException { Request request =
	  new Request.Builder().url("https://api.github.com/repos/rezapersonal2019/springbootjunitproject/pulls") .method("GET",
	  null).addHeader("Authorization",
	  "Basic cmV6YXBlcnNvbmFsMjAxOTpnaHBfM0k1c3pqTTRiNVp2YkJ3WjdnWnRFR2hjSUp1bWtWMTJCMUUz"
	  ).build();
	  
	  Response response = client.newCall(request).execute();
	  
	  
	  return response.body().string(); }
	 
	  
	  public String doGetJiraApi() throws IOException {
		  
		  Request request = new Request.Builder()
				  .url("https://selim22.atlassian.net/rest/api/2/issue/TP-1")
				  .method("GET", null)
				  .addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOlhsVTRiY2tNNERHZ3lRT1ByMWUzM0Q0Mw==")
				  .addHeader("Cookie", "atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_855ecc7bbf79e2c9e07c06f7bdae3c43b8fcfcd6_lin")
				  .build();
				Response response = client.newCall(request).execute();
				
				return response.body().string();
	  }
	 
		
	/*
	 * public void doGetRequest() throws IOException { Request request = new
	 * Request.Builder() .url(
	 * "https://api.github.com/repos/rezapersonal2019/springbootjunitproject/pulls")
	 * .method("GET", null) .addHeader("Authorization",
	 * "Basic cmV6YXBlcnNvbmFsMjAxOTpnaHBfM0k1c3pqTTRiNVp2YkJ3WjdnWnRFR2hjSUp1bWtWMTJCMUUz"
	 * ) .build(); Response response = client.newCall(request).execute(); }
	 */
      
    
	
}
