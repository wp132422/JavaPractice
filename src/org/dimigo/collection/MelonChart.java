/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonChart
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		list.add(new Music("가", "바비"));
		list.add(new Music("Don", "Vasco"));
		list.add(new Music("100", "BlackNut"));
		System.out.println("<< 멜론 차트 >>");
		printList(list);

		list.add(1, new Music("레옹", "아이유"));
		System.out.println("<< 2위 곡 추가 >>");
		printList(list);
		System.out.println();
		
		list.set(2, new Music("겁", "송민호"));
		System.out.println("<< 3워 곡 변경 >>");
		printList(list);
		System.out.println();

		list.remove(3);
		System.out.println("<< 4위 곡 삭제 >>");
		printList(list);
		System.out.println();

		list.clear();
		System.out.println("<< 전체 리스트 삭제 >>");
		printList(list);
		System.out.println();
	}
	
	public static void printList(List<Music> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(String.format("%d. %s", i+1, list.get(i).toString()));
		}
	}

}
