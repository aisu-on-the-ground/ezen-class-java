package ezen0815_Generic.sec07.exam01_generic_extends_implements;

public class ChildProduct<T, M, C> extends Product<T, M> {
	   // 부모가 제네릭이면 자식도 제네릭이다
	
	
	   private C company;
	   public C getCompany() { return this.company; }
	   public void setCompany(C company) { this.company = company; }
	  
}

