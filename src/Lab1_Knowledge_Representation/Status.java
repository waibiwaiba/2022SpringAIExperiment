package Lab1_Knowledge_Representation;

public class Status {
	String M;// ����λ��
	String B;// �㽶λ��
	String Box;// ����λ��
	int On;// �����Ƿ�վ��������
	int H;// �����Ƿ��õ����㽶

	Status() {//������

	}

	Status(String M, String B, String Box, int On, int H) {//������
		this.M = M;
		this.B = B;
		this.Box = Box;
		this.On = On;
		this.H = H;
	}

	public String toString()// ���ص�ǰ״̬����Ԫ���ַ���
	{
		return "(" + M + ", " + B + ", " + Box + ", " + On + ", " + H + ")";
	}

	void RuleBase() {//����
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
	//Ҳ������дһ���������������ж�Status�����
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
	//��дequals����
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