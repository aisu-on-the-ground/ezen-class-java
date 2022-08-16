package ezen0815_Generic.sec07.exam01_generic_extends_implements;

public class ChildProductAndStorageExample2 {
	
	public static void main(String[] args) {
	
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");
		
		StorageImpl<Tv> storage = new StorageImpl<Tv>(100);
		// 스토리지에 100대까지 저장 가능
		
		storage.add(new Tv(), 0); //0번 인덱스에 Tv객체를 저장하겠다
		Tv tv = storage.get(0); //0번 인덱스의 Tv객체를 리턴해서 Tv타입 tv변수에 저장
		
	}
}
