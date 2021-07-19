package pos.pojo;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Data
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"productId"})})
public class InventoryPojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer productId;
    private Integer quantity;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
