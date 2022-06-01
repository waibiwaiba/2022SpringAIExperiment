package Lab1_Knowledge_Representation;
/*
产生式系统法
大致思路：
(1)综合数据库： (M, B, Box, On, H) 
M: 猴子的位置
B： 香蕉的位置
Box: 箱子的位置
On=0: 猴子在地板上
On=1: 猴子在箱子上
H=0: 猴子没有抓到香蕉
H=1: 猴子抓到了香蕉
(2) 初始状态： (A, B, C, 0, 0) 
(3) 结束状态： (B, B, B, 1, 1)
(4) 规则集：
r1: IF (x, y, z, 0, 0) THEN (w, y, z, 0, 0)
r2: IF (x, y, x, 0, 0) THEN (z, y, z, 0, 0)
r3: IF (x, y, x, 0, 0) THEN (x, y, x, 1, 0)
r4: IF (x, y, x, 1, 0) THEN (x, y, x, 0, 0)
r5: IF (x, x, x, 1, 0) THEN (x, x, x, 1, 1)
其中， x, y, z, w 为变量。
解答：
根据具体问题可将规则具体为：
r1: IF (A, B, C, 0, 0) THEN (C, B, C, 0, 0)
r2: IF (C, B, C, 0, 0) THEN (B, B, B, 0, 0)
r3: IF (B ,B, B, 0, 0) THEN (B, B, B, 1, 0)
r5: IF (B, B, B, 1, 0) THEN (B, B, B, 1, 1)
在已知事实下，r1->r2->r3->r5,可得到香蕉

接下来是数据结构的设计，用 Status class来描述当前的状态。
以Status类声明初始状态、当前状态和结束状态。
其内部域有 M,B,Box,On,H，有toString method,能打印出当前信息五元组。
规则集的设计：RuleBase method 里面写五个if判断。
循环打印当前状态信息并根据状态集更新状态，若到达结束阶段，则循环停止。
*/

public class MonkeyPicksBananas {
	public static void main(String[] args) {
		Status initStatus = new Status("A","B","C",0,0);//初始状态
		Status currentStatus=new Status();//当前状态
		currentStatus=initStatus;
		Status finalStatus= new Status("B","B","B",1,1);//结束状态
		System.out.printf("状态五元组：(M, B, Box, On, H) \r\n"
				+ "M: 猴子的位置\r\n"
				+ "B： 香蕉的位置\r\n"
				+ "Box: 箱子的位置\r\n"
				+ "On=0: 猴子在地板上\r\n"
				+ "On=1: 猴子在箱子上\r\n"
				+ "H=0: 猴子没有抓到香蕉\r\n"
				+ "H=1: 猴子抓到了香蕉\r\n"
				+ "(2) 初始状态： (A, B, C, 0, 0) \r\n"
				+ "(3) 结束状态： (B, B, B, 1, 1)\n");
		//需重写equals方法，否则只有当两个Status地址相同才相等
		while(!currentStatus.equals(finalStatus)) {
			System.out.println("当前状态五元组为："+currentStatus.toString());
			currentStatus.RuleBase();//根据状态集更新状态
		}
		System.out.println("当前状态五元组为："+currentStatus.toString());
	}
}
