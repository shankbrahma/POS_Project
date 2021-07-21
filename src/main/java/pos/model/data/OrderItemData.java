package pos.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pos.model.form.OrderItemForm;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItemData extends OrderItemForm{
    private Integer id;
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	private Integer orderId;
}
