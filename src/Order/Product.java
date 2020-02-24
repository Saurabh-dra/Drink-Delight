package Order;

import java.util.Date;

public class Product {

	private String ProductName;
	private String SupplierID;
	private String WarehouseID;
	private String OrderID;
	private double PricePerUnit;
	private int Quantity;
	Date ExitDate, ExpiryDate, ManufactureDate;

	@Override
	public String toString() {
		return "Product [ProductName=" + ProductName + ", PricePerUnit=" + PricePerUnit + 
				", Quantity=" + Quantity + ", ExitDate=" + ExitDate + "]";
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(String supplierID) {
		SupplierID = supplierID;
	}

	public String getWarehouseID() {
		return WarehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		WarehouseID = warehouseID;
	}

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public double getPricePerUnit() {
		return PricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		PricePerUnit = pricePerUnit;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public Date geExitDate() {
		return ExitDate;
	}

	public void setExitDate(Date exitDate) {
		ExitDate = exitDate;
	}

	public Date getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}

	public Date getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		ManufactureDate = manufactureDate;
	}

}
