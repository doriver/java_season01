package webCrawling;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Jsoup를 이용해 크롤링
		
		String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0"; //크롤링할 url지정
		Document doc = null;        //Document에는 페이지의 전체 소스가 저장된다

		try {
			doc = Jsoup.connect(url).get(); // url에서 전체 구조를 받아온다
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		System.out.println(doc.data());  // ??
//		System.out.println(doc.toString()); // HTML 출력
		
		
		
		//select를 이용하여 원하는 값을 가져오기 위해 태그를 선택
		Elements element = doc.select("div.sect-movie-chart");    

		System.out.println("============================================================");

		//Iterator을 사용하여 하나씩 값 가져오기
		Iterator<Element> ie1 = element.select("strong.rank").iterator();
		Iterator<Element> ie2 = element.select("strong.title").iterator();
		        
		while (ie1.hasNext()) {
			System.out.println(ie1.next().text()+"\t"+ie2.next().text());
		}
		
		System.out.println("============================================================");

	}

}
