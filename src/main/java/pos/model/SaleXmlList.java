package pos.model;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name="sales_items")
@XmlAccessorType(XmlAccessType.FIELD)
public class SaleXmlList {

    @XmlElement(name="sales_item")
    private List<SaleReportData> saleReportDataList;

	public List<SaleReportData> getSaleReportDataList() {
		return saleReportDataList;
	}

	public void setSaleReportDataList(List<SaleReportData> saleReportDataList) {
		this.saleReportDataList = saleReportDataList;
	}
}
