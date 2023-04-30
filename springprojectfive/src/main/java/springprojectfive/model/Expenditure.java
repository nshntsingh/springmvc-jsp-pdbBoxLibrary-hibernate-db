package springprojectfive.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
	
	@Entity
	public class Expenditure {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		private int user;
		  
		private int organization;
		
		private long amount;
		
		private String expendituredate;
		
		private String purposeofdisbursement;
		
		private int expenditureType;
		
		private String createdate=new Date().toString();
		private String updatedate=new Date().toString();
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getUser() {
			return user;
		}
		public void setUser(int user) {
			this.user = user;
		}
		public int getOrganization() {
			return organization;
		}
		public void setOrganization(int organization) {
			this.organization = organization;
		}
		public long getAmount() {
			return amount;
		}
		public void setAmount(long amount) {
			this.amount = amount;
		}
		public String getExpendituredate() {
			return expendituredate;
		}
		public void setExpendituredate(String expendituredate) {
			this.expendituredate = expendituredate;
		}
		public String getPurposeofdisbursement() {
			return purposeofdisbursement;
		}
		public void setPurposeofdisbursement(String purposeofdisbursement) {
			this.purposeofdisbursement = purposeofdisbursement;
		}
		public int getExpenditureType() {
			return expenditureType;
		}
		public void setExpenditureType(int expenditureType) {
			this.expenditureType = expenditureType;
		}
		public String getCreatedate() {
			return createdate;
		}
		public void setCreatedate(String createdate) {
			this.createdate = createdate;
		}
		public String getUpdatedate() {
			return updatedate;
		}
		public void setUpdatedate(String updatedate) {
			this.updatedate = updatedate;
		}
		public Expenditure(int id, int user, int organization, long amount, String expendituredate,
				String purposeofdisbursement, int expenditureType, String createdate, String updatedate) {
			super();
			this.id = id;
			this.user = user;
			this.organization = organization;
			this.amount = amount;
			this.expendituredate = expendituredate;
			this.purposeofdisbursement = purposeofdisbursement;
			this.expenditureType = expenditureType;
			this.createdate = createdate;
			this.updatedate = updatedate;
		}
		public Expenditure() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
