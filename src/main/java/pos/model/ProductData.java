package pos.model;

import lombok.Data;

@Data
public class ProductData extends ProductForm{

    private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
