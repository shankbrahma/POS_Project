package pos.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "inventory_items")
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryXmlList {

    @XmlElement(name="inventory_item")
    private List<InventoryReportData> inventoryReportData;

	public List<InventoryReportData> getInventoryReportData() {
		return inventoryReportData;
	}

	public void setInventoryReportData(List<InventoryReportData> inventoryReportData) {
		this.inventoryReportData = inventoryReportData;
	}
}
