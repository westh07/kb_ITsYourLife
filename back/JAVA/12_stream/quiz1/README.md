# 문제1 : Product 
다음과 같이`Product 클래스`와 `List<Product>`를 생성하고, stream api를 이용하여 해결하세요.

```java
public class Product {
	private String productName;
	private String brand;
	private String category;
	private int price;

	public Product() {
	}
	public Product(String productName, String brand, String category, int price) {
		this.productName = productName;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productName='" + productName + '\'' +
				", brand='" + brand + '\'' +
				", category='" + category + '\'' +
				", price=" + price +
				'}';
	}
}
```

```java
public class App {
	
	public static void main(String[] args) {
		List<Product> list = List.of(
		new Product("아이폰X", "apple", "전자기기류", 1000000),
		new Product("맥프로", "apple", "전자기기류", 6300000),
		new Product("베지밀", "정식품", "음료류", 1000000),
		new Product("파스타면", "de cecco", "식품류", 10000),
		new Product("LG G7", "LG", "전자기기", 700000),
		new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
		new Product("고양이", "베르나르베르베르", "도서", 15000),
		new Product("간다, 봐라", "법정스님", "도서", 8900),
		new Product("까페라떼", "디초코", "음료류", 4000),
		new Product("아포가토", "디초코", "디저트류", 4500)
	);
		//1.전자기기류만 모두 출력하세요.

		//2.apple사가 전제품 10% 할인한다고 할때, 해당제품명과 할인된 가격을 출력하세요.

		//3. 디초코 상표명이 "dechocolatecoffee"로 변경되었다. 
		 //스트림상에서 디초코 상품들의 상표명을 "dechocolatecoffee"로 변경하고 출력하세요.

		//4.금액이 십만원 이상인 상품을 따로 list로 생성하고 출력하세요.
	}
	
}
```

### 어려웠던 점
2번

할인 된 가격을 `map()`에서 `setPrice(getPrice()*0.9)`를 사용하는 것이 불가능해서 `map()`을 사용해서 새 Product 객체를 생성

3번

상표명을 변경하는 것은 쉽게 가능했지만 그것이 적용된 전체 출력은 어려웠음

스트림에서 `forEach()` 를 이용해서 `setBrand()` 을 통해 원본 객체를 직접 수정했음

이후 `forEach()` 을 이용해서 리스트를 프린트 출력 함

→ 2&3 차이

`forEach()` 는 void 반환이라 값을 가공하거나 수정하는데 적합하지만 `map()`은 값을 바꾼 새 객체를 반환해야해서 문제가 생긴 것임!

4번

스트림 결과를 리스트로 저장하려면 `.toList()` 를 사용해야함