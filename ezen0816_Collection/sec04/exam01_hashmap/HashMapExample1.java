package ezen0816_Collection.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 키값 "홍길동"이 중복. 위의 홍길동을 덮어씌우고 마지막 홍길동이 들어감
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기		
		System.out.println("\t홍길동 : " + map.get("홍길동")); // get() 메소드에 키값 넣어 찾기
		System.out.println();
		
		//객체를 하나씩 처리  ->  특히 키값을 모를 때 객체를 하나씩 반복하는 것이 유용
		Set<String> keySet = map.keySet(); // Map의 키값만 뽑아서 Set 형태로 바꾸고 저장
		Iterator<String> keyIterator = keySet.iterator(); // Set의 반복자를 이용
		while(keyIterator.hasNext()) { // 반복자로 하나씩 뽑아서 변수 key, value에 저장
		  String key = keyIterator.next();
		  Integer value = map.get(key); 
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map의 키값과 객체를 뽑아서 entrySet 형태로 바꾸고 저장
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();
		  Integer value = entry.getValue();
		  System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}

