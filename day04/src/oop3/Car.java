package oop3;

public class Car {
	private String name;
	private String color;
	private int size;
	private int fsize;
	private int cfsize;

//	 생성자.(constructor)
	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	/*
	 * 기를을 넣는다. 기름통 보다 많이 넣으면 - 다시 주유 하세요 출력 음수 값이 들어가면 - 다시 주유 하세요 출력
	 */

	public void setCfsize(int size) {
		if (size > fsize - cfsize) {
			System.out.printf("다시 주유하세요.잔여용량은 %d 입니다.\n", fsize - cfsize);
		} else if (size < 0) {
			System.out.println("다시 주유하세요(기름양이 음수에요)");
		} else {
			System.out.printf("%d리터 만큼 기름이 들어갔어요. 현재 기름은 %d리터가 있어요 \n", size,size + cfsize);
		}
		  cfsize = size + cfsize; // 기존의 cfsize+추가로 넣은 사이즈
	}

	// 주행을 한다.
	// 1리터당 10km를 주행 할 수 있다.
	public void go(int distance) {
		if (cfsize <= 0 || cfsize < (distance / 10)) {
			System.out.printf("주유하시고 출발하세요~ %s리터 만큼기름이 모잘라요.", -(cfsize - (distance / 10)));
			return;
		} else {
			System.out.println("출바알!!!");
			cfsize = cfsize- (distance / 10);
			System.out.printf("잔여기름은 %d 입니다.",cfsize);
		}
	}// void go 끝나는 지점

	// 멈춘다.
	public void stop() {
		System.out.printf("%s Stop.....", this.name);
	}
}
