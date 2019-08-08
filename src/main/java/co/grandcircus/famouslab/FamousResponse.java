package co.grandcircus.famouslab;

import java.util.List;

public class FamousResponse {

	private List<Tiny> tiny;
	private List<Complete> complete;

	public FamousResponse() {
		super();
	}

	public List<Tiny> getTiny() {
		return tiny;
	}

	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}

	public List<Complete> getComplete() {
		return complete;
	}

	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}

}