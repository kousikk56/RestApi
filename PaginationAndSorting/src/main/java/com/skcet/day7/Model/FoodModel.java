package com.skcet.day7.Model;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
@Entity
@Table(name="Foodportal")
public class FoodModel {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int custno;
		private String custaddress;
		private int foodId;
		private String foodName;
		private int price;
		//@Transient
		private int contactnumber;
		private int quantity;
		private String address;
		public int getCustNo() {
			return custno;
		}
		public void setCustNo(int custno) {
			this.custno=custno;
		}
		public String getCustAddress() {
			return custaddress;
		}
		public void setCustAddress(String custaddress) {
			this.custaddress=custaddress;
		}
		public int getFoodId() {
			return foodId;
		}
		public void setFoodId(int foodId) {
			this.foodId = foodId;
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getContactnumber() {
			return contactnumber;
		}
		public void setContactnumber(int contactnumber) {
			this.contactnumber = contactnumber;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}