package pos.pojo;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Data
@Entity
public class OrderItemPojo {

    //Generate id starting from 100000
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "orderItemIdSequence")
    @SequenceGenerator(name = "orderItemIdSequence",initialValue = 100000, allocationSize = 1, sequenceName = "orderItemId")
    private Integer id;
    private Integer quantity;
    private Double sp;
    private Integer orderId;
    private Integer ProductId;

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
		return sp;
	}

	public void setSp(Double sp) {
		this.sp = sp;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return ProductId;
	}

	public void setProductId(Integer productId) {
		ProductId = productId;
	}

	public double getRevenue() {
        return quantity*sp;
    }

}
