package x.d.entity;

public class Hero {
	private Integer id;
	private String TrideName;
	private String Price;
	private String TransportWay;
	private String Payment;
	private String CustomerId;
	private String CustomerName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//TrideName
   public String getTrideName() {
			return TrideName;
    }
   public void setTrideName(String TrideName) {
			this.TrideName = TrideName;
	}
		//Price
	public String getPrice() {
			return Price;
		}
	public void setPrice(String Price) {
			this.Price = Price;
		}
		//TransportWay
	public String getTransportWay() {
			return TransportWay;
		}
    public void setTransportWay(String TransportWay) {
			this.TransportWay = TransportWay;
		}
		//Payment
	public String getPayment() {
			return Payment;
		}
    public void setPayment(String Payment) {
			this.Payment = Payment;
		}
		//CustomerId
	public String getCustomerId() {
			return CustomerId;
		}
    public void setCustomerId(String CustomerId) {
			this.CustomerId = CustomerId;
		}
	    //CustomerName
    public String getCustomerName() {
			return CustomerName;
		}
    public void setCustomerName(String CustomerName) {
			this.CustomerName = CustomerName;
		}
}
