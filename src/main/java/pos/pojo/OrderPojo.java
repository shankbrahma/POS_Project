package pos.pojo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OrderPojo {

    //Generate id from 1000
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "orderIdSequence")
    @SequenceGenerator(name = "orderIdSequence",initialValue = 1000, allocationSize = 1, sequenceName = "orderId")
    private Integer id;
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public Boolean getIsInvoiceGenerated() {
		return isInvoiceGenerated;
	}
	public void setIsInvoiceGenerated(Boolean isInvoiceGenerated) {
		this.isInvoiceGenerated = isInvoiceGenerated;
	}
	private LocalDateTime datetime;
    private Boolean isInvoiceGenerated;
}
