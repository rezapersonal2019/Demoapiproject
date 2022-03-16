package com.api.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.demo.model.ExternalTokens;
import com.api.demo.repository.TokenRepository;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

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

	public String doGetGitApi() throws IOException {
		Request request = new Request.Builder()
				.url("https://api.github.com/repos/rezapersonal2019/springbootjunitproject/pulls").method("GET", null)
				.addHeader("Authorization", "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").build();

		Response response = client.newCall(request).execute();

		return response.body().string();

	}

	// Get issue in project
	public String doGetJiraApi() throws IOException {

		Request request = new Request.Builder().url("https://selim22.atlassian.net/rest/api/2/issue/TP-1")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOlhsVTRiY2tNNERHZ3lRT1ByMWUzM0Q0Mw==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_855ecc7bbf79e2c9e07c06f7bdae3c43b8fcfcd6_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();

	}

	// Get all project in borad

	public String doGetAllProject() throws IOException {

		Request request = new Request.Builder().url("https://selim22.atlassian.net/rest/api/3/project/search")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOjZuWVhoc1ZyVlFTdnk5cnpLemJQOUQwNQ==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_8e6ae7eecf627022c5ad0e21278fca9da9add903_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

	// Get one project in board
	public String doGetProject() throws IOException {

		Request request = new Request.Builder().url("https://selim22.atlassian.net/rest/api/3/project/BEST")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOm9JeWdtZ3N6SmYwV0dHV09KaXVZMDFDNQ==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_cfec745e5e43bc62117da6c5f6922f2f98406a06_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

	// Get all sprint from project

	public String doGetAllSprint() throws IOException {

		Request request = new Request.Builder().url("https://selim22.atlassian.net/rest/agile/1.0/board/2/sprint")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOnNYWGtVRDFkblR2NXEySGlpd1IxRTczRA==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_9eefa70507bf4cc798155055922c756f50aa1ac3_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

	// Get one sprint from project

	public String doGetOneSprintFromProject() throws IOException {

		Request request = new Request.Builder()
				.url("https://selim22.atlassian.net/rest/agile/1.0/board/2/?selectedSprint=2").method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOm9JeWdtZ3N6SmYwV0dHV09KaXVZMDFDNQ==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_dbfb85561554a1e99d92965f87733bb3f2a1ebf7_lin")
				.build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	// Get one sprint from sprints
	public String doGetOneSprintInSprints() throws IOException {

		Request request = new Request.Builder().url("https://selim22.atlassian.net/rest/agile/1.0/sprint/2")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOm9JeWdtZ3N6SmYwV0dHV09KaXVZMDFDNQ==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_2486ce4200c0f67aa1f82138dbec7205915b2096_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

	// Get one issue from sprint
	public String doGetOneIssueInSprint() throws IOException {

		Request request = new Request.Builder()
				.url("https://selim22.atlassian.net/rest/agile/1.0/sprint/2?selectedIssue=TP-3").method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOm9JeWdtZ3N6SmYwV0dHV09KaXVZMDFDNQ==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_dbfb85561554a1e99d92965f87733bb3f2a1ebf7_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

	// Get one issue from sprint Under Project
	public String doGetOneIssueInSprintfromProject() throws IOException {

		Request request = new Request.Builder()
				.url("https://selim22.atlassian.net/rest/agile/1.0/board/2/?selectedSprint=2?selectedIssue=TP-3")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOm9JeWdtZ3N6SmYwV0dHV09KaXVZMDFDNQ==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_dbfb85561554a1e99d92965f87733bb3f2a1ebf7_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

// Get all issue from sprint in one project
	public String doGetAllIssueInSprintfromProject() throws IOException {

		Request request = new Request.Builder()
				.url("https://selim22.atlassian.net/rest/agile/1.0/board/2/sprint/3/issue").method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOnNYWGtVRDFkblR2NXEySGlpd1IxRTczRA==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_30e1f95340967ba033c75ffef218f5623c5a20ce_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

}
