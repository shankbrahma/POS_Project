package pos.model.form;


public class ProductForm {

    private String barcode;
    public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMrp() {
		return mrp;
	}
	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	private String name;
    private Double mrp;
    private String brand;
    private String category;
    private int brandCategory;
    
	public int getBrandCategory() {
		return brandCategory;
	}
	public void setBrandCategory(int brandCategory) {
		this.brandCategory = brandCategory;
	}
}
