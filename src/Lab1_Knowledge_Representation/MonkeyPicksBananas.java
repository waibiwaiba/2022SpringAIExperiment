package Lab1_Knowledge_Representation;
/*
����ʽϵͳ��
����˼·��
(1)�ۺ����ݿ⣺ (M, B, Box, On, H) 
M: ���ӵ�λ��
B�� �㽶��λ��
Box: ���ӵ�λ��
On=0: �����ڵذ���
On=1: ������������
H=0: ����û��ץ���㽶
H=1: ����ץ�����㽶
(2) ��ʼ״̬�� (A, B, C, 0, 0) 
(3) ����״̬�� (B, B, B, 1, 1)
(4) ���򼯣�
r1: IF (x, y, z, 0, 0) THEN (w, y, z, 0, 0)
r2: IF (x, y, x, 0, 0) THEN (z, y, z, 0, 0)
r3: IF (x, y, x, 0, 0) THEN (x, y, x, 1, 0)
r4: IF (x, y, x, 1, 0) THEN (x, y, x, 0, 0)
r5: IF (x, x, x, 1, 0) THEN (x, x, x, 1, 1)
���У� x, y, z, w Ϊ������
���
���ݾ�������ɽ��������Ϊ��
r1: IF (A, B, C, 0, 0) THEN (C, B, C, 0, 0)
r2: IF (C, B, C, 0, 0) THEN (B, B, B, 0, 0)
r3: IF (B ,B, B, 0, 0) THEN (B, B, B, 1, 0)
r5: IF (B, B, B, 1, 0) THEN (B, B, B, 1, 1)
����֪��ʵ�£�r1->r2->r3->r5,�ɵõ��㽶

�����������ݽṹ����ƣ��� Status class��������ǰ��״̬��
��Status��������ʼ״̬����ǰ״̬�ͽ���״̬��
���ڲ����� M,B,Box,On,H����toString method,�ܴ�ӡ����ǰ��Ϣ��Ԫ�顣
���򼯵���ƣ�RuleBase method ����д���if�жϡ�
ѭ����ӡ��ǰ״̬��Ϣ������״̬������״̬������������׶Σ���ѭ��ֹͣ��
*/

public class MonkeyPicksBananas {
	public static void main(String[] args) {
		Status initStatus = new Status("A","B","C",0,0);//��ʼ״̬
		Status currentStatus=new Status();//��ǰ״̬
		currentStatus=initStatus;
		Status finalStatus= new Status("B","B","B",1,1);//����״̬
		System.out.printf("״̬��Ԫ�飺(M, B, Box, On, H) \r\n"
				+ "M: ���ӵ�λ��\r\n"
				+ "B�� �㽶��λ��\r\n"
				+ "Box: ���ӵ�λ��\r\n"
				+ "On=0: �����ڵذ���\r\n"
				+ "On=1: ������������\r\n"
				+ "H=0: ����û��ץ���㽶\r\n"
				+ "H=1: ����ץ�����㽶\r\n"
				+ "(2) ��ʼ״̬�� (A, B, C, 0, 0) \r\n"
				+ "(3) ����״̬�� (B, B, B, 1, 1)\n");
		//����дequals����������ֻ�е�����Status��ַ��ͬ�����
		while(!currentStatus.equals(finalStatus)) {
			System.out.println("��ǰ״̬��Ԫ��Ϊ��"+currentStatus.toString());
			currentStatus.RuleBase();//����״̬������״̬
		}
		System.out.println("��ǰ״̬��Ԫ��Ϊ��"+currentStatus.toString());
	}
}
