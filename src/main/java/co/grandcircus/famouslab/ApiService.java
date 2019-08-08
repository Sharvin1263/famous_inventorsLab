package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * This ApiService plays the same role for APIs that DAOs play for databases.
 */
@Component // <- identify this as an autowirable Spring bean
public class ApiService {

	private RestTemplate restTemplate;

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--
	// right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Tiny> getTinyList() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		FamousResponse response = restTemplate.getForObject(url, FamousResponse.class);

		List<Tiny> list = response.getTiny();

		return list;
	}

	public List<Complete> getCompleteList() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		FamousResponse response = restTemplate.getForObject(url, FamousResponse.class);

		List<Complete> list1 = response.getComplete();

		return list1;
	}

}
