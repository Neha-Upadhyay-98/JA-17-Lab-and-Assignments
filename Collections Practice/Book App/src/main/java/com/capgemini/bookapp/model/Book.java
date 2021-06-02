package com.capgemini.bookapp.model;

import com.capgemini.bookapp.exceptions.BookIDCannotBeNegative;
import com.capgemini.bookapp.exceptions.BookNameCannotBeNull;
import com.capgemini.bookapp.exceptions.PriceIsNotValidException;

public class Book {
	
	private int bid;
	private String bname;
	private double price;
	public Book() {
		super();
	}
	public Book(int bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	public void validateBookName() throws BookNameCannotBeNull {
		// TODO Auto-generated method stub
			if(this.bname.isEmpty()){
				throw new BookNameCannotBeNull("book name can't be null");
			}
	}
	public void validateBookId() throws BookIDCannotBeNegative {
		// TODO Auto-generated method stub
			if(this.bid<0){
				throw new BookIDCannotBeNegative("book id can't be negative");
			}
	}
	public void validateBookPrice() throws PriceIsNotValidException {
		// TODO Auto-generated method stub
			if(this.price<=0){
				throw new PriceIsNotValidException("book price can't be null");
			}
		}
	
}
