package pos.pojo;

import javax.persistence.*;
@Entity
public class OrderItemPojo {

    //Generate id starting from 100000
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "orderItemIdSequence")
    @SequenceGenerator(name = "orderItemIdSequence",initialValue = 100000, allocationSize = 1, sequenceName = "orderItemId")
    private Integer id;
    private Integer quantity;
    //TODO
    private Double sellingPrice;
    private Integer orderId;
    //TODO
    private Integer productId;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getSp() {
		return sellingPrice;
	}

	public void setSp(Double sp) {
		this.sellingPrice = sp;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer pId) {
		productId = pId;
	}

	public double getRevenue() {
        return quantity*sellingPrice;
    }

}
