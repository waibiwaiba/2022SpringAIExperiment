package Lab1_Knowledge_Representation;

public class Status {
	String M;// 猴子位置
	String B;// 香蕉位置
	String Box;// 箱子位置
	int On;// 猴子是否站在箱子上
	int H;// 猴子是否拿到了香蕉

	Status() {//构造器

	}

	Status(String M, String B, String Box, int On, int H) {//构造器
		this.M = M;
		this.B = B;
		this.Box = Box;
		this.On = On;
		this.H = H;
	}

	public String toString()// 返回当前状态的五元组字符串
	{
		return "(" + M + ", " + B + ", " + Box + ", " + On + ", " + H + ")";
	}

	void RuleBase() {//规则集
		// r1
		if (M.equals("A") && B.equals("B") && Box.equals("C") && On == 0 && H == 0) {
			this.M = "C";
			this.B = "B";
			this.Box = "C";
			this.On = 0;
			this.H = 0;
			return;
		}
		// r2
		if (M.equals("C") && B.equals("B") && Box.equals("C") && On == 0 && H == 0) {
			this.M = "B";
			this.B = "B";
			this.Box = "B";
			this.On = 0;
			this.H = 0;
			return;
		}
		// r3
		if (M.equals("B") && B.equals("B") && Box.equals("B") && On == 0 && H == 0) {
			this.M = "B";
			this.B = "B";
			this.Box = "B";
			this.On = 1;
			this.H = 0;
			return;
		}
		// r5
		if (M.equals("B") && B.equals("B") && Box.equals("B") && On == 1 && H == 0) {
			this.M = "B";
			this.B = "B";
			this.Box = "B";
			this.On = 1;
			this.H = 1;
			return;
		}
	}
	//也可以新写一个方法单独用来判断Status的相等
	boolean equalStatus(Status other) {
		if (this.M != other.M)
			return false;
		if (this.B != other.B)
			return false;
		if (this.Box != other.Box)
			return false;
		if (this.On != other.On)
			return false;
		if (this.H != other.H)
			return false;
		return true;
	}
	//重写equals方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Status other = (Status) obj;
		if (this.M != other.M)
			return false;
		if (this.B != other.B)
			return false;
		if (this.Box != other.Box)
			return false;
		if (this.On != other.On)
			return false;
		if (this.H != other.H)
			return false;
		return true;
	}
}