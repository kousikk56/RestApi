package com.skcet.day6.Model;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Entity
@Table(name="Foodportal")
public class TransientModel {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int custno;
		
		private String foodName;
		@Transient
		private int price;
		
		public int getCustNo() {
			return custno;
		}
		public void setCustNo(int custno) {
			this.custno=custno;
	
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		@Transient
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
}