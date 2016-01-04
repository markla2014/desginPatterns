package ChainOfResponsibility;

public class Request {
 public String getReuqestType() {
		return reuqestType;
	}
	public void setReuqestType(String reuqestType) {
		this.reuqestType = reuqestType;
	}
	public String getRequestContent() {
		return requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
private String reuqestType;
 private String requestContent;
 private int number;
}
